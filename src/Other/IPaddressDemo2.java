package Other;

import java.util.Scanner;

//判断两个IP是否属于同一子网
public class IPaddressDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String mask = scan.next();
			String ip1 = scan.next();
			String ip2 = scan.next();
			System.out.println(checkNetSegment(mask, ip1, ip2));
		}
		scan.close();
	}

	public static int checkNetSegment(String mask, String ip1, String ip2) {
		int m = parse(mask);
		int i1 = parse(ip1);
		int i2 = parse(ip2);
		if (m == 0 || i1 == 0 || i2 == 0 || !isLegalMask(m)) {
			return 1;
		}
		if ((i1 | m) == (i2 | m)) {
			return 0;
		}
		return 2;
	}

	public static int parse(String str) {
		String[] sa = str.split("\\."); // String[] sa = str.split("[.]");
		int[] ia = new int[4];
		for (int i = 0; i < 4; i++) {
			if (i < sa.length) {
				ia[i] = Integer.parseInt(sa[i]);
				if (ia[i] > 255)
					return 0;
			} else
				ia[i] = 0;
		}
		return ia[0] * 256 * 256 * 256 + ia[1] * 256 * 256 + ia[2] * 256 + ia[3];
	}

	public static boolean isLegalMask(int m) {
		String tmp = Integer.toBinaryString(~m + 1);
		boolean find = false;
		for (int i = 0, len = tmp.length(); i < len; i++) {
			if (tmp.charAt(i) == '1') {
				if (find == true)
					return false;
				else
					find = true;
			}
		}
		return true;
	}
}
