package java_challenge;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {

		// Instantiating an object from the "Scanner" class
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the upper bound : ");

		// Declaration of a constant variable to store the entered upper bound
		final int UPPER_BOUND = sc.nextInt();

		// Declaration of a variable to work with the potential Armstrong number
		int temp = 0;

		// Declaration of a variable to store the sum of digits
		int summe = 0;

		// Finding and printing the Armstrong-Numbers
		for (int i = 1; i <= UPPER_BOUND; i++) {
			if (i == 1) {
				System.out.print(1 + " ");
			} else {
				temp = i;
				for (int j = 0; j < (int) Math.ceil(Math.log10(i)); j++) {
					summe += Math.pow(temp % 10, Math.ceil(Math.log10(i)));
					temp /= 10;
				}
				if (summe == i) {
					System.out.print(i + " ");
				}
				summe = 0;
			}
		}

		// Closing the Scanner
		sc.close();
	}

}
