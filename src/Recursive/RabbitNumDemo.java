package Recursive;

import java.util.Scanner;

public class RabbitNumDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int month = sc.nextInt();
			System.out.println(getTotalCount(month));
		}
		sc.close();
	}

	
	//�ؼ����ҵ�����ʽ f(n)=f(n-1)+f(n-2) (n>=4)
    ///����ʽ�Ľ���:���ڵ�n���µ���������������������ɣ�
    ///һ�������ϸ��µ�����f(n-1)����һ��������3���´������
    ///����һֻ����f(n-2)
	public static int getTotalCount(int monthCount) {
		if (monthCount <= 0)
			return 0;
		if (monthCount == 1 || monthCount == 2)
			return 1;
		int c1 = 1;
		int c2 = 1;
		for (int i = 3; i <= monthCount; i++) {
			int c3 = c1 + c2;
			c1 = c2;
			c2 = c3;
		}
		return c2;
	}
}
