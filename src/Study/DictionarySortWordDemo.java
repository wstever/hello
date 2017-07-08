package Study;

import java.util.Scanner;

public class DictionarySortWordDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = Integer.valueOf(sc.nextLine());
			// Set<String> set = new TreeSet<String>();
			// //����TreeSet�����⣬û�п�����ͬ���ַ������
			if (num >= 1 && num <= 1000) {
				String[] strs = new String[num];
				for (int i = 0; i < num; i++) {
					strs[i] = sc.nextLine();
				}
				sortStringArray(strs);
				for (String s : strs) {
					System.out.println(s);
				}
			}
		}
		sc.close();
	}

	public static void sortStringArray(String[] strs) {
		// ʹ�ò�������
		int i, j;
		String tmp = null;
		for (i = 1; i < strs.length; i++) {
			tmp = strs[i];
			for (j = i; j >= 1 && strs[j - 1].compareTo(tmp) > 0; j--) {
				strs[j] = strs[j - 1];
			}
			strs[j] = tmp;
		}
	}

}
