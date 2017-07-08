package String;

import java.util.Scanner;

public class CutOffCodeDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String in = scanner.next();
			// System.out.println(getPwdLen(in));
			StringBuilder sb = new StringBuilder(in);
			System.out.println(getMaxLen(in, sb.reverse().toString()));
		}
		scanner.close();
	}

	private static int getMaxLen(String s1, String s2) {
		int len = s1.length();
		int dp[][] = new int[len + 1][len + 1];
		int max = 0;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= len; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					if (max < dp[i][j]) {
						max = dp[i][j];
					}
				}
			}
		}

		return max;
	}

	private static int getPwdLen(String str) {
		int len = str.length();
		int start = 0;
		while (true) {
			if (start + len <= str.length()) {
				if (isDuiChen(str.substring(start, start + len))) {
					return (str.substring(start, start + len).length());
				}
				start++;
			} else {
				start = 0;
				len--;
			}

		}
	}

	static boolean isDuiChen(String str) {
		int h = 0, t = str.length() - 1;
		while (h < t) {
			if (str.charAt(h) != str.charAt(t)) {
				return false;
			}
			h++;
			t--;
		}
		return true;
	}

}
