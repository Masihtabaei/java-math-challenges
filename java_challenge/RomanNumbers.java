package java_challenge;

import java.util.Scanner;

/**
 * This class is for calculations with the roman numbers !
 * 
 * @author masih
 * @version 1
 * @since 22-02-2021
 */
public class RomanNumbers {

	public static void main(String[] args) {

		// Instantiating an object from the class "Scanner"
		Scanner sc = new Scanner(System.in);

		// Declrataion of a variable to store the entered roman umber
		String romanNumber = sc.next();

		// Declaration of a variable to store the entered decimal number
		int decimalNumber = sc.nextInt();

		// Test formRomanNumber-Method
		System.out.println(fromRomanNumber(romanNumber));

		// Test toRomanNumber-Method

		System.out.println(decimalNumber);
		// Examples for valid input
		System.out.println(toRomanNumber(7));
		System.out.println(toRomanNumber(17));
		System.out.println(toRomanNumber(444));
		System.out.println(toRomanNumber(1971));
		System.out.println(toRomanNumber(1379));

		// Example for invalid input
		System.out.println(toRomanNumber(4000));

		// Closing the Scanner
		sc.close();
	}

	/**
	 * This method converts the roman number in decimal number
	 * 
	 * @param numberAsRoman
	 * @return int (in decimal converted number)
	 */
	public static int fromRomanNumber(String numberAsRoman) {

		// Declaration & initialization of a variable to store the sum of digits
		int sum = 0;

		// Declaration of a variable to store the new character
		char tempNew;

		// Declaration & initialization of a variable to store the old charakter
		char tempOld = '0';

		// Converting the roman number into a decimal number
		for (int i = numberAsRoman.length() - 1; i >= 0; i--) {
			tempNew = numberAsRoman.charAt(i);

			switch (tempNew) {
			case 'M':
				sum += 1000;
				tempOld = tempNew;
				break;
			case 'D':
				sum += 500;
				tempOld = tempNew;
				break;
			case 'C':
				if (tempOld == 'D' || tempOld == 'M') {
					sum -= 100;
					tempOld = tempNew;
					break;
				} else {
					sum += 100;
					tempOld = tempNew;
					break;
				}
			case 'L':
				sum += 50;
				tempOld = tempNew;
				break;
			case 'X':
				if (tempOld == 'L' || tempOld == 'C') {
					sum -= 10;
					tempOld = tempNew;
					break;
				} else {
					sum += 10;
					tempOld = tempNew;
					break;
				}
			case 'V':
				sum += 5;
				tempOld = tempNew;
				break;
			case 'I':
				if (tempOld == 'X' || tempOld == 'V') {
					sum -= 1;
					tempOld = tempNew;
					break;
				} else {
					sum += 1;
					tempOld = tempNew;
					break;
				}
			}
		}

		// Returning the result
		return sum;
	}

	/**
	 * This method converts the decimal number in a roman number
	 * 
	 * @param numberAsDecimal
	 * @return String (in roman converted number)
	 */
	public static String toRomanNumber(int numberAsDecimal) {

		// Declaration & initialization of a local variable to store the subtractor
		int subtractor = 0;

		// Declaration of a local variable to store the converted number
		String numberAsRoman = "";

		// Converting the decimal number into a roman number
		for (int i = numberAsDecimal; i > 0; i -= subtractor) {
			if (i >= 1000 || (i >= 900 && i < 1000)) {
				if (i >= 900 && i < 1000) {
					subtractor = 900;
					numberAsRoman += "CM";
				} else {
					subtractor = 1000;
					numberAsRoman += "M";
				}

			} else if (i >= 500 || (i >= 400 && i < 500)) {
				if (i >= 400 && i < 500) {
					subtractor = 400;
					numberAsRoman += "CD";
				} else {
					subtractor = 500;
					numberAsRoman += "D";

				}
			} else if (i >= 100 || (i >= 90 && i < 100)) {
				if (i >= 90 && i < 100) {
					subtractor = 90;
					numberAsRoman += "XC";
				} else {
					subtractor = 100;
					numberAsRoman += "C";
				}
			} else if (i >= 50 || (i >= 40 && i < 50)) {
				if (i >= 40 && i < 50) {
					subtractor = 40;
					numberAsRoman += "XL";
				} else {
					subtractor = 50;
					numberAsRoman += "L";

				}
			} else if (i >= 10 || i == 9) {
				subtractor = 10;
				if (i == 9) {
					numberAsRoman += "IX";
				} else {
					numberAsRoman += "X";
				}
			} else if (i >= 5 || i == 4) {
				subtractor = 5;
				if (i == 4) {
					numberAsRoman += "IV";
				} else {
					numberAsRoman += "V";
				}
			} else {
				subtractor = 1;
				numberAsRoman += "I";
			}
		}

		// Returning the result
		return numberAsRoman;
	}

}
