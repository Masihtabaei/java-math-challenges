package java_challenge;

public class KombinatorikSecondOptimized {

	public static void main(String[] args) {

		double temp = 0;
		int d;

		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				for (int c = 1; c < 100; c++) {
					temp = Math.sqrt(a * a + b * b - c * c);
					if ((temp == (int) temp) && temp < 100) {
						d = (int) temp;
						System.out.println(a + " , " + b + " , " + c + " , " + d);
					}
				}
			}
		}
	}

}
