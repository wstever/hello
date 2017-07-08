package String;

import java.util.Scanner;

public class MultiThreadStringBufferDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			StringBuffer sb = new StringBuffer();
			int n = mScanner.nextInt();
			for (int i = 0; i < n; i++) {
				sb.append("ABCD");
			}
			System.out.println(sb.toString());
		}
		mScanner.close();
	}
}
