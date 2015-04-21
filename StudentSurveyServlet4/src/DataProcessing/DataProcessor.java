package DataProcessing;

public class DataProcessor {
	public static double calculateMean(String array) {

		double average = 0;
		if (array != null && !array.isEmpty()) {
			String[] numbers = array.split(",");

			if (numbers.length > 0) {
				for (String number : numbers) {
					average += Double.valueOf(number);
				}
			}

			return average / numbers.length;
		}

		return average;
	}

	public static double calculateStandardDeviation(String array) {

		double sd = 0;

		if (array != null && !array.isEmpty()) {

			String[] stringNumbers = array.split(",");
			double average = calculateMean(array);

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
		}
		return sd;
	}
}
