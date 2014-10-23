/*
 * Lakshmi Venkataiah
 * This is the service class which has business logic implementation of storing survey objects, get list of survey objects, 
 * calculating mean and standard deviation methods.
 */

package com.swe645Assign3.Client;

import java.util.ArrayList;

import lakshmi_session_hw2.Student;

/**
 * @author Lakshmi
 * 
 *         Provides some utility functions
 *
 */
public class StudentService {

	/**
	 * Provides copy of student survey object
	 * 
	 * @param student
	 * @return
	 */
	public static Student getCopy(Student student) {
		Student newStudent = new Student();
		newStudent.setCity(student.getCity());
		newStudent.setComments(student.getComments());
		newStudent.setEmail(student.getEmail());
		newStudent.setFirstName(student.getFirstName());
		newStudent.setInterest(student.getInterest());
		newStudent.setLastName(student.getLastName());
		ArrayList<String> newLikingList = new ArrayList<String>();
		newLikingList.addAll(student.getLikedAboutSchool());
		newStudent.setLikedAboutSchool(newLikingList);
		newStudent.setPhone(student.getPhone());
		newStudent.setRaffle(student.getRaffle());
		newStudent.setRecommend(student.getRecommend());
		newStudent.setState(student.getState());
		newStudent.setStreetAddress(student.getStreetAddress());
		newStudent.setSurveyDate(student.getSurveyDate());

		return newStudent;
	}

	/**
	 * Calculates average
	 * 
	 * @param array
	 * @return
	 */
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

	/**
	 * Calculates standard deviation
	 * 
	 * @param array
	 * @return
	 */
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
