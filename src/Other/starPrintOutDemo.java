package Other;
import java.util.Scanner;

public class starPrintOutDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);// ��ϵ�y��ݔ��һ��ֵ
		int i = 1;									// �@����һ�����I�������Iѭ�h�ĴΔ���7
		int number;										// �@�e�ǫ@�Ï�ϵ�y��ݔ����ֵ
		while (i <= 7) { 
			do {
				System.out.print("Ոݔ��һ��1-50��������");
				number = mScanner.nextInt();      
			} while (number < 1 || number > 50);         //�Á��Д���ڹ����ȵĔ���̎��
			for (int j = 1; j <= number; j++) {
				System.out.print("*");                  
			}
			System.out.println();
			i++;
		}

	}
}

