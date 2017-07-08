package Sort;

import java.util.Scanner;

//冒泡排序
public class DictionarySortStringDemo {
	
/*	 public static void main(String[] args) { 
  	  Scanner sc = new  Scanner(System.in); 
		  int n = Integer.parseInt(sc.nextLine()); 
		  String[] str= new String[n]; 
		  for (int i = 0; i < n; i++) {
				  str[i] = sc.nextLine();
		  }
		  for (int t = 0; t < n; t++) { 
			  for (int j = t + 1; j < n; j++) { 
				  if ((str[t].compareTo(str[j])) > 0) {
					  String temp = str[t]; 
					  str[t] = str[j];
					  str[j] = temp; 
		        } 
		    } 
		 } 
		  for (int t = 0; t < n; t++) {
			  	System.out.println(str[t]);
		  }
	  }*/
	 

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("请输入您总共排序的字符串：");
		//注意两种写法的区别，的确不一样！
		//int num = mScanner.nextInt();
		int num=Integer.parseInt(mScanner.nextLine());
		
		String[] array = new String[num];
		for (int i = 0; i < num; i++) {
			array[i] = mScanner.nextLine();
		}
		//冒泡排序开始
		for (int j = 0; j < num; j++) {
			for (int k = j + 1; k < num; k++) {
				//注意这里的大小写，决定着是不是输入的内容正序还是倒序！
				if (array[j].compareTo(array[k]) > 0) {
					String tmp = array[j];
					array[j] = array[k];
					array[k] = tmp;
				}
			}
		}
		for (int m = 0; m < num; m++) {
			System.out.println(array[m]);
		}
		mScanner.close();
	}
}
