package Array;

public class twoDimensionalArraysDemo {
	
	/** 
	* ������ά���� 
	*/  
	public static void main(String[] args) { 
		int[][] arr = new int[][]{{10,20,30},{100,200,300}}; 
		
		// ȡ�ö�ά�����һά�ĵ�һ������ 
		int arr0 = arr[0][0]; 
		System.out.println(arr0);  
		
		//ȡ�ö�ά����ĵ�һ�ַ��� ��forѭ�� 
		for (int i = 0; i < arr.length; i++) { //��ά����ĳ���ָ�������������鳤�� 
			for (int j = 0; j < arr[i].length; j++) { 
				System.out.print(arr[i][j]); 
			} 
		} 
		System.out.println(); 
		//ȡ�ö�ά����ĵڶ��ַ���,��ǿforѭ���������� 
		for (int[] childArr : arr) { 
			for (int number : childArr) { 
				System.out.print(number); 
			} 
		} 
	} 

}
