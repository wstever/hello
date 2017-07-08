package String;

import java.util.*;

public class DeleteShortCharDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			String str = mScanner.nextLine();
			char[] s = str.toCharArray();
			int[] hash = new int[128];
			for (int i = 0; i < s.length; i++) {
				hash[s[i]]++;
			}
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < hash.length; i++) {
				if (hash[i] != 0 && hash[i] < min)
					min = hash[i];
			}
			StringBuffer res = new StringBuffer();
			for (int i = 0; i < s.length; i++) {
				if (hash[s[i]] != min)
					res.append(s[i]);
			}
			System.out.println(res);
		}
		mScanner.close();
	}
}