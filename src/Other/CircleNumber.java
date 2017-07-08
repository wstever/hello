package Other;

import java.util.Scanner;

public class CircleNumber {
	public static void main(String[] args) {
		// 输入参与报数的总人数
		Scanner s = new Scanner(System.in);
		System.out.print("请输入排成一圈的人数：");
		int n = s.nextInt();

		// 先给每个人一个初始的布尔值，默认为true
		boolean[] arr = new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}

		// 剩余的人数，有n个
		int leftCount = n;
		int countNum = 0;
		int index = 0;

		// 如果剩余的人数多于1个人的时候，可以进行报数
		while (leftCount > 1) {
			if (arr[index] == true) {// 当在圈里面时
				countNum++;// 报数递增
				if (countNum == 3) {// 报到3的时候
					countNum = 0;// 从0开始继续报数
					arr[index] = false;// 此人退出圈子
					leftCount--;// 剩余的人数
				}
			}
			index++;// 每次报数一次，下标就+1
			if (index == n) {// 是循环数数，当下标>n时，说明已经输了一圈了
				index = 0;// 将下标重新设定为0，重新开始
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == true) {
				System.out.println("原排在第" + (i + 1) + "位的人留下了。");
			}
		}
	}

}
