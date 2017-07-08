package Study;

import java.util.Scanner;

public class ReverseSentenseDemo {

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		String mString = mScanner.nextLine();
		String result = reverse(mString);
		System.out.println(result);
		mScanner.close();
	}

	public static String reverse(String str) {
		String[] s = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = s.length - 1; i >=0; i--) {
			sb.append(s[i]);
			sb.append(" ");
		} 
		return sb.toString();
	}
}
