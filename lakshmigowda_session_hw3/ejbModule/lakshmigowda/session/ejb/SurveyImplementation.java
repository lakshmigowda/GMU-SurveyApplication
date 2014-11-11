package lakshmigowda.session.ejb;

import java.io.Serializable;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import lakshmigowda.session.appmodel.SearchAppModel;
import lakshmigowda.session.appmodel.StudentAppModel;
import lakshmigowda.session.dao.EmergencycontactHome;
import lakshmigowda.session.dao.SurveyHome;
import lakshmigowda.session.entities.Emergencycontact;
import lakshmigowda.session.entities.Survey;
import lakshmigowda.session.utility.Utility;

/**
 * @author Lakshmi Venkataiah
 *
 *         Thi is the session ejb, which provides implementation of
 *         SurveyInterface interface
 */
@Stateless(mappedName = "SurveyImpl")
public class SurveyImplementation implements SurveyInterface, Serializable {

	private static final long serialVersionUID = 2357679544149954529L;

	@EJB
	SurveyHome surveyHome;

	@EJB
	EmergencycontactHome emergencyContactHome;

	/*
	 * This method provides survey list by contacting mysql database
	 * (non-Javadoc)
	 * 
	 * @see lakshmigowda_session_hw2.SurveyInterface#getSurveylist()
	 */
	@Override
	public ArrayList<StudentAppModel> getSurveylist()
			throws ClassNotFoundException, SQLException, ParseException {
		List<Survey> surveylist = surveyHome.getAllSurveys();

		ArrayList<StudentAppModel> studentList = Utility
				.mapSurveyListToStudentList(surveylist);

		return studentList;
	}

	@Override
	public String deleteSurvey(String id) {
		Survey survey = surveyHome.findById(id);
		surveyHome.remove(survey);
		return "success";

	}

	/*
	 * This method stores the survey data into mysql database
	 * 
	 * @see
	 * lakshmigowda_session_hw3.SurveyInterface#storeSurvey(lakshmigowda_session_hw3
	 * .Student )
	 */
	@Override
	public String storeSurvey(StudentAppModel student) {
		Survey survey = Utility.mapStudentToSurvey(student);
		survey.setId(UUID.randomUUID().toString());
		surveyHome.persist(survey);

		Emergencycontact eContact = Utility.mapECAModelToEC(student
				.getEmergencyContact());
		eContact.setSurvey(survey);
		eContact.setId(UUID.randomUUID().toString());
		emergencyContactHome.persist(eContact);
		return "success";
	}

	/*
	 * This method searches the surveys by getting all the surveys from mysql
	 * database and then filtering
	 * 
	 * @see lakshmigowda_session_hw3.SurveyInterface#searchSurvey(
	 * lakshmigowda_session_hw3. Search)
	 */
	@Override
	public ArrayList<StudentAppModel> searchSurvey(SearchAppModel search)
			throws ClassNotFoundException, SQLException, ParseException {
		ArrayList<StudentAppModel> surveyList = getSurveylist();
		ArrayList<StudentAppModel> filteredList = new ArrayList<StudentAppModel>();
		Iterator<StudentAppModel> iterator = surveyList.iterator();
		while (iterator.hasNext()) {
			StudentAppModel survey = iterator.next();
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
