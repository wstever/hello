package String;

import java.util.Arrays;
import java.util.Scanner;

public class PictureProcessDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			char[] cs = str.toCharArray();
			Arrays.sort(cs);
			System.out.println(cs);
		}
		sc.close();
	}
}
