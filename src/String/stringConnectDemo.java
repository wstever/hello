package String;
import java.util.Scanner;

/*import java.util.*;

public class StringConnectDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("������һ���ַ�����");
		String str1 = s.nextLine();
		
		System.out.print("��������һ���ַ�����");
		String str2 = s.nextLine();
		
		String str = str1 + str2;
		
		System.out.println("���Ӻ���ַ����ǣ�" + str);
	}

}
*/

public class stringConnectDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("��ݔ���һ���ַ���");
		String mStringA = mScanner.nextLine();

		System.out.println("��ݔ���һ���ַ���");
		String mStringB = mScanner.nextLine();

		String mStringNew = mStringA + mStringB;
		System.out.println("�����ַ�����ӵõ����µ��ַ���Ϊ��"+mStringNew);

		mScanner.close();
	}
}
