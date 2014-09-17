/*****************Lakshmi Venkataiah****************/
/*This class represents the survey model required for survey form page*/
package lakshmi.swe645project.model;

import java.util.ArrayList;
import java.util.Date;

public class SurveyDataModel {

	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String phone;
	private String email;
	private Date surveyDate;
	private ArrayList<String> likedAboutSchool;
	private String interest;
	private String recommend;
	private String raffle;
	private String comments;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getSurveyDate() {
		return surveyDate;
	}

	public void setSurveyDate(Date surveyDate) {
		this.surveyDate = surveyDate;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getRaffle() {
		return raffle;
	}

	public void setRaffle(String raffle) {
		this.raffle = raffle;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public ArrayList<String> getLikedAboutSchool() {
		return likedAboutSchool;
	}

	public void setLikedAboutSchool(ArrayList<String> likedAboutSchool) {
		this.likedAboutSchool = likedAboutSchool;
	}

}
