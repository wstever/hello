package Study;

import java.util.Scanner;

public class ReverseStringDemo {

	/*public static void main(String arg[]) {
		Scanner mScanner = new Scanner(System.in);
		String a = mScanner.nextLine();
		System.out.println(reverse(a));
		mScanner.close();
	}

	public static StringBuilder reverse(String a) {
		StringBuilder b = new StringBuilder(a);
		b.reverse();
		return b;
	}*/
	
	
		/*
		     * 如果考虑空间复杂度就只能在原来数组上改动
		     */
		    public static void main(String[] args) { 
		        Scanner mScanner = new Scanner(System.in);
		        String str = mScanner.next();
		        reverse(str);
		        mScanner.close();
		    }
		    public static void reverse(String str){
		        char[] array = str.toCharArray();
		        int start = 0;
		        int end = array.length-1;
		        while(end > start){
		            char temp = array[start];
		            array[start] = array[end];
		            array[end] = temp;
		            start++;
		            end--;
		        }
		        String result = new String(array);
		        System.out.println(result);
		    }
}
