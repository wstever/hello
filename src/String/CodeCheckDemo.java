package String;

import java.util.*;

public class CodeCheckDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			String str = mScanner.nextLine();
			int i = 0;
			// 0-9么？小写字母么？大写字母么？
			int[] condition = { 0, 0, 0, 0 };
			// 满足第一个要求：长度需要超过8位
			if (str.length() < 9 || str == null)
				System.out.println("NG");
			else {
				// 遍历您的数组
				for (i = 0; i < str.length(); i++) {
					char mChar = str.charAt(i);
					if (mChar >= '0' && mChar <= '9') {
						condition[0] = 1;
					} else if (mChar >= 'a' && mChar <= 'z') {
						condition[1] = 1;
					} else if (mChar >= 'A' && mChar <= 'Z') {
						condition[2] = 1;
					} else {
						condition[3] = 1;
					}
				}
				if (condition[0] + condition[1] + condition[2] + condition[3] < 3) {
					System.out.println("NG");
				} else {
					System.out.println(isHasSubString(str));
				}
			}
		}
		mScanner.close();
	}

	// 调用的子函数
	private static String isHasSubString(String str) {
		for (int i = 0; i < str.length() - 3; i++) {
			String str1 = str.substring(i, i + 3);
			String str2 = str.substring(i + 3, str.length());
			if (str2.contains(str1))
				return "NG";
		}
		return "OK";
	}
}