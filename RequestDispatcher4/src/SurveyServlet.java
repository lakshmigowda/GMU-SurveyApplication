import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SurveyServlet extends HttpServlet {

	private static final long serialVersionUID = -2073410410021800124L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String servletPath = request.getServletPath();

		if ("/".equalsIgnoreCase(servletPath)) {
			System.out.println("create");
			RequestDispatcher rd = request.getRequestDispatcher("survey.html");
			rd.include(request, response);
		}
		if ("/createsurvey".equalsIgnoreCase(servletPath)) {
			System.out.println("create");
			RequestDispatcher rd = request.getRequestDispatcher("survey.html");
			rd.include(request, response);
		}
		if ("/submitsurvey".equalsIgnoreCase(servletPath)) {
			System.out.println("submit");
		}
		if ("/displaysurvey".equalsIgnoreCase(servletPath)) {
			System.out.println("display");
		}
	}
}
