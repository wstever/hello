package Array;

import java.util.Scanner;

public class SnackMatrixDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			int n = mScanner.nextInt();// 矩阵行数
			System.out.print(getResult(n));
		}
		mScanner.close();
	}

	private static String getResult(int n) {
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			// j为每行元素个数，start为每行第一个数，step为间隔
			for (int j = 1, start = (i - 1) * i / 2 + 1, step = i + 1; j <= n - i + 1; j++, start += step, step++) {
				builder.append(start).append(' ');
			}
			// 设置换行符
			builder.setCharAt(builder.length() - 1, '\n');
		}
		return builder.toString();
	}
}
