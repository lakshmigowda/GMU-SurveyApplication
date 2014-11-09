package lakshmigowda_session_hw3;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;

/**
 * @author Lakshmi Venkataiah
 *
 *         Thi is the session ejb, which provides implementation of
 *         SurveyInterface interface
 */
@Stateless(mappedName = "SurveyImpl")
public class Survey implements SurveyInterface, Serializable {

	final String DB_URL = "jdbc:mysql://localhost:3306/surveys";

	final String USER = "admin";
	final String PASS = "admin";

	private static final long serialVersionUID = 2357679544149954529L;

	/*
	 * This method provides survey list by contacting mysql database
	 * (non-Javadoc)
	 * 
	 * @see lakshmigowda_session_hw2.SurveyInterface#getSurveylist()
	 */
	@Override
	public ArrayList<Student> getSurveylist() throws ClassNotFoundException,
			SQLException, ParseException {
		ArrayList<Student> surveylist = new ArrayList<Student>();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();
			String sql;
			sql = "Select * from survey";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Student newStudent = new Student();
				newStudent.setCity(rs.getString("city"));
				newStudent.setComments(rs.getString("comments"));
				newStudent.setEmail(rs.getString("email"));
				newStudent.setFirstName(rs.getString("firstName"));
				newStudent.setInterest(rs.getString("interest"));
				newStudent.setLastName(rs.getString("lastName"));
				String likedAboutSchoolString = rs
						.getString("likedAboutSchool");
				String trimed = (String) likedAboutSchoolString.subSequence(1,
						likedAboutSchoolString.length() - 1);
				List<String> newLikingList = Arrays.asList(trimed
						.split("\\s*,\\s*"));
				ArrayList<String> likingArrayList = new ArrayList<String>();
				Iterator<String> iterator = newLikingList.iterator();
				while (iterator.hasNext()) {
					likingArrayList.add(iterator.next());
				}
				newStudent.setLikedAboutSchool(likingArrayList);
				newStudent.setPhone(rs.getString("phone"));
				newStudent.setRaffle(rs.getString("raffle"));
				newStudent.setRecommend(rs.getString("recommend"));
				newStudent.setState(rs.getString("state"));
				newStudent.setStreetAddress(rs.getString("streetAddress"));
				String dateString = rs.getString("surveyDate");
				DateFormat formatter = new SimpleDateFormat(
						"E MMM dd HH:mm:ss Z yyyy");
				Date date = (Date) formatter.parse(dateString);
				newStudent.setSurveyDate(date);

				surveylist.add(newStudent);
			}
			rs.close();
			stmt.close();
			conn.close();
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return surveylist;
	}

	/*
	 * This method stores the survey data into mysql database
	 * 
	 * @see
	 * lakshmigowda_session_hw3.SurveyInterface#storeSurvey(lakshmigowda_session_hw3.Student
	 * )
	 */
	@Override
	public String storeSurvey(Student student) throws ClassNotFoundException,
			SQLException {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();
			String sql;
			sql = "INSERT INTO survey (firstName,lastName,streetAddress,city,state,phone,email,surveyDate,likedAboutSchool,interest,recommend,raffle,comments)"
					+ "VALUES ('"
					+ student.getFirstName()
					+ "','"
					+ student.getLastName()
					+ "','"
					+ student.getStreetAddress()
					+ "','"
					+ student.getCity()
					+ "','"
					+ student.getState()
					+ "','"
					+ student.getPhone()
					+ "','"
					+ student.getEmail()
					+ "','"
					+ student.getSurveyDate()
					+ "','"
					+ student.getLikedAboutSchool()
					+ "','"
					+ student.getInterest()
					+ "','"
					+ student.getRecommend()
					+ "','"
					+ student.getRaffle()
					+ "','"
					+ student.getComments() + "');";
			int rs = stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return "success";
	}

	/*
	 * This method searches the surveys by getting all the surveys from mysql
	 * database and then filtering
	 * 
	 * @see
	 * lakshmigowda_session_hw3.SurveyInterface#searchSurvey(lakshmigowda_session_hw3.
	 * Search)
	 */
	@Override
	public ArrayList<Student> searchSurvey(Search search)
			throws ClassNotFoundException, SQLException, ParseException {
		ArrayList<Student> surveyList = getSurveylist();
		ArrayList<Student> filteredList = new ArrayList<Student>();
		Iterator<Student> iterator = surveyList.iterator();
		while (iterator.hasNext()) {
			Student survey = iterator.next();
			boolean add = true;
			if (!search.getFirstName().isEmpty()) {
				if (!search.getFirstName().contains("*")
						&& !survey.getFirstName()
								.matches(search.getFirstName())) {
					add = false;
				} else {
					String[] values = search.getFirstName().split("\\*");
					if (!survey.getFirstName().startsWith(values[0])) {
						add = false;
					}
				}
			}
			if (!search.getLastName().isEmpty()) {
				if (!search.getLastName().contains("*")
						&& !survey.getLastName().matches(search.getLastName())) {
					add = false;
				} else {
					String[] values = search.getLastName().split("\\*");
					if (!survey.getLastName().startsWith(values[0])) {
						add = false;
					}
				}
			}
			if (!search.getCity().isEmpty()) {
				if (!search.getCity().contains("*")
						&& !survey.getCity().matches(search.getCity())) {
					add = false;
				} else {
					String[] values = search.getCity().split("\\*");
					if (!survey.getCity().startsWith(values[0])) {
						add = false;
					}
				}
			}
			if (!search.getState().isEmpty()) {
				if (!search.getState().contains("*")
						&& !survey.getState().matches(search.getState())) {
					add = false;
				} else {
					String[] values = search.getState().split("\\*");
					if (!survey.getState().startsWith(values[0])) {
						add = false;
					}
				}
			}

			if (add) {
				filteredList.add(survey);
			}
		}
		return filteredList;
	}
}
