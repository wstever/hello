package String;
/*
public class stringBubbleSortDemo {
	// ʹ��ð��������ַ�����������

	// 1.���ַ���ת��Ϊ�ַ�����
	// 2.���ַ�������ð������
	// 3.���ַ�����ת��Ϊ�ַ���
	public static void main(String[] args) {
		String mString = "qwertyuiopasdfghjklzxcvbnm";
		// 1.���ַ���ת��Ϊ�ַ�����:char[] toCharArray() �����ַ���ת��Ϊһ���µ��ַ����顣
		char[] mArray = mString.toCharArray();
		// 2.���ַ��������ð������
		bubbleSort(mArray);
		// 3.���ַ�����ת��Ϊ�ַ���
		mString = mString.valueOf(mArray);
		System.out.println(mString);
	}

	// 2.���ַ��������ð������
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
		for (int i = 0; i < mChar.length - 1; i++) {// ע��if�м������û�еȺ�
			for (int j = 0; j < mChar.length - 1 - i; j++) {// ע��if�м������û�еȺ�
				if (mChar[j] > mChar[j + 1]) {
					char tmp = mChar[j]; 
					mChar[j] = mChar[j + 1];
					mChar[j + 1] = tmp;
				}
			}
		}
	}
}
