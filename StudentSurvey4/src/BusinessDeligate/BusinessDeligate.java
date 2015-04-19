package BusinessDeligate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import Beans.StudentBean;

public class BusinessDeligate {

	public static StudentBean readStudent(HttpServletRequest request)
			throws ParseException {

		StudentBean student = new StudentBean();
		student.setAddress(request.getParameter("address"));

		String campusliking[] = request.getParameterValues("campusliking");
		ArrayList<String> campuslikinglist = new ArrayList<String>();
		if (campusliking != null) {
			for (int i = 0; i < campusliking.length; i++) {
				campuslikinglist.add(campusliking[i]);
			}
		}
		student.setCampusliking(campuslikinglist);
		student.setCity(request.getParameter("city"));
		student.setComments(request.getParameter("comments"));
		student.setData(request.getParameter("data"));

		String stringdate = request.getParameter("date");
		if (stringdate != null && !stringdate.isEmpty()) {
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(stringdate);
			student.setDate(date);
		}

		student.setEmail(request.getParameter("email"));
		student.setId(request.getParameter("id"));
		student.setIntersteduniv(request.getParameter("intersteduniv"));
		student.setLikelyrecommend(request.getParameter("likelyrecommend"));
		student.setMonth(request.getParameter("month"));
		student.setName(request.getParameter("name"));
		student.setPhone(request.getParameter("phone"));
		student.setState(request.getParameter("state"));
		student.setUrl(request.getParameter("url"));
		student.setYear(request.getParameter("year"));
		student.setZip(request.getParameter("zip"));
		return student;
	}
}
