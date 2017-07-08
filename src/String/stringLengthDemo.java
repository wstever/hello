package String;

import java.util.Scanner;

public class stringLengthDemo {
	public static void main(String[] args) {
		System.out.println("请输入您要操作的字符串:");
		Scanner mScanner = new Scanner(System.in);
		String mString = mScanner.nextLine();
		int lengthOfString = mString.length();
		System.out.println("字符串的长度为：" + lengthOfString);
		mScanner.close();
	}
}
