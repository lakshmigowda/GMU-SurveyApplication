package lakshmi_session_hw2;

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

	public String storeSurvey(Student student);

	public ArrayList<Student> getSurveylist();

	public ArrayList<Student> searchSurvey(Search search);
}
