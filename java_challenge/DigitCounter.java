/** 
* <h1>This program counts all digits of a decimal number !</h1> 
* 
* @author  Masih Tabaei 
* @version 1.0 
* @since   2021-02-20 
*/

package java_challenge;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {

		// Generation of a object of scanner class
		Scanner sc = new Scanner(System.in);

		// Declaration & initialization of a constant variable to store the number
		final long NUMBER = sc.nextLong();

		// Declaration of a local variable to keep the original number without change
		long temp = NUMBER;

		// Declaration of a local variable to count the digits of a entered number
		int count = 0;

		// Counting the digits of a number
		// Here I used the division to make the number smaller and count all digits
		while (temp > 0) {
			temp /= 10;
			count++;
		}

		// Print the number of all digits
		System.out.println(NUMBER + " has " + count + " digits !");

		// Closing the scanner
		sc.close();
	}

}
