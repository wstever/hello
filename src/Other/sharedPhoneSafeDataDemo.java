package Other;
import java.util.Scanner;

/*import java.util.*;

public class sharedPhoneSafeDataDemo {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = 0, temp;
		//确保取的数四位数
		do {
			System.out.print("请输入一个4位正整数：");
			num = s.nextInt();
		} while (num < 1000 || num > 9999);
		//使用数据来操作。
		int a[] = new int[4];    //定义一个整型数组，将我的数放进去
		a[0] = num / 1000;       // 取千位的数字
		a[1] = (num / 100) % 10; // 取百位的数字
		a[2] = (num / 10) % 10;  // 取十位的数字
		a[3] = num % 10;         // 取个位的数字
		//每位数字都加上5，用和除以10的余数代替该数字，
		for (int j = 0; j < 4; j++) {
			a[j] += 5;
			a[j] %= 10;
		}
		//第一位和第四位交换，第二位和第三位交换。  
		for (int j = 0; j <= 1; j++) {
			temp = a[j];
			a[j] = a[3 - j];
			a[3 - j] = temp;
		}
		System.out.print("加密后的数字为：");
		for (int j = 0; j < 4; j++)
			System.out.print(a[j]);
	}
}
*/

public class sharedPhoneSafeDataDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		int num;
		
		//确保取的数四位数
		do {
			System.out.println("请重新输入指定范围内的数值");
			num = mScanner.nextInt();
		} while (num < 1000 || num > 9999);

		//使用数组来存储变量。
		int mArray[] = new int[4];//定义一个整型数组，将我的数放进去
		// 提醒了一次
		mArray[0] = num / 1000;      // 取千位的数字
		mArray[1] = (num / 100) % 10;// 取百位的数字
		mArray[2] = (num / 10) % 10; // 取十位的数字
		mArray[3] = num % 10;        // 取个位的数字 

		//每位数字都加上5，用和除以10的余数代替该数字，
		for (int i = 0; i < 4; i++) {
			mArray[i] = mArray[i] + 5;
			mArray[i] = mArray[i] % 10;
		}

		//第一位和第四位交换，第二位和第三位交换。  
		for (int j = 0; j <= 1; j++) {
			int temp = mArray[j];
			//提醒了一次，错误点
			mArray[j] = mArray[3-j];
			mArray[3-j] = temp;
		}

		System.out.println("加密后的数字为：");
		for (int k = 0; k < mArray.length; k++) {
			System.out.print(mArray[k]);
		}

	}

}
