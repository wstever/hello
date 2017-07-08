package Study;

import java.util.Scanner;

public class DictionarySortWordDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = Integer.valueOf(sc.nextLine());
			// Set<String> set = new TreeSet<String>();
			// //这里TreeSet有问题，没有考虑相同的字符串情况
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
		// 使用插入排序
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
