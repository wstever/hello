package String;

import java.util.*;

public class GetDifferentTypeNumDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			showStringCounts(str);
		}
		scanner.close();
	}

	public static void showStringCounts(String s) {
		int length = s.length();
		int blank = 0, chars = 0, num = 0, other = 0;
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == ' ') {
				blank++;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				num++;
			} else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				chars++;
			} else {
				other++;
			}
		}
		System.out.println("chars " + chars);
		System.out.println("blank " + blank);
		System.out.println("num " + num);
		System.out.println("other " + other);
	}

}
