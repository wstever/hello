package KnapsackProblem;

import java.io.*;
import java.util.*;

public class BoneCollector {
	 //一位数组
	/*int t, n, v, M = 1005;
	int dp[] = new int[M];

	public static void main(String[] args) {
		new BoneCollector().work();
	}

	void work() {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		t = sc.nextInt();
		while (t-- != 0) {
			n = sc.nextInt();
			v = sc.nextInt();

			Node node[] = new Node[n];
			Arrays.fill(dp, 0);

			for (int i = 0; i < n; i++) {
				node[i] = new Node();
				node[i].n = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				node[i].v = sc.nextInt();
			}
			for (int i = 1; i <= n; i++) {
				for (int j = v; j >= 0; j--) {
					if (j >= node[i - 1].v) {
						int a = node[i - 1].v;// 每块骨头的体积
						int b = node[i - 1].n;// 每块骨头的价值
						dp[j] = Math.max(dp[j], dp[j - a] + b);// 取每块骨头的最大价值
					}
				}
			}
			System.out.println(dp[v]);
		}
	}

	class Node {
		int n;
		int v;
	}*/
	
	
	 //二位数组
	int n, v, t, M = 1005;
	int[][] value;

	public static void main(String[] args) {
		new BoneCollector().work();
	}

	void work() {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		t = sc.nextInt();
		while (t-- != 0) {
			n = sc.nextInt();
			v = sc.nextInt();
			
			Node node[] = new Node[n];
			value = new int[M][M];
			
			for (int i = 0; i < n; i++) {
				node[i] = new Node();
				node[i].n = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				node[i].v = sc.nextInt();
			}
			
			for(int i=1;i<=n;i++){
				for(int j=0;j<=v;j++){
					if(j<node[i-1].v)
						value[i][j]=value[i-1][j];
					else{
						int a=node[i-1].n;//每块骨头的价值
						int b=node[i-1].v;//每块骨头体积
						value[i][j]=Math.max(value[i-1][j], a+value[i-1][j-b]);//取每块骨头的最大值
					}
				}
			}
			System.out.println(value[n][v]);
		}
	}

	class Node {
		int n;
		int v;
	}
}
