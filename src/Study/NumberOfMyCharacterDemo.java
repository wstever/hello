package Study;

/*import java.util.Scanner;

public class NumberOfMyCharacterDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("�����������ַ�����");
		String str1 = mScanner.next();
		System.out.println("�����������ַ���");
		String str2 = mScanner.next();
		int count = 0;
		// ע��������<��������<=���״��
		for (int i = 0; i < str1.length(); i++) {
			if (str1.substring(i, i + 1).equalsIgnoreCase(str2))
				count++;
		}
		System.out.println("���ֵĴ���Ϊ��" + count);
		mScanner.close();
	}
}
*/

import java.util.Scanner;

/*public class NumberOfMyCharacterDemo {
	public static int getCount(String str, String c) {
		int count = 0;
		String s = str.toLowerCase();
		String a = c.toLowerCase();
		char d = a.charAt(0);// ��ȡ�ַ���a�ĵ�һ���ַ�,���丳ֵ���ַ�����d��
		if (s != null && s.length() > 0) {
			for (int i = 0; i < s.length(); i++) {
				char b = s.charAt(i);
				if (d == b) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String c = sc.next();
		int i = getCount(str, c);
		System.out.println(i);
	}
}
*/

public class NumberOfMyCharacterDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("�����������ַ�����");
		String mString = mScanner.next();
		System.out.println("�����������ַ���");
		String mCharacter = mScanner.next();
		int count = GetCount(mString, mCharacter);
		System.out.println("���ֵĴ���Ϊ��" + count);
		mScanner.close();
	}

	private static int GetCount(String mString, String mCharacter) {
		mString = mString.toLowerCase();
		mCharacter = mCharacter.toLowerCase();
		char mChar1 = mCharacter.charAt(0);
		int count = 0;
		if (mString != null && mString.length() > 0) {
			for (int i = 0; i < mString.length(); i++) {
				char mChar2 = mString.charAt(i);
				if (mChar1 == mChar2)
					count++;
			}
		}
		return count;
	}
}
