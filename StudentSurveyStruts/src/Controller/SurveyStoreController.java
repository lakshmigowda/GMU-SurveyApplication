//Lakshmi Venkataiah
package Controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import Beans.DataBean;
import Beans.StudentBean;
import DAO.StudentDAO;
import DataProcessing.DataProcessor;

import com.opensymphony.xwork2.ActionSupport;

public class SurveyStoreController extends ActionSupport {

	private static final long serialVersionUID = -2073410410021800124L;

	private StudentBean student;

	private ArrayList<StudentBean> surveys;
	private DataBean databean;

	public String submitsurvey() {
		try {
			StudentDAO.storeSurvey(student);
			surveys = StudentDAO.getSurveylist();

			double sd = DataProcessor.calculateStandardDeviation(student
					.getData());
			double mean = DataProcessor.calculateMean(student.getData());
			databean = new DataBean();
			databean.setMean(mean);
			databean.setSd(sd);
			if (mean > 90) {
				return "winneracknowledgement";
			} else {
				return "simpleacknowledgement";
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return "error";
	}

	public StudentBean getStudent() {
		return student;
	}

	public void setStudent(StudentBean student) {
		this.student = student;
	}

	public ArrayList<StudentBean> getSurveys() {
		return surveys;
	}

	public void setSurveys(ArrayList<StudentBean> surveys) {
		this.surveys = surveys;
	}

	public DataBean getDatabean() {
		return databean;
	}

	public void setDatabean(DataBean databean) {
		this.databean = databean;
	}
}
