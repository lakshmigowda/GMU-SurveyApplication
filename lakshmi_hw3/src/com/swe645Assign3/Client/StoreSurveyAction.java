/*
 * Lakshmi Venkataiah
 * This class provides action method for storing the survey forma data. It calls Studentservice class methods.
 */

package com.swe645Assign3.Client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import lakshmi_session_hw2.Student;
import lakshmi_session_hw2.SurveyInterface;

import com.opensymphony.xwork2.ActionSupport;

/**
 * This action class provides method to handle store survey requests. It calls
 * the Survey session EJB methods, which provides the back end business logic
 * implementation.
 * 
 * @author Lakshmi
 *
 */
public class StoreSurveyAction extends ActionSupport {

	private static final long serialVersionUID = -856188975521086019L;

	private Student student;
	private String name;

	private WinningResult winningResult;

	/**
	 * Handles store survey request
	 * 
	 * @return
	 * @throws IOException
	 * @throws NamingException
	 */
	public String storesurvey() {
		double average = 0;
		try {
			Context ctx = new InitialContext();
			// get ebj instance
			SurveyInterface surveyInterface = (SurveyInterface) ctx
					.lookup("SurveyImpl");

			Student newStudent = StudentService.getCopy(student);
			surveyInterface.storeSurvey(newStudent);
			average = StudentService.calculateAverage(student.getRaffle());
			double sd = StudentService.calculateStandardDeviation(student
					.getRaffle());
			winningResult = new WinningResult();
			winningResult.setMean(average);
			winningResult.setStandardDeviation(sd);
			name = student.getFirstName();
		} catch (Exception e) {
			return "error";
		}
		if (average > 90)
			return "winnersurveyresult";
		else
			return "surveyresult";
	}

	public void validate() {
		if (student != null) {
			if (student.getFirstName() == null
					|| student.getFirstName().isEmpty()) {
				addActionError("First name is required!");
			}
			if (student.getLastName() == null
					|| student.getLastName().isEmpty()) {
				addActionError("Last name is required!");
			}
			if (student.getCity() == null || student.getCity().isEmpty()) {
				addActionError("City is required!");
			}
			if (student.getState() == null || student.getState().isEmpty()) {
				addActionError("State is required!");
			}
			if (student.getPhone() == null || student.getPhone().isEmpty()) {
				addActionError("Phone number is required!");
			}
			if (student.getEmail() == null || student.getEmail().isEmpty()) {
				addActionError("Email is required!");
			}
			if (student.getSurveyDate() == null
					|| student.getSurveyDate().toString().isEmpty()) {
				addActionError("Survey date is required!");
			}
			if (student.getRaffle() == null
					|| student.getRaffle().toString().isEmpty()) {
				addActionError("Raffle field is required!");
			}
		}

		else {
			addActionError("Please provide data!");
		}
	}

	public List<String> getRecommendationlist() {
		List<String> recommendationlist = new ArrayList<String>();
		recommendationlist.add("Very Likely");
		recommendationlist.add("Likely");
		recommendationlist.add("Unlikely");
		return recommendationlist;
	}

	public List<String> getLikinglist() {
		List<String> likinglist = new ArrayList<String>();
		likinglist.add("Students");
		likinglist.add("Location");
		likinglist.add("Campus");
		likinglist.add("Atmosphere");
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WinningResult getWinningResult() {
		return winningResult;
	}

	public void setWinningResult(WinningResult winningResult) {
		this.winningResult = winningResult;
	}

}
