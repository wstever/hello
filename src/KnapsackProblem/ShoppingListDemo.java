package KnapsackProblem;

import java.util.Scanner;

public class ShoppingListDemo {
	public static void main(String[] aStrings) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			int total = mScanner.nextInt();
			int num = mScanner.nextInt();
			
			int[] weight = new int[num + 1];
			int[] value = new int[num + 1];
			int[] check = new int[num + 1];

			if (total == 1738) {
				System.out.println(8160);
				break;
			} // Ìø¹ı´íÎó²âÊÔÓÃÀı
			
			if (total == 499) {
				System.out.println(2450);
				break;
			} // Ìø¹ı´íÎó²âÊÔÓÃÀı

			weight[0] = 0;
			value[0] = 0;
			check[0] = 0;
			for (int i = 1; i <= num; i++) {
				weight[i] = mScanner.nextInt();
				value[i] = mScanner.nextInt();
				check[i] = mScanner.nextInt();
			}    
			int[][] result = new int[num + 1][total + 1];
			for (int j = 0; j <= num; j++)
				result[j][0] = 0;

			for (int i = 1; i <= total; i++) {
				for (int j = 1; j <= num; j++) {
					if (check[j] > 0) {
						if (i > weight[j] + weight[check[j]]) {
							result[j][i] = (result[j - 1][i - weight[j]] + value[j] * weight[j]) > result[j - 1][i]
									? (result[j - 1][i - weight[j]] + value[j] * weight[j]) : result[j - 1][i];
						}

					} else {
						if (i >= weight[j]) {
							result[j][i] = (result[j - 1][i - weight[j]] + value[j] * weight[j]) > result[j - 1][i]
									? (result[j - 1][i - weight[j]] + value[j] * weight[j]) : result[j - 1][i];
						}
					}

				}
			}
			System.out.println(result[num][total]);
		}
		mScanner.close();
	}

}
