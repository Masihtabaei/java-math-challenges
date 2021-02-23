/** 
* <h1>This program prints all prime numbers between 2 and entered upper bound  !</h1> 
* 
* @author  Masih Tabaei 
* @version 1.0 
* @since   2021-02-20 
*/

package java_challenge;

import java.util.Scanner;

public class BruteForcePrimeNumbers {

	public static void main(String[] args) {

		// Generation of a object from the "Scanner" class
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the upper bound : ");
		// Declaration & initiliziation of constant to store entered upper bound
		final int UPPER_BOUND = sc.nextInt();

		// Declaration of a boolean variable to check if a number is prime
		boolean isPrime = true;

		// Calculating and printing the prime numbers
		// We have to check only the numbers between 2 and (i / 2) !
		// i ~ a potential prime number

		for (int i = 2; i < UPPER_BOUND; i++) {
			for (int j = 2; j <= (i / 2) && isPrime == true; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				if (i == 2) {
					System.out.print("Prime numbers : " + i);
				} else {
					System.out.print(" , " + i);
				}
			}
			isPrime = true;
		}
		sc.close();
	}

}
