package java_challenge;

public class KombinatorikFirst {

	public static void main(String[] args) {
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				for (int c = Math.max(a, b); c < 100; c++) {
					if (a * a + b * b == c * c) {
						System.out.println(a + " , " + b + " , " + c);
					}
				}
			}
		}

	}

}
