package String;
import java.util.*;
public class subStringNumberDemo {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("�������ַ�����");
		String str1 = s.nextLine();
		System.out.print("�������Ӵ���");
		String str2 = s.nextLine();

		int count = 0;
		if (str1.equals("") || str2.equals("")) {
			System.out.println("��û�������ַ������Ӵ�,�޷��Ƚ�!");
			System.exit(0);
		} else {
			for (int i = 0; i <= str1.length() - str2.length(); i++) {
				if (str2.equals(str1.substring(i, str2.length() + i)))
					// ���ֱȷ������⣬���"aaa"������2��"aa"�Ӵ���
					count++;
			}
			System.out.println("�Ӵ����ַ����г���: " + count + " ��");
		}
	}
}
