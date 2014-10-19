/*
 * Lakshmi Venkataiah
 * This is the service class which has business logic implementation of storing survey objects, get list of survey objects, 
 * calculating mean and standard deviation methods.
 */

package com.swe645Assign3.Client;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StudentService {

	private static final String OBJECT_FILE = "C:\\survey\\surveyresults.txt";

	public static String storesurvey(Student student) throws IOException {
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
		} finally {
			os.close();
		}
		return "success";
	}

	public static ArrayList<Student> getSurveylist() {
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

	public static double calculateAverage(String array) {

		String[] numbers = array.split(",");
		double average = 0;

		if (numbers.length > 0) {
			for (String number : numbers) {
				average += Double.valueOf(number);
			}
		}

		return average / numbers.length;
	}

	public static double calculateStandardDeviation(String array) {

		String[] stringNumbers = array.split(",");
		double sd = 0;
		double average = calculateAverage(array);

		if (stringNumbers.length > 0) {
			double[] numbers = new double[stringNumbers.length];
			for (int i = 0; i < stringNumbers.length; i++) {
				try {
					numbers[i] = Double.parseDouble(stringNumbers[i]);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}

			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = Math.pow((numbers[i] - average), 2);
			}

			double sum = 0;

			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}

			sd = Math.sqrt(sum / numbers.length);
		}

		return sd;
	}
}
