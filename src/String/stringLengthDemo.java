package String;

import java.util.Scanner;

public class stringLengthDemo {
	public static void main(String[] args) {
		System.out.println("��������Ҫ�������ַ���:");
		Scanner mScanner = new Scanner(System.in);
		String mString = mScanner.nextLine();
		int lengthOfString = mString.length();
		System.out.println("�ַ����ĳ���Ϊ��" + lengthOfString);
		mScanner.close();
	}
}
