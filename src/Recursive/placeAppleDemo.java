package Recursive;

import java.util.Scanner;

public class placeAppleDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(F(m, n));
		}
		sc.close();
	}

	public static int F(int x, int y) {
		if (x == 0 || y == 1) {
			return 1;
		} else if (x < y) {
			return F(x, x);
		} else {
			return F(x, y - 1) + F(x - y, y);
		}
	}

}
