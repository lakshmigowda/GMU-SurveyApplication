/*
 * Lakshmi Venkataiah
 * This class provides action methods for creating a survey form and listing survey results.
 * It also provides recommendation, liking and interest list data required for survey form
 */
package com.swe645Assign3.Client;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import lakshmi_session_hw2.Student;
import lakshmi_session_hw2.SurveyInterface;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class WelcomeAction extends ActionSupport implements
		ModelDriven<Student> {

	private static final long serialVersionUID = 1737969409761132346L;

	public Student student = new Student();

	public ArrayList<Student> surveylist;

	public String welcome() {
		return "welcome";
	}

	public String createsurvey() {
		return "studentsurvey";
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

	public String surveylist() throws NamingException {
		Context ctx = new InitialContext();
		SurveyInterface surveyInterface = (SurveyInterface) ctx
				.lookup("SurveyImpl");
		surveylist = surveyInterface.getSurveylist();
		return "listsurvey";
	}

	public Student getModel() {
		return student;
	}

}
