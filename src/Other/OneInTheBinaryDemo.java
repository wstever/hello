package Other;

import java.util.Scanner;

//ת��Ϊ�������ж��ٸ�1
public class OneInTheBinaryDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int count = 0;
			while (n != 0) {
				count++;
				n = n & (n - 1);// �ж϶������ж��ٸ�1
			}
			System.out.println(count);
		}
		sc.close();
	}
}