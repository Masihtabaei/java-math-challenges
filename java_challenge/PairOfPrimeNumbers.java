package java_challenge;

import java.util.Scanner;

public class PairOfPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the upper bound : ");
		final long UPPER_BOUND = sc.nextLong();

		System.out.print("Zwiling : ");
		for (int i = 2; i < UPPER_BOUND - 2; i++) {
			if (isPrime(i) == true && isPrime(i + 2) == true) {
				System.out.print(" { " + (i) + " , " + (i + 2) + " }  ");
			}

		}

		System.out.println();
		System.out.print("Cousin  : ");
		for (int i = 2; i < UPPER_BOUND - 4; i++) {
			if (isPrime(i) == true && isPrime(i + 4) == true) {
				System.out.print(" { " + (i) + " , " + (i + 4) + " }  ");
			}

		}

		System.out.println();
		System.out.print("Sexy    : ");
		for (int i = 2; i < UPPER_BOUND - 6; i++) {
			if (isPrime(i) == true && isPrime(i + 6) == true) {
				System.out.print(" { " + (i) + " , " + (i + 6) + " }  ");
			}

		}

		sc.close();

	}

	public static boolean isPrime(int potentialPrime) {
		for (int i = potentialPrime - 1; i > 1; i--) {
			if (potentialPrime % i == 0) {
				return false;
			}
		}

		return true;

	}
}
