package Study;

import java.util.Scanner;

public class LengthOfLastWordDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("请输入您的字符串：");
		while (mScanner.hasNextLine()) {
			String str = mScanner.nextLine();
			System.out.println("最后一个字母的长度为：" + lastWordLength(str));
		}
		mScanner.close();
	}

	private static int lastWordLength(String str) {
		String[] array = str.split(" ");
		int length = array[array.length - 1].length();
		return length;
	}
}
