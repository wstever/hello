package Other;
import java.util.Scanner;

/*import java.util.*;

public class sharedPhoneSafeDataDemo {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = 0, temp;
		//ȷ��ȡ������λ��
		do {
			System.out.print("������һ��4λ��������");
			num = s.nextInt();
		} while (num < 1000 || num > 9999);
		//ʹ��������������
		int a[] = new int[4];    //����һ���������飬���ҵ����Ž�ȥ
		a[0] = num / 1000;       // ȡǧλ������
		a[1] = (num / 100) % 10; // ȡ��λ������
		a[2] = (num / 10) % 10;  // ȡʮλ������
		a[3] = num % 10;         // ȡ��λ������
		//ÿλ���ֶ�����5���úͳ���10��������������֣�
		for (int j = 0; j < 4; j++) {
			a[j] += 5;
			a[j] %= 10;
		}
		//��һλ�͵���λ�������ڶ�λ�͵���λ������  
		for (int j = 0; j <= 1; j++) {
			temp = a[j];
			a[j] = a[3 - j];
			a[3 - j] = temp;
		}
		System.out.print("���ܺ������Ϊ��");
		for (int j = 0; j < 4; j++)
			System.out.print(a[j]);
	}
}
*/

public class sharedPhoneSafeDataDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		int num;
		
		//ȷ��ȡ������λ��
		do {
			System.out.println("����������ָ����Χ�ڵ���ֵ");
			num = mScanner.nextInt();
		} while (num < 1000 || num > 9999);

		//ʹ���������洢������
		int mArray[] = new int[4];//����һ���������飬���ҵ����Ž�ȥ
		// ������һ��
		mArray[0] = num / 1000;      // ȡǧλ������
		mArray[1] = (num / 100) % 10;// ȡ��λ������
		mArray[2] = (num / 10) % 10; // ȡʮλ������
		mArray[3] = num % 10;        // ȡ��λ������ 

		//ÿλ���ֶ�����5���úͳ���10��������������֣�
		for (int i = 0; i < 4; i++) {
			mArray[i] = mArray[i] + 5;
			mArray[i] = mArray[i] % 10;
		}

		//��һλ�͵���λ�������ڶ�λ�͵���λ������  
		for (int j = 0; j <= 1; j++) {
			int temp = mArray[j];
			//������һ�Σ������
			mArray[j] = mArray[3-j];
			mArray[3-j] = temp;
		}

		System.out.println("���ܺ������Ϊ��");
		for (int k = 0; k < mArray.length; k++) {
			System.out.print(mArray[k]);
		}

	}

}
