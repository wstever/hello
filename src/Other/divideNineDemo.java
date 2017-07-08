package Other;

import java.util.Scanner;

/*
import java.util.*;

public class divideNineDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = s.nextInt();
		int tmp = num;
		int count = 0;
		for (int i = 0; tmp % 9 == 0;) {
			tmp = tmp / 9;
			count++;
		}
		System.out.println(num + " 能够被 " + count + " 个9整除。");
	}
}
*/


public class divideNineDemo{
	public static void main (String []args){
		System.out.println("输入的数值为：");
		Scanner mScanner=new Scanner(System.in);
		int input=mScanner.nextInt();

		int count=0;
	     int number=input;
	     //提示了一次，提示了两次
	     for(int i=0;number%9==0;){
	    	number=number/9;
			count++;
	     }
	     System.out.println(input + " 能够被 " + count + " 个9整除。");
	}
}
