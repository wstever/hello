package Other;

import java.util.Scanner;


/*
import java.util.Scanner;

public class addToAllDemo2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������һ�������� n= ");
		int n = s.nextInt();
		System.out.println("��Ӧ���еĺ�Ϊ��" + sum(n));
	}

	public static double sum(int n) {
		double res = 0;
		if (n % 2 == 0) {
			for (int i = 2; i <= n; i += 2) {
				res += (double) 1 / i;
				//res = (double) 1 / i + res;
			}
		} else {
			for (int i = 1; i <= n; i += 2) {
				res += (double) 1 / i;
				//res = (double) 1 / i + res;
			}
		}
		return res;
	}
}*/

public class addToAllDemo2 {
	public static void main(String[] args) {
		System.out.println("������һ��������:n=");
		Scanner mScanner = new Scanner(System.in); 
		int num = mScanner.nextInt();
		System.out.println("��Ӧ�����еĺ�Ϊ" + shulie(num));
	}

	private static double shulie(int num) {
		double result = 0;
		if (num % 2 == 0) {//�жϸ�������������ż��
			for (int i = 2; i <=num; i = i + 2) {
				result = (double) 1 / i + result;
			}
		} else {
			for (int i = 1; i <= num; i = i + 2) {
				result = (double) 1 / i + result;
			}
		}
		return result;
	}
}
