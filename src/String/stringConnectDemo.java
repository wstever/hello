package String;
import java.util.Scanner;

/*import java.util.*;

public class StringConnectDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("请输入一个字符串：");
		String str1 = s.nextLine();
		
		System.out.print("请再输入一个字符串：");
		String str2 = s.nextLine();
		
		String str = str1 + str2;
		
		System.out.println("连接后的字符串是：" + str);
	}

}
*/

public class stringConnectDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("请輸入第一個字符串");
		String mStringA = mScanner.nextLine();

		System.out.println("请輸入第一個字符串");
		String mStringB = mScanner.nextLine();

		String mStringNew = mStringA + mStringB;
		System.out.println("两个字符串相加得到的新的字符串为："+mStringNew);

		mScanner.close();
	}
}
