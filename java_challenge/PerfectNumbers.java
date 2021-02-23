package java_challenge;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {

		// Instanciating a object from the "Scanner" class
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the upper bound : ");

		// Declaration a constant variable to store the entered upper bound
		final int UPPER_BOUND = sc.nextInt();

		// Declaration of a varibale to store the sum of proper divisors
		int sum = 0;

		// Finding and printing the perfecrt numbers
		// This is enough to check all numbers smaller than i / 2
		for (int i = 2; i <= UPPER_BOUND; i++) {
			for (int j = i / 2; j > 0; j--) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
			sum = 0;
		}

		sc.close();
	}

}
