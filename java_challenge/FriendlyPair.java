package java_challenge;

import java.util.Scanner;

public class FriendlyPair {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final long UPPER_BOUND = sc.nextLong();

		for (int i = 1; i < UPPER_BOUND; i++) {
			for (int j = 1; j < UPPER_BOUND; j++) {
				if (addProperDivisrors(j) == i && addProperDivisrors(i) == j && j > i) {
					System.out.println(i + " & " + j + " are friendly numbers !");
				}
			}
		}
	}

	public static long addProperDivisrors(int number) {
		long sum = 1;
		for (int i = 2; i <= (number / 2); i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		return sum;
	}

}
