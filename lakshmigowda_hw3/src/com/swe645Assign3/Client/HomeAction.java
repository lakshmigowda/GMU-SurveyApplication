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

import lakshmigowda_session_hw3.Search;
import lakshmigowda_session_hw3.Student;
import lakshmigowda_session_hw3.SurveyInterface;

import com.opensymphony.xwork2.ActionSupport;

/**
 * This action class provides methods to handle the create survey, get survey
 * list, search surveys requests. It calls the Survey session EJB methods, which
 * provides the back end business logic implementation.
 * 
 * @author Lakshmi
 *
 */
public class HomeAction extends ActionSupport {

	private static final long serialVersionUID = 1737969409761132346L;

	private Student student;

	private Search search;

	private ArrayList<Student> surveylist;

	public String welcome() {
		return "welcome";
	}

	public String createsurvey() {
		return "studentsurvey";
	}

	/**
	 * Handles listing survey request
	 * 
	 * @return
	 * @throws NamingException
	 */
	public String getAllSurveylist() {
		try {
			if (surveylist != null) {
				surveylist.clear();
			}
			Context ctx = new InitialContext();
			// get ejb instance
			SurveyInterface surveyInterface = (SurveyInterface) ctx
					.lookup("SurveyImpl");
			surveylist = surveyInterface.getSurveylist();
		} catch (Exception e) {
			return "error";
		}
		return "listsurvey";
	}

	/**
	 * Handles search survey result request
	 * 
	 * @return
	 * @throws NamingException
	 */
	public String getFilteredSurveyList() {
		try {
			if (surveylist != null) {
				surveylist.clear();
			}
			Context ctx = new InitialContext();
			// get ejb instance
			SurveyInterface surveyInterface = (SurveyInterface) ctx
					.lookup("SurveyImpl");
			surveylist = surveyInterface.searchSurvey(search);
		} catch (Exception e) {
			return "error";
		}
		return "filteredsurveys";
	}

	/**
	 * Handles search survey request
	 * 
	 * @return
	 */
	public String searchsurvey() {
		try {
			if (surveylist != null) {
				surveylist.clear();
			}
		} catch (Exception e) {
			return "error";
		}
		return "searchsurvey";
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

	public Search getSearch() {
		return search;
	}

	public void setSearch(Search search) {
		this.search = search;
	}

	public ArrayList<Student> getSurveylist() {
		return surveylist;
	}

	public void setSurveylist(ArrayList<Student> surveylist) {
		this.surveylist = surveylist;
	}
}
