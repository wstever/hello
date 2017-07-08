package Study;

import java.util.Arrays;
import java.util.Scanner;

/*public class RandomNumberDemo { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		while (scan.hasNext()) { 
			int n =scan.nextInt(); 
			int[] array = new int[n]; 
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt(); 
			} 
			Arrays.sort(array);// 对输入的数组进行排序 
			
			System.out.println(array[0]); //对排好序的数组中重复的数组进行选择输出，首先输出第一个数
			for (int i = 1; i< n; i++) { 
				if (array[i] != array[i - 1]) 
					System.out.println(array[i]); 
				} 
			} 
	}
}*/

public class RandomNumberDemo{
	public static void main(String[]args){
		Scanner mScanner=new Scanner(System.in);
		System.out.println("您要输入的数字的总数是：");
		while(mScanner.hasNext()){
			int total=mScanner.nextInt();
			int [] mNumbers=new int[total];
			System.out.println("请继续输入您要输入的数字：");
		    for(int i=0;i<total;i++){
			   mNumbers[i]=mScanner.nextInt();
		    }
			Arrays.sort(mNumbers);
			System.out.println("您输入的数字串在经过排序，去重之后，得到以下结果:");
			 System.out.print(mNumbers[0]); //对排好序的数组中重复的数组进行选择输出，首先输出第一个数
			 //注意这里是从1开始
		     for(int i =1;i<total;i++){
		    	 //注意这里的去重的写法，只要前面一个数组跟后面一个数组不一样，就输出
		    	 if(mNumbers[i]!=mNumbers[i-1]){
		    		 System.out.print(" "+mNumbers[i]);
		    	 }
		     }
		}
		mScanner.close();
	} 
}























