package Array;

public class twoDimensionalArraysDemo {
	
	/** 
	* 遍历多维数组 
	*/  
	public static void main(String[] args) { 
		int[][] arr = new int[][]{{10,20,30},{100,200,300}}; 
		
		// 取得二维数组第一维的第一个数组 
		int arr0 = arr[0][0]; 
		System.out.println(arr0);  
		
		//取得二维数组的第一种方法 ，for循环 
		for (int i = 0; i < arr.length; i++) { //二维数组的长度指的是最外层的数组长度 
			for (int j = 0; j < arr[i].length; j++) { 
				System.out.print(arr[i][j]); 
			} 
		} 
		System.out.println(); 
		//取得二维数组的第二种方法,增强for循环遍历数组 
		for (int[] childArr : arr) { 
			for (int number : childArr) { 
				System.out.print(number); 
			} 
		} 
	} 

}
