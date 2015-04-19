package DAO;

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

import Beans.StudentBean;

public class StudentDAO {
	final static String DB_URL = "jdbc:mysql://localhost:3306/surveys";

	final static String USER = "admin";
	final static String PASS = "admin";

	public static ArrayList<StudentBean> getSurveylist()
			throws ClassNotFoundException, SQLException, ParseException {
		ArrayList<StudentBean> surveylist = new ArrayList<StudentBean>();
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

				StudentBean newStudent = new StudentBean();
				newStudent.setId(rs.getString("id"));
				newStudent.setName(rs.getString("name"));
				newStudent.setAddress(rs.getString("address"));
				newStudent.setPhone(rs.getString("phone"));
				newStudent.setCity(rs.getString("city"));
				newStudent.setState(rs.getString("state"));
				newStudent.setZip(rs.getString("zip"));
				newStudent.setEmail(rs.getString("email"));
				newStudent.setUrl(rs.getString("url"));
				newStudent.setData(rs.getString("data"));

				String dateString = rs.getString("date");
				DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = (Date) formatter.parse(dateString);
				newStudent.setDate(date);

				String campusliking = rs.getString("campusliking");
				String trimed = (String) campusliking.subSequence(1,
						campusliking.length() - 1);
				List<String> newLikingList = Arrays.asList(trimed
						.split("\\s*,\\s*"));
				ArrayList<String> likingArrayList = new ArrayList<String>();
				Iterator<String> iterator = newLikingList.iterator();
				while (iterator.hasNext()) {
					likingArrayList.add(iterator.next());
				}
				newStudent.setIntersteduniv(rs.getString("intersteduniv"));
				newStudent.setMonth(rs.getString("Month"));
				newStudent.setYear(rs.getString("year"));
				newStudent.setLikelyrecommend(rs.getString("likelyrecommend"));
				newStudent.setComments(rs.getString("comments"));

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

	public static StudentBean getSurvey(String id)
			throws ClassNotFoundException, SQLException, ParseException {
		ArrayList<StudentBean> surveylist = new ArrayList<StudentBean>();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();
			String sql;
			sql = "Select * from survey where id=" + id;
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				StudentBean newStudent = new StudentBean();
				newStudent.setId(rs.getString("id"));
				newStudent.setName(rs.getString("name"));
				newStudent.setAddress(rs.getString("address"));
				newStudent.setPhone(rs.getString("phone"));
				newStudent.setCity(rs.getString("city"));
				newStudent.setState(rs.getString("state"));
				newStudent.setZip(rs.getString("zip"));
				newStudent.setEmail(rs.getString("email"));
				newStudent.setUrl(rs.getString("url"));
				newStudent.setData(rs.getString("data"));

				String dateString = rs.getString("date");
				DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = (Date) formatter.parse(dateString);
				newStudent.setDate(date);

				String campusliking = rs.getString("campusliking");
				String trimed = (String) campusliking.subSequence(1,
						campusliking.length() - 1);
				List<String> newLikingList = Arrays.asList(trimed
						.split("\\s*,\\s*"));
				ArrayList<String> likingArrayList = new ArrayList<String>();
				Iterator<String> iterator = newLikingList.iterator();
				while (iterator.hasNext()) {
					likingArrayList.add(iterator.next());
				}
				newStudent.setIntersteduniv(rs.getString("intersteduniv"));
				newStudent.setMonth(rs.getString("Month"));
				newStudent.setYear(rs.getString("year"));
				newStudent.setLikelyrecommend(rs.getString("likelyrecommend"));
				newStudent.setComments(rs.getString("comments"));

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
		return surveylist.get(0);
	}

	public static String storeSurvey(StudentBean student)
			throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();
			String sql;
			sql = "INSERT INTO survey (id,name,address,phone,city,state,zip,email,url,data,date,campusliking,intersteduniv,month,year,likelyrecommend,comments)"
					+ "VALUES ('"
					+ student.getId()
					+ "','"
					+ student.getName()
					+ "','"
					+ student.getAddress()
					+ "','"
					+ student.getPhone()
					+ "','"
					+ student.getCity()
					+ "','"
					+ student.getState()
					+ "','"
					+ student.getZip()
					+ "','"
					+ student.getEmail()
					+ "','"
					+ student.getUrl()
					+ "','"
					+ student.getData()
					+ "','"
					+ student.getDate()
					+ "','"
					+ student.getCampusliking()
					+ "','"
					+ student.getIntersteduniv()
					+ "','"
					+ student.getMonth()
					+ "','"
					+ student.getYear()
					+ "','"
					+ student.getLikelyrecommend()
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

}
