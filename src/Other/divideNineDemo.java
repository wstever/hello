package Other;

import java.util.Scanner;

/*
import java.util.*;

public class divideNineDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = s.nextInt();
		int tmp = num;
		int count = 0;
		for (int i = 0; tmp % 9 == 0;) {
			tmp = tmp / 9;
			count++;
		}
		System.out.println(num + " �ܹ��� " + count + " ��9������");
	}
}
*/


public class divideNineDemo{
	public static void main (String []args){
		System.out.println("�������ֵΪ��");
		Scanner mScanner=new Scanner(System.in);
		int input=mScanner.nextInt();

		int count=0;
	     int number=input;
	     //��ʾ��һ�Σ���ʾ������
	     for(int i=0;number%9==0;){
	    	number=number/9;
			count++;
	     }
	     System.out.println(input + " �ܹ��� " + count + " ��9������");
	}
}
