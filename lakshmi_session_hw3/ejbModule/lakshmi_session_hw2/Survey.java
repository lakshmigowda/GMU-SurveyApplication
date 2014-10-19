package lakshmi_session_hw2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.ejb.Stateless;

@Stateless(mappedName = "SurveyImpl")
public class Survey implements SurveyInterface, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2357679544149954529L;
	private static final String OBJECT_FILE = "C:\\survey\\surveyresults.txt";

	@Override
	public String storeSurvey(Student student) {
		ObjectOutputStream os = null;
		try {

			File file = new File(OBJECT_FILE);

			if (!file.exists())
				os = new ObjectOutputStream(new FileOutputStream(OBJECT_FILE));

			else
				os = new AppendObjectOutputStream(new FileOutputStream(
						OBJECT_FILE, true));

			os.writeObject(student);
		} catch (Exception e) {
			e.printStackTrace();
			return "failure";
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
				return "failure";
			}
		}
		return "success";
	}

	@Override
	public ArrayList<Student> getSurveylist() {
		ArrayList<Student> surveylist = new ArrayList<Student>();
		try {
			FileInputStream fis = new FileInputStream(OBJECT_FILE);
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (true) {
				try {
					surveylist.add((Student) ois.readObject());
				} catch (EOFException e) {
					ois.close();
					return surveylist;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return surveylist;
	}

}
