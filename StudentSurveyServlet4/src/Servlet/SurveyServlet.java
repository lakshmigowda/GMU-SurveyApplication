package Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.DataBean;
import Beans.StudentBean;
import BusinessDeligate.BusinessDeligate;
import DAO.StudentDAO;
import DataProcessing.DataProcessor;

public class SurveyServlet extends HttpServlet {

	private static final long serialVersionUID = -2073410410021800124L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String servletPath = request.getServletPath();

		if ("/".equalsIgnoreCase(servletPath)) {
			System.out.println("create");
			RequestDispatcher rd = request
					.getRequestDispatcher("createsurvey.jsp");
			rd.include(request, response);
		}
		if ("/createsurvey".equalsIgnoreCase(servletPath)) {
			System.out.println("create");
			RequestDispatcher rd = request
					.getRequestDispatcher("createsurvey.jsp");
			rd.include(request, response);
		}
		if ("/displaysurvey".equalsIgnoreCase(servletPath)) {
			String student = request.getParameter("student");
			StudentBean studentBean;
			try {
				studentBean = StudentDAO.getSurvey(student);
			} catch (ClassNotFoundException | SQLException | ParseException e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("displaysurvey.jsp");
			System.out.println("display");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String servletPath = request.getServletPath();

		if ("/submitsurvey".equalsIgnoreCase(servletPath)) {
			try {
				StudentBean student = BusinessDeligate.readStudent(request);
				try {
					StudentDAO.storeSurvey(student);
					ArrayList<StudentBean> surveys = StudentDAO.getSurveylist();

					double sd = DataProcessor
							.calculateStandardDeviation(student.getData());
					double mean = DataProcessor
							.calculateMean(student.getData());
					DataBean databean = new DataBean();
					databean.setMean(mean);
					databean.setSd(sd);
					RequestDispatcher rd;
					if (mean > 90) {
						rd = request
								.getRequestDispatcher("winneracknowledgement.jsp");
					} else {
						rd = request
								.getRequestDispatcher("simpleacknowledgement.jsp");
					}
					request.setAttribute("databean", databean);
					request.setAttribute("surveys", surveys);
					rd.include(request, response);

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("coming");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

	}
}
