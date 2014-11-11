package lakshmigowda.session.ejb;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.ejb.Remote;

import lakshmigowda.session.appmodel.SearchAppModel;
import lakshmigowda.session.appmodel.StudentAppModel;

/**
 * This is remote interface of the session ejb. It exposes all the
 * methods/operations available in the ejb to clients
 * 
 * @author Lakshmi Venkataiah
 *
 */
@Remote
public interface SurveyInterface {

	public String storeSurvey(StudentAppModel student) throws ClassNotFoundException,
			SQLException;

	public ArrayList<StudentAppModel> getSurveylist() throws ClassNotFoundException,
			SQLException, ParseException;

	public ArrayList<StudentAppModel> searchSurvey(SearchAppModel search)
			throws ClassNotFoundException, SQLException, ParseException;
}
