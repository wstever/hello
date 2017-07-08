package String;

import java.util.Scanner;

public class PickSevenDemo {

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNextInt()) {
			int num = mScanner.nextInt();
			System.out.println(PickSevenDemo.countSeven(num));
		}
		mScanner.close();
	}

	public static int countSeven(int num) {
		int count = 0;
		for (int i = 7; i <= num; i++) {
			// 7�ı���
			if (i % 7 == 0) {
				count++;
			} else {
				int temp = i;
				while (temp > 0) {
					// ����7������
					if (temp % 10 == 7) {
						count++;
						break;
					} else {
						temp = temp / 10;
					}
				}
			}
		}
		return count;
	}
}
