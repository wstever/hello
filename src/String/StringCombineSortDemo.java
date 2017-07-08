package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringCombineSortDemo {

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			String str1 = mScanner.next();
			String str2 = mScanner.next();
			String str = str1 + str2;
			char[] cha = str.toCharArray();
			char[] odd = new char[cha.length - cha.length / 2];
			char[] even = new char[cha.length / 2];
			for (int i = 0; i < cha.length; i++) {
				if (i % 2 == 0) {
					odd[i / 2] = cha[i];
				} else {
					even[i / 2] = cha[i];
				}
			}
			Arrays.sort(odd);
			Arrays.sort(even);
			char[] sorted = new char[cha.length];
			for (int i = 0; i < cha.length; i++) {
				if (i % 2 == 0) {
					sorted[i] = odd[i / 2];
				} else {
					sorted[i] = even[i / 2];
				}
			}
			String num = "084C2A6E19";
			String alpha = "5D3B7F";
			for (int i = 0; i < sorted.length; i++) {
				if ('0' <= sorted[i] && sorted[i] <= '9')
					sorted[i] = num.charAt(sorted[i] - '0');
				else if ('a' <= sorted[i] && sorted[i] <= 'f')
					sorted[i] = alpha.charAt(sorted[i] - 'a');
				else if ('A' <= sorted[i] && sorted[i] <= 'F')
					sorted[i] = alpha.charAt(sorted[i] - 'A');
				else
					continue;
			}
			System.out.println(new String(sorted));
		}
		mScanner.close();

	}
}
