package Other;

/*
public class zeroToSevenNumber {
	public static void main(String[] args) {
		int sum = 4;
		int j;
		System.out.println("���1λ���� " + sum + " ��");
		sum = sum * 7;
		System.out.println("���2λ���� " + sum + " ��");
		for (j = 3; j <= 9; j++) {
			sum = sum * 8;
			System.out.println("���" + j + "λ���� " + sum + " ��");
		}
	}
}
*/

public class zeroToSevenNumber {
	public static void main(String[] args) {
		int num = 0;// ��������
		num = 4;
		System.out.println("��ɵ�1λ����" + num + "��");
		num = 7 * num;
		System.out.println("��ɵ�2λ����" + num + "��");
		for (int i = 3; i <=100; i++) {
			num = 8 * num;
			System.out.println("��ɵ�" + i + "λ����" + num + "��");
		}
	}
}
