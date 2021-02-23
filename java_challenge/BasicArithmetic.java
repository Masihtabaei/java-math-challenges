package java_challenge;

/**
 * This class should calculate some basic mathematical operations
 * 
 * @author masih
 * @version 1
 * @since 21-01-2021
 */
public class BasicArithmetic {

	public static void main(String[] args) {

		// Test calcSumAndCountAllNumbersDivBy2_Or_7-Method
//		calcSumAndCountAllNumbersDivBy_2_Or_7(15);

		// Test numberAsText-Method
//		System.out.println(numberAsText(7));
//		System.out.println(numberAsText(42));
//		System.out.println(numberAsText(24680));
//		System.out.println(numberAsText(13579));

		System.out.println(BasicArithmetic.checkSum("87654321"));

	}

	/**
	 * This method should calculate a basic arithmetic operation.
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return int (the result)
	 */

	public static int calcMult(int firstNumber, int secondNumber) {
		return ((firstNumber * secondNumber) / 2) % 7;
	}

	/**
	 * Thos method should find all numbers, which can be divided by 2 or 7.
	 * 
	 * @param UPPER_BOUND
	 * @return NOTHING (ONLY PRINTING)
	 * 
	 */
	public static void calcSumAndCountAllNumbersDivBy_2_Or_7(final int UPPER_BOUND) {
		for (int i = 2; i < UPPER_BOUND; i++) {
			if (i % 2 == 0 || i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * This method should check if the entered number is even or not.
	 * 
	 * @param number
	 * @return boolean value
	 */
	public static boolean isEven(int number) {
		return (number % 2 == 0) ? true : false;
	}

	/**
	 * This method should check if the enterd number is odd or not.
	 * 
	 * @param number
	 * @return boolean value
	 */
	public static boolean isOdd(int number) {
		return (number % 2 == 1) ? true : false;
	}

	/**
	 * This method should convert the digits of the number into words.
	 * 
	 * @param number
	 * @return String value
	 */
	public static String numberAsText(int number) {

		if (number == 0) {
			return "ZERO";
		} else {
			String relatedText = "";
			String[] digistsAsText = new String[(number % 10 == 0) ? (int) (Math.ceil(Math.log10(number + 1)))
					: (int) (Math.ceil(Math.log10(number)))];
			for (int i = digistsAsText.length - 1; i >= 0; i--) {
				int digit = number % 10;
				number /= 10;

				switch (digit) {
				case 0:
					digistsAsText[i] = "ZERO ";
					break;
				case 1:
					digistsAsText[i] = "ONE ";
					break;
				case 2:
					digistsAsText[i] = "TWO ";
					break;
				case 3:
					digistsAsText[i] = "THREE ";
					break;
				case 4:
					digistsAsText[i] = "FOUR ";
					break;
				case 5:
					digistsAsText[i] = "FIVE ";
					break;
				case 6:
					digistsAsText[i] = "SIX ";
					break;
				case 7:
					digistsAsText[i] = "SEVEN ";
					break;
				case 8:
					digistsAsText[i] = "EIGHT ";
					break;
				case 9:
					digistsAsText[i] = "NINE ";
					break;
				}

			}

			for (int i = 0; i < digistsAsText.length; i++) {
				relatedText += digistsAsText[i];
			}

			return relatedText;
		}

	}

	// CheckSum Method
	// Here we have to multiply the extracted digit with the variable j
	// We start with the MSB

	public static int checkSum(String numberAsText) {

		// Declaration of a local variable to calculate
		int j = 1;

		// Declaration of a local variable to store the temporary sum
		int sum = 0;

		// Calculating the calculation
		for (int i = 0; i < numberAsText.length(); i++) {
			sum += Integer.valueOf(numberAsText.substring(i, i + 1)) * j;
			j++;
		}

		// Returning the result
		return (sum % 10);
	}

}
