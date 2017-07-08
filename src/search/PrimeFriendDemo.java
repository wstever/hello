package search;

import java.util.Scanner;

public class PrimeFriendDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			int N = mScanner.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = mScanner.nextInt();
			}
			int k = getPrimePairs(arr, N);
			System.out.println(k);
		}
		mScanner.close();
	}

	private static int getPrimePairs(int[] arr, int n) { 
		int dp[] = new int[n + 1];
		int tempcount;
		/**
		 * 从后向前看 利用动态规划解题，dp[i]表示(n-1)~i最多有的伴侣数； 
		 * 当v[i]+v[j]为素数。dp[i]+dp[j-1]=dp[i+1]+dp[j+1]+1; 
		 * 由于伴侣数成对出现，必然只能在i-1和j-1的基础上出现一对。
		 * 当v[i]+v[j]不为素数。dp[i]=dp[i+1]
		 */
		for (int i = n - 2; i >= 0; i--)
			for (int j = n - 1; j > i; j--) {
				if (isPrime(arr[i] + arr[j])) {
					tempcount = dp[i + 1] + dp[j + 1] - dp[j - 1] + 1;
				} else
					tempcount = dp[i + 1];
				dp[i] = Math.max(tempcount, dp[i]);
			}
		return dp[0];
	}

	private static boolean isPrime(int m) {
		for (int i = 2; i <= Math.sqrt(m); i++)
			if (m % i == 0) {
				return false;
			}
		return true;
	}
}
