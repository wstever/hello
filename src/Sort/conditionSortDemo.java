package Sort;

import java.util.Scanner;

public class conditionSortDemo {
	public static void main(String[] args) {

		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNext()) {
			String str = mScanner.nextLine();
			char[] ch = str.toCharArray();
			StringBuffer mStringBuffer = new StringBuffer();
			// �����е�Ӣ���ҳ������źá�
			for (int i = 0; i < 26; i++) {
				char c = (char) (i + 'A');
				for (int j = 0; j < str.length(); j++) {
					if (ch[j] == c || ch[j] == (char) (c + 32))
						mStringBuffer.append(ch[j]);
				}
			}
			// �����еķ�Ӣ���ַ��ҳ������뵽ָ��λ����
			for (int k = 0; k < str.length(); k++) {
				if (!(ch[k] >= 'A' && ch[k] <= 'Z' || ch[k] >= 'a' && ch[k] <= 'z'))
					mStringBuffer.insert(k, ch[k]);
			}
			System.out.println(mStringBuffer.toString());
		}
		mScanner.close();
	}

}
