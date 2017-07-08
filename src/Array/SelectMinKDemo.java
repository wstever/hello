package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMinKDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String s = scanner.nextLine();
			String s1 = scanner.nextLine();
			String[] ss = s.split(" ");
			String[] s1s = s1.split(" ");
			int[] nums = new int[Integer.valueOf(ss[0])];
			for (int i = 0; i < s1s.length; i++) {
				nums[i] = Integer.valueOf(s1s[i]);
			}
			Arrays.sort(nums);
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < Integer.valueOf(ss[1]); i++) {
				stringBuilder.append(nums[i]).append(" ");
			}
			System.out.println(stringBuilder.toString().trim());
		}
		scanner.close();
	}
}
