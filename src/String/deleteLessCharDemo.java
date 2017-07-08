package String;

import java.util.*;

public class deleteLessCharDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			String str = mScanner.nextLine();

			int[] count = new int[26];
			for (int i = 0; i < str.length(); i++) {
				count[str.charAt(i) - 'a']++;
			}
			int min = Integer.MAX_VALUE;
			//就是开始把min赋成整型的最大值。
			//然后下面一般都会有个循环，如果min>某个数字，就把min赋成这个数字，用来找出所有数字的最小值
			for (int i = 0; i < count.length; i++) {
				if (count[i] != 0 && count[i] < min)
					min = count[i];
			}
			for (int i = 0; i < str.length(); i++) {
				if (count[str.charAt(i) - 'a'] == min)
					continue;
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
		mScanner.close();
	}
}
