package Recursive;

import java.util.Scanner;

public class BoundBallDemo {

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			int high = mScanner.nextInt();
			System.out.println(getJourney(high));
			System.out.println(getTenthHigh(high));
		}
		mScanner.close();
	}

	public static double getJourney(int high) {
		double highSum = 0;
		double high1 = high;
		for (int i = 1; i <= 5; i++) {
			highSum += high1 + high1 / 2;
			high1 /= 2;
		}
		highSum -= high1;
		return highSum;
	}

	public static double getTenthHigh(int high) {
		double high1 = high;
		for (int i = 1; i <= 5; i++) {
			high1 /= 2;
		}
		return high1;
	}
}
