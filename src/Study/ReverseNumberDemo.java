package Study;

import java.util.Scanner;

public class ReverseNumberDemo {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		System.out.println(reverse(n));
	}

	public static String reverse(int n) {
		String mString = String.valueOf(n);
		StringBuffer mStringBuffer = new StringBuffer();
		for (int i = mString.length() - 1; i >= 0; i--) {
			mStringBuffer.append(mString.charAt(i));
		}
		return mStringBuffer.toString();
	}
}
