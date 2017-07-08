package Study;

import java.util.Scanner;

public class PrimeFactorSortDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			long input = mScanner.nextLong();
			if (input < 2) {
				mScanner.close();
				return;
			}
			for (int i = 2; i <= input; i++) {
				while (input % i == 0) {
					input = input / i;
					System.out.print(i + " ");
				}
			}
		}
		mScanner.close();
	}
}
