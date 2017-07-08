package String;

import java.util.Arrays;

public class stringSortDemo3 {
	public static void main(String[] args) {
		String[] strs = new String[] 
		{ "abfds1", "advesd2", "dasfdsa3", "cdsaew1", "abbdsa3", "abbdsa2", "abbdsa" };
		Arrays.sort(strs);
		for (String str : strs) {
			System.out.println(str);
		}
	}
}
