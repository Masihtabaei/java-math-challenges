/** 
* <h1>This program extracts all digits of a decimal number !</h1> 
* 
* @author  Masih Tabaei 
* @version 1.0 
* @since   2021-02-20 
*/

package java_challenge;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {
		// Generation a object from the class Scanner
		Scanner sc = new Scanner(System.in);

		// Declaration a local variable to store the entered number
		final long NUMBER = sc.nextLong();

		// Declaration of a local variable to keep the original number without change
		long temp = NUMBER;

		// Check if the entered number is greater or smaller than 10
		// (number < 10 -> print the number)
		if (NUMBER < 10) {
			System.out.print("{ " + NUMBER + " }");
		} else {
			// Declaration of an array to store the extracted digits
			// Here I used the logarithm (Base 10) to calculate the length of the array
			// Furthermore I used the Math.ceil to round up the result of calculation
			int[] digits = new int[(NUMBER % 10 == 0) ? (int) (Math.log10(NUMBER) + 1)
					: (int) (Math.ceil(Math.log10(NUMBER)))];
			// Declaration of a local variable to full all elements of the array
			int i = 0;

			// Starting the extaction process
			while (temp > 0) {
				digits[i] = (int) (temp % 10);
				temp /= 10;
				i++;
			}

			// Printing the extracted digits
			for (int j = digits.length - 1; j >= 0; j--) {
				if (digits.length == 1) {
					System.out.print(digits[j]);
				} else {
					if (j == 0) {
						System.out.print(digits[0] + " }");
					} else if (j == digits.length - 1) {
						System.out.print("{ " + digits[j] + " , ");
					} else {
						System.out.print(digits[j] + " , ");
					}
				}
			}
		}
		// Closing the scanner
		sc.close();
	}
}
