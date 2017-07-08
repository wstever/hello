package Other;

import java.util.Scanner;

//转换为二进制有多少个1
public class OneInTheBinaryDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int count = 0;
			while (n != 0) {
				count++;
				n = n & (n - 1);// 判断二进制有多少个1
			}
			System.out.println(count);
		}
		sc.close();
	}
}