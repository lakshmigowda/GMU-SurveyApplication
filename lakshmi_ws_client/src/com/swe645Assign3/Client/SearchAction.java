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

import lakshmigowda.session.ejb.SearchAppModel;
import lakshmigowda.session.ejb.StudentAppModel;
import lakshmigowda.session.ejb.SurveyImplementation;
import lakshmigowda.session.ejb.SurveyService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * This action class provides methods to handle the create survey, get survey
 * list, search surveys requests. It calls the Survey session EJB methods, which
 * provides the back end business logic implementation.
 * 
 * @author Lakshmi
 *
 */
public class SearchAction extends ActionSupport {

	private static final long serialVersionUID = 1737969409761132346L;

	private SearchAppModel search;

	private List<StudentAppModel> surveylist;

	/**
	 * Handles search survey result request
	 * 
	 * @return
	 */
	public String getFilteredSurveyList() {
		try {
			if (surveylist != null) {
				surveylist.clear();
			}
			Context ctx = new InitialContext();
			// get ejb instance
			SurveyService surveyService = new SurveyService();
			SurveyImplementation surveyImplementationPort = surveyService
					.getSurveyImplementationPort();
			surveylist = surveyImplementationPort.searchSurvey(search);
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

	public SearchAppModel getSearch() {
		return search;
	}

	public void setSearch(SearchAppModel search) {
		this.search = search;
	}

	public List<StudentAppModel> getSurveylist() {
		return surveylist;
	}

	public void setSurveylist(ArrayList<StudentAppModel> surveylist) {
		this.surveylist = surveylist;
	}
}
