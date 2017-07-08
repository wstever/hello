package Other;

/*
public class zeroToSevenNumber {
	public static void main(String[] args) {
		int sum = 4;
		int j;
		System.out.println("组成1位数是 " + sum + " 个");
		sum = sum * 7;
		System.out.println("组成2位数是 " + sum + " 个");
		for (j = 3; j <= 9; j++) {
			sum = sum * 8;
			System.out.println("组成" + j + "位数是 " + sum + " 个");
		}
	}
}
*/

public class zeroToSevenNumber {
	public static void main(String[] args) {
		int num = 0;// 放总数的
		num = 4;
		System.out.println("组成的1位数是" + num + "个");
		num = 7 * num;
		System.out.println("组成的2位数是" + num + "个");
		for (int i = 3; i <=100; i++) {
			num = 8 * num;
			System.out.println("组成的" + i + "位数是" + num + "个");
		}
	}
}
