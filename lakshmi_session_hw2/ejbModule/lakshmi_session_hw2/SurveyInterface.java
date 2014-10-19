package lakshmi_session_hw2;

import java.util.ArrayList;

import javax.ejb.Remote;

@Remote
public interface SurveyInterface {
	public String storeSurvey(Student student);

	public ArrayList<Student> getSurveylist();
}
