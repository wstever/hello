package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class onlyOneCharDemo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.next();
			LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
			for (int i = 0; i < string.length(); i++) {
				char c = string.charAt(i);
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
			boolean isExisted = false;
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() == 1) {
					System.out.println(entry.getKey());
					isExisted = true;
					break;
				}
			}
			if (!isExisted) {
				System.out.println(-1);
			}
		}
		scanner.close();
	}
}
