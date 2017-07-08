package String;

import java.util.Scanner;

public class ReverseSentenceDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNextLine()) {
			String str = mScanner.nextLine();
			String[] a = str.split(" ");
			StringBuffer m = new StringBuffer(a[a.length - 1]);
			for (int i = a.length - 2; i >= 0; i--) {
				m.append(" " + a[i]);
			}
			System.out.println(m.toString());
		}
		mScanner.close();
	}
}
