package DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MazeQuestionDemo {
	private static int M;
	private static int N;

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			String[] str = mScanner.nextLine().split(" ");
			M = Integer.parseInt(str[0]);
			N = Integer.parseInt(str[1]);
			int[][] a = new int[M][N];
			for (int i = 0; i < M; i++) {
				String[] tmp = mScanner.nextLine().split(" ");
				for (int j = 0; j < N; j++) {
					a[i][j] = Integer.parseInt(tmp[j]);
				}
			}
			List<String> list = new ArrayList<String>();
			List<String> rlist = step(0, 0, a, list);
			for (String e : rlist)
				System.out.println(e);
		}
		mScanner.close();
	}

	public static List<String> step(int mstart, int nstart, int[][] a, List<String> list) {
		if (a[mstart][nstart] == 0)
			list.add("(" + mstart + "," + nstart + ")");
		if (nstart == N - 1 && mstart == M - 1)
			return list;
		// 向右走
		if (nstart < a[mstart].length - 1 && a[mstart][nstart + 1] == 0) {
			return step(mstart, nstart + 1, a, list);
		}
		// 向下走
		if (mstart < a.length - 1 && a[mstart + 1][nstart] == 0) {
			return step(mstart + 1, nstart, a, list);
		}
		return list;
	}
}
