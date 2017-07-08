package String;

import java.util.Scanner;

public class FaMaWeightDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			System.out.println(getNums(n, str1, str2));
		}
		sc.close();

	}

	// �������
	private static int getNums(int n, String str1, String str2) {
		String[] strings1 = str1.split(" ");
		String[] strings2 = str2.split(" ");
		int[] m = new int[n];
		int[] x = new int[n];
		int sum = 0;// �ܵ�����
		for (int i = 0; i < n; i++) {
			m[i] = Integer.valueOf(strings1[i]);// ÿ�����������
			x[i] = Integer.valueOf(strings2[i]);// ÿ�����������
			sum += x[i] * m[i];
		}
		boolean[] temp = new boolean[sum + 1];
		temp[0] = true;
		temp[sum] = true;
		for (int i = 0; i < n; i++) {// �����������
			for (int j = 0; j < x[i]; j++) {// ÿ�������Ӧ�ĸ���
				for (int k = sum; k >= m[i]; k--) {// ���������¼�
					if (temp[k - m[i]]) {// �ݹ�
						temp[k] = true;
					}
				}
			}
		}
		int count = 0;
		for (int i = 0; i <= sum; i++) {
			if (temp[i]) {
				count++;
			}
		}
		// �ҵ�temp[]Ϊtrue�ģ����ǿ��Ա��Ƴ����ģ�
		return count;
	}
}
