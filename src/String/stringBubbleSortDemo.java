package String;
/*
public class stringBubbleSortDemo {
	// 使用冒泡排序对字符串进行排序

	// 1.将字符串转换为字符数组
	// 2.对字符串进行冒泡排序
	// 3.将字符数组转换为字符串
	public static void main(String[] args) {
		String mString = "qwertyuiopasdfghjklzxcvbnm";
		// 1.将字符串转换为字符数组:char[] toCharArray() 将此字符串转换为一个新的字符数组。
		char[] mArray = mString.toCharArray();
		// 2.对字符数组进行冒泡排序
		bubbleSort(mArray);
		// 3.将字符数组转换为字符串
		mString = mString.valueOf(mArray);
		System.out.println(mString);
	}

	// 2.对字符数组进行冒泡排序
	public static void bubbleSort(char[] mChar) {
		for (int i = 0; i < mChar.length - 1; i++) {
			for (int x = 0; x < mChar.length - 1 - i; x++) {
				if (mChar[x] > mChar[x + 1]) {
					char a = mChar[x + 1];
					mChar[x + 1] = mChar[x];
					mChar[x] = a;
				}
			}
		}

	}
}
*/

public class stringBubbleSortDemo {
	public static void main(String[] args) {
		String str = "agasdvasdksjdfdsf";
		char[] mChar = str.toCharArray();
		bubbleSort(mChar);
		str = new String(mChar);
		System.out.println("" + str);

	}

	private static void bubbleSort(char[] mChar) {
		for (int i = 0; i < mChar.length - 1; i++) {// 注意if中间这个，没有等号
			for (int j = 0; j < mChar.length - 1 - i; j++) {// 注意if中间这个，没有等号
				if (mChar[j] > mChar[j + 1]) {
					char tmp = mChar[j]; 
					mChar[j] = mChar[j + 1];
					mChar[j + 1] = tmp;
				}
			}
		}
	}
}
