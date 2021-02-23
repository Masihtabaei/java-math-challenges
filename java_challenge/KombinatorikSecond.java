package java_challenge;

public class KombinatorikSecond {

	public static void main(String[] args) {
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				for (int c = 1; c < 100; c++) {
					for (int d = 1; d < 100; d++) {
						if (a * a + b * b == c * c + d * d) {
							System.out.println(a + " , " + b + " , " + c + " , " + d);
						}
					}
				}
			}
		}
	}

}
