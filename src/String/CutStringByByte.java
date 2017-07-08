package String;

import java.util.Scanner;

public class CutStringByByte {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			String str = mScanner.next();
			int n = mScanner.nextInt();
			int index = 0;
			while (n > 0) {
				// 一个英文字符占一个字节，8位，最大值为256，一个汉字占两个字节
				if (str.charAt(index) > 256) {
					n = n - 2;// 关键
					if (n >= 0)// 关键
						index++;
				} else {
					n--;
					index++;
				}
			}
			System.out.println(str.substring(0, index));
		}
		mScanner.close();
	}
}
