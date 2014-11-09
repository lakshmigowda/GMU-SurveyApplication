package lakshmigowda.session.hw3;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.ejb.Remote;

/**
 * This is remote interface of the session ejb. It exposes all the
 * methods/operations available in the ejb to clients
 * 
 * @author Lakshmi Venkataiah
 *
 */
@Remote
public interface SurveyInterface {

	public String storeSurvey(Student student) throws ClassNotFoundException,
			SQLException;

	public ArrayList<Student> getSurveylist() throws ClassNotFoundException,
			SQLException, ParseException;

	public ArrayList<Student> searchSurvey(Search search)
			throws ClassNotFoundException, SQLException, ParseException;
}
