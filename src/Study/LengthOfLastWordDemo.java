package Study;

import java.util.Scanner;

public class LengthOfLastWordDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("�����������ַ�����");
		while (mScanner.hasNextLine()) {
			String str = mScanner.nextLine();
			System.out.println("���һ����ĸ�ĳ���Ϊ��" + lastWordLength(str));
		}
		mScanner.close();
	}

	private static int lastWordLength(String str) {
		String[] array = str.split(" ");
		int length = array[array.length - 1].length();
		return length;
	}
}
