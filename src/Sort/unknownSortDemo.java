package Sort;
import java.util.Scanner;
public class unknownSortDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������3��������");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		if (a < c) {
			int t = a;
			a = c;
			c = t;
		}
		if (b < c) {
			int t = b;
			b = c;
			c = t;
		}
		System.out.println("�Ӵ�С��˳�����:");
		System.out.println(a + " " + b + " " + c);
	}
}
