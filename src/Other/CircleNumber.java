package Other;

import java.util.Scanner;

public class CircleNumber {
	public static void main(String[] args) {
		// ������뱨����������
		Scanner s = new Scanner(System.in);
		System.out.print("�������ų�һȦ��������");
		int n = s.nextInt();

		// �ȸ�ÿ����һ����ʼ�Ĳ���ֵ��Ĭ��Ϊtrue
		boolean[] arr = new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}

		// ʣ�����������n��
		int leftCount = n;
		int countNum = 0;
		int index = 0;

		// ���ʣ�����������1���˵�ʱ�򣬿��Խ��б���
		while (leftCount > 1) {
			if (arr[index] == true) {// ����Ȧ����ʱ
				countNum++;// ��������
				if (countNum == 3) {// ����3��ʱ��
					countNum = 0;// ��0��ʼ��������
					arr[index] = false;// �����˳�Ȧ��
					leftCount--;// ʣ�������
				}
			}
			index++;// ÿ�α���һ�Σ��±��+1
			if (index == n) {// ��ѭ�����������±�>nʱ��˵���Ѿ�����һȦ��
				index = 0;// ���±������趨Ϊ0�����¿�ʼ
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == true) {
				System.out.println("ԭ���ڵ�" + (i + 1) + "λ���������ˡ�");
			}
		}
	}

}
