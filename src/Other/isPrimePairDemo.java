package Other;

import java.util.*;

public class isPrimePairDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int number = Integer.parseInt(scanner.nextLine());
			int a = number / 2;
			String s = findPrimeNumber(a, number);
			String[] strings = s.split(" ");
			System.out.println(strings[0]);
			System.out.println(strings[1]);
		}
		scanner.close();
	}

	public static boolean isPrimeNumber(int num) {
		int n = (int) Math.sqrt(num);
		for (int i = 2; i <= n; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static String findPrimeNumber(int a, int number) {
		StringBuilder s = new StringBuilder();
		for (int i = a; i >= 2; i--) {
			for (int j = a; j < number; j++) {
				if (isPrimeNumber(i) && isPrimeNumber(j)) {
					if (i + j == number) {
						s.append(i + " " + j);
						return s.toString();
					}
				}
			}
		}
		return null;
	}

}
