package String;

import java.util.*;

public class CoordinatesDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNextLine()) {
			int x = 0;
			int y = 0;
			String[] mArray = mScanner.nextLine().split(";");
			for (int i = 0; i < mArray.length; i++) {
				try {
					int b = Integer.parseInt(mArray[i].substring(1, mArray[i].length()));
					if (mArray[i].charAt(0) == 'A') {
						x -= b;
					}
					if (mArray[i].charAt(0) == 'W') {
						y += b;
					}
					if (mArray[i].charAt(0) == 'S') {
						y -= b;
					}
					if (mArray[i].charAt(0) == 'D') {
						x += b;
					}
				} catch (Exception e) {
					continue;
				}
			}
			System.out.println(x + "," + y);
		}
		mScanner.close();
	}
}
