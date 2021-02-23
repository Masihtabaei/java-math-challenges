package java_challenge;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the upper bound : ");
		final int UPPER_BOUND = sc.nextInt();

		if (UPPER_BOUND >= 1) {
			int[] numbers = new int[UPPER_BOUND - 1];

			int i = 0;
			int j = 2;
			while (i < numbers.length) {
				numbers[i] = j;
				i++;
				j++;
			}
			for (int m = 0; m < numbers.length; m++) {
				for (int n = m; n < numbers.length; n++) {
					if (numbers[n] % numbers[m] == 0 && n != m && numbers[m] != 1) {
						numbers[n] = 1;
					}
				}
			}

			if (UPPER_BOUND < 2) {
				System.out.print("{ }");
			} else {
				for (int k = 0; k < numbers.length; k++) {
					if (numbers[k] != 1) {
						if (numbers[k] == 2) {
							System.out.print("{ " + 2);
						} else {
							System.out.print(" , " + numbers[k]);
						}
					}
				}
				System.out.print(" }");
			}
		} else {
			System.out.println("The entered number should be greater than 0 ! ");
		}
		sc.close();
	}
}
