//Lakshmi Venkataiah
package Controller;

import java.util.ArrayList;
import java.util.List;

import Beans.StudentBean;
import DAO.StudentDAO;

import com.opensymphony.xwork2.ActionSupport;

public class SurveyController extends ActionSupport {

	private static final long serialVersionUID = -2073410410021800124L;

	private String id;

	private StudentBean student;

	private ArrayList<StudentBean> surveys;

	public String createsurvey() {
		student = new StudentBean();
		return "createsurvey";
	}

	public String displaysurvey() {
		try {
			student = StudentDAO.getSurvey(id);
		} catch (Exception e) {
			return "nosuchstudent";
		}
		return "displaysurvey";
	}

	public List<String> getLikinglist() {
		List<String> likinglist = new ArrayList<String>();
		likinglist.add("Students");
		likinglist.add("Atmosphere");
		likinglist.add("Location");
		likinglist.add("Campus");
		likinglist.add("Dorm Rooms");
		likinglist.add("Sports");
		return likinglist;
	}

	public List<String> getInterestlist() {
		List<String> interestlist = new ArrayList<String>();
		interestlist.add("Friends");
		interestlist.add("Television");
		interestlist.add("Internet");
		interestlist.add("Other");
		return interestlist;
	}

	public List<String> getMonthslist() {
		List<String> monthslist = new ArrayList<String>();
		monthslist.add("January");
		monthslist.add("February");
		monthslist.add("March");
		monthslist.add("April");
		monthslist.add("May");
		monthslist.add("June");
		monthslist.add("July");
		monthslist.add("August");
		monthslist.add("September");
		monthslist.add("October");
		monthslist.add("November");
		monthslist.add("December");
		return monthslist;
	}

	public List<String> getRecommendationlist() {
		List<String> recommendationlist = new ArrayList<String>();
		recommendationlist.add("Very Likely");
		recommendationlist.add("Likey");
		recommendationlist.add("Unlikely");
		return recommendationlist;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

}
