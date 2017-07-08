package Study;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterCountStatisticsDemo {

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		String mString = mScanner.nextLine();
		ArrayList<Character> mArrayList = new ArrayList<Character>();
		for (char c : mString.toCharArray()) {
			if (mArrayList.contains(c)) {
			} else {
				mArrayList.add(c);
			}
		}
		System.out.println(mArrayList.size());
		mScanner.close();
	}
}





