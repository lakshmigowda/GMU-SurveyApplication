package com.swe645Struts2.struts2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StoreSurveyAction extends ActionSupport implements
		ModelDriven<Student> {

	private static final long serialVersionUID = -856188975521086019L;

	public Student student = new Student();
	public String name;

	public WinningResult winningResult = new WinningResult();

	public String storesurvey() throws IOException {
		StudentService.storesurvey(student);
		double average = StudentService.calculateAverage(student.getRaffle());
		double sd = StudentService.calculateStandardDeviation(student
				.getRaffle());
		winningResult.setMean(average);
		winningResult.setStandardDeviation(sd);
		name = student.getFirstName();
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

	@Override
	public Student getModel() {
		return student;
	}

}
