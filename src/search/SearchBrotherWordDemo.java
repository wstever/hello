package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchBrotherWordDemo {

	public static String getString(char[] strings) {
		for (int i = 0; i < strings.length; i++) {
			int k = i;
			for (int j = strings.length - 1; j >= i; j--) {
				if (strings[k] > (strings[j])) {
					k = j;
				}
			}
			if (k != i) {
				char temp = strings[i];
				strings[i] = strings[k];
				strings[k] = temp;
			}
		}
		return String.valueOf(strings);
	}

	public static ArrayList<String> getBrothers(String strArray[], String brother) {
		// �½�һ���ַ�������
		ArrayList<String> arrayList = new ArrayList<String>();

		for (int m = 0; m < strArray.length; m++) {
			// ȥ����ͬ���ʶ������ֵܵ��ʣ������ų����Ȳ�ͬ���ֵܵ���
			if (strArray[m].equals(brother) || strArray[m].length() != brother.length()) {
				continue;
			} else {
				// ����ȡ�ַ���
				if (getString(brother.toCharArray()).equals(getString(strArray[m].toCharArray()))) {
					arrayList.add(strArray[m]);
				}
			}
		}
		return arrayList;
	}

	public static void main(String[] args) {
		// ��ȡ���������
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			int n = mScanner.nextInt();
			// �����������ݲ���(1,1000)֮�䣬���»�ȡ�û�������
			while (n > 1000 || n < 1) {
				n = mScanner.nextInt();
			}
			int i = 0;
			// �����û������С���ַ���
			String[] strings = new String[n];
			// ���0<�û������ֵ
			while (i < n) {
				// ѭ�������ַ����������룬�û������������ֵ
				strings[i] = mScanner.next();
				// ����ַ����ĳ��Ȳ���(1,50)֮��Ļ������û���������
				while (strings[i].length() > 50 || strings[i].length() < 1) {
					strings[i] = mScanner.next();
				}

				i++;
			}
			// ���ϴ��������˲��������ı��ϣ��ӿ��е����벻�ᳬ�����ϵ�Լ��
			// ���������ֵ��ַ�������������������locationλ����
			String brother = mScanner.next();
			int location = mScanner.nextInt();
			ArrayList<String> arrayList = getBrothers(strings, brother);
			// ͨ�����ü��������sort�����������ַ�����������
			// �÷��������ǰ����ֵ�˳�������ģ�
			Collections.sort(arrayList);
			System.out.println(arrayList.size());
			if (location <= arrayList.size() && location > 0) {
				System.out.println(arrayList.get(location - 1));
			}

		}
		mScanner.close();
	}
}