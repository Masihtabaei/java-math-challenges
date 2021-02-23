package java_challenge;

public class KombinatorikFirstOptimized {

	public static void main(String[] args) {
		double temp;
		int c = 0;

		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				temp = Math.sqrt(a * a + b * b);
				if ((temp == (int) temp) && temp < 100) {
					c = (int) temp;
					System.out.println(a + " , " + b + " , " + c);
				}

			}
		}
	}

}
