package String;

import java.util.Scanner;

public class CutStringByByte {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			String str = mScanner.next();
			int n = mScanner.nextInt();
			int index = 0;
			while (n > 0) {
				// һ��Ӣ���ַ�ռһ���ֽڣ�8λ�����ֵΪ256��һ������ռ�����ֽ�
				if (str.charAt(index) > 256) {
					n = n - 2;// �ؼ�
					if (n >= 0)// �ؼ�
						index++;
				} else {
					n--;
					index++;
				}
			}
			System.out.println(str.substring(0, index));
		}
		mScanner.close();
	}
}
