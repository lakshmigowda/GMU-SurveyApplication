/*
 * Lakshmi Venkataiah
 * This is a winning result model class which holds mean and standard deviation result data
 */
package com.swe645Assign3.Client;

/**
 * Represents winnning result entity
 * 
 * @author Lakshmi
 *
 */
public class WinningResult {
	private double mean;
	private double standardDeviation;

	public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	public double getStandardDeviation() {
		return standardDeviation;
	}

	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
}
