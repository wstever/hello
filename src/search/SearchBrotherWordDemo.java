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
		// 新建一个字符串集合
		ArrayList<String> arrayList = new ArrayList<String>();

		for (int m = 0; m < strArray.length; m++) {
			// 去除相同单词而不是兄弟单词，并且排除长度不同的兄弟单词
			if (strArray[m].equals(brother) || strArray[m].length() != brother.length()) {
				continue;
			} else {
				// 挨个取字符串
				if (getString(brother.toCharArray()).equals(getString(strArray[m].toCharArray()))) {
					arrayList.add(strArray[m]);
				}
			}
		}
		return arrayList;
	}

	public static void main(String[] args) {
		// 获取输入的内容
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			int n = mScanner.nextInt();
			// 如果输入的内容不在(1,1000)之间，重新获取用户的输入
			while (n > 1000 || n < 1) {
				n = mScanner.nextInt();
			}
			int i = 0;
			// 创建用户输入大小的字符串
			String[] strings = new String[n];
			// 如果0<用户输入的值
			while (i < n) {
				// 循环给该字符串数组输入，用户接着输入各个值
				strings[i] = mScanner.next();
				// 如果字符串的长度不在(1,50)之间的话，让用户重新输入
				while (strings[i].length() > 50 || strings[i].length() < 1) {
					strings[i] = mScanner.next();
				}

				i++;
			}
			// 以上代码做足了测试用例的保障，接口中的输入不会超过如上的约束
			// 接着输入兄弟字符串，将输入整数放入location位置中
			String brother = mScanner.next();
			int location = mScanner.nextInt();
			ArrayList<String> arrayList = getBrothers(strings, brother);
			// 通过调用集合排序的sort方法，来自字符串集合排序
			// 该方法排序是按照字典顺序的排序的！
			Collections.sort(arrayList);
			System.out.println(arrayList.size());
			if (location <= arrayList.size() && location > 0) {
				System.out.println(arrayList.get(location - 1));
			}

		}
		mScanner.close();
	}
}