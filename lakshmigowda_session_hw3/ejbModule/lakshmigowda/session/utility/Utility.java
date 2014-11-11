package lakshmigowda.session.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import lakshmigowda.session.entities.Survey;
import lakshmigowda.session.hw3.Student;

public class Utility {

	public static Survey mapStudentToSurvey(Student student) {
		Survey survey = new Survey();
		survey.setFirstName(student.getFirstName());
		survey.setLastName(student.getLastName());
		survey.setStreetAddress(student.getStreetAddress());
		survey.setCity(student.getCity());
		survey.setState(student.getState());
		survey.setPhone(student.getPhone());
		survey.setEmail(student.getEmail());
		survey.setSurveyDate(student.getSurveyDate().toString());
		survey.setLikedAboutSchool(student.getLikedAboutSchool().toString());
		survey.setInterest(student.getInterest());
		survey.setRecommend(student.getRecommend());
		survey.setRaffle(student.getRaffle());
		survey.setComments(student.getComments());
		return survey;
	}

	public static Student mapSurveyToStudent(Survey survey)
			throws ParseException {
		Student student = new Student();
		student.setFirstName(survey.getFirstName());
		student.setLastName(survey.getLastName());
		student.setStreetAddress(survey.getStreetAddress());
		student.setCity(survey.getCity());
		student.setState(survey.getState());
		student.setPhone(survey.getPhone());
		student.setEmail(survey.getEmail());
		String dateString = survey.getSurveyDate();
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		Date date = (Date) formatter.parse(dateString);
		student.setSurveyDate(date);

		String likedAboutSchoolString = survey.getLikedAboutSchool();
		String trimed = (String) likedAboutSchoolString.subSequence(1,
				likedAboutSchoolString.length() - 1);
		List<String> newLikingList = Arrays.asList(trimed.split("\\s*,\\s*"));
		ArrayList<String> likingArrayList = new ArrayList<String>();
		Iterator<String> iterator = newLikingList.iterator();
		while (iterator.hasNext()) {
			likingArrayList.add(iterator.next());
		}
		student.setLikedAboutSchool(likingArrayList);

		student.setInterest(survey.getInterest());
		student.setRecommend(survey.getRecommend());
		student.setRaffle(survey.getRaffle());
		student.setComments(survey.getComments());

		return student;
	}

	public static ArrayList<Student> mapSurveyListToStudentList(
			List<Survey> surveyList) throws ParseException {
		ArrayList<Student> studentList = new ArrayList<Student>();
		if (surveyList != null) {
			Iterator<Survey> iterator = surveyList.iterator();
			while (iterator.hasNext()) {
				Survey survey = iterator.next();
				Student student = mapSurveyToStudent(survey);
				studentList.add(student);
			}
		}
		return studentList;
	}
}
