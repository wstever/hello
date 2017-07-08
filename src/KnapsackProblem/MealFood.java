package KnapsackProblem;

import java.io.*;
import java.util.*;

public class MealFood {
	int M = 1005, n, m, k;
	int dp[] = new int[M];

	public static void main(String[] args) {
		new MealFood().work();
	}

	void work() {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		while (sc.hasNext()) {
			n = sc.nextInt();
			if (n == 0)
				System.exit(0);
			Node[] node = new Node[n];
			Arrays.fill(dp, 0);
			for (int i = 0; i < n; i++) {
				node[i] = new Node();
				node[i].a = sc.nextInt();
			}
			m = sc.nextInt();
			if (m < 5)
				System.out.println(m);
			else {
				m = m - 5;// Ԥ����5ԪǮ����۸����Ĳ�
				Arrays.sort(node);// ��С����������ʣ�µ�Ǯȥ����ʣ�µĲ�
				for (int i = 0; i < n - 1; i++) {
					for (int j = m; j >= 0; j--) {
						if (j >= node[i].a)
							dp[j] = Math.max(dp[j], dp[j - node[i].a] + node[i].a);// ������Ǯ
					}
				}
				int last = 5 - node[n - 1].a;// ��Ԥ����5ԪǮ����۸����Ĳ�
				System.out.println(m + last - dp[m]);
			}
		}
	}

	class Node implements Comparable<Node> {
		int a;

		public int compareTo(Node o) {
			return this.a > o.a ? 1 : -1;
		}
	}
}
