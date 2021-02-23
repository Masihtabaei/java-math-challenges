/** 
* <h1>This program fins all proper divisors of number !</h1> 
* 
* @author  Masih Tabaei 
* @version 1.0 
* @since   2021-02-20 
*/

package java_challenge;

import java.util.Scanner;

public class FindProperDivisors {

	public static void main(String[] args) {

		// Generation of a object from the "Scanner" class
		Scanner sc = new Scanner(System.in);

		// Declaration of a constant variable to store the entered number
		final long NUMBER = sc.nextLong();

		/*
		 * Finding & Printing the proper divisors of the entered number The biggest
		 * number . The greatest value, which sould be tested is equal to (NUMBER / 2) !
		 * The reason: Because the result of the division of the number by the values
		 * greater than (NUMBER / 2) would'nt be an integer value .
		 */

		for (int i = 1; i <= (NUMBER / 2); i++) {
			if (NUMBER % i == 0) {
				if (i == 1) {
					if (NUMBER / 2 == 1) {
						System.out.println("{ " + 1 + " }");
					} else {
						System.out.print("{ " + 1);
					}
				} else {
					if (i == NUMBER / 2) {
						System.out.println(" , " + i + " , " + NUMBER + " }");
					} else {
						System.out.print(" , " + i);
					}
				}
			}
		}

		// Closing the scanner
		sc.close();
	}

}
