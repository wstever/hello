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
			Arrays.sort(array);// ������������������ 
			
			System.out.println(array[0]); //���ź�����������ظ����������ѡ����������������һ����
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
		System.out.println("��Ҫ��������ֵ������ǣ�");
		while(mScanner.hasNext()){
			int total=mScanner.nextInt();
			int [] mNumbers=new int[total];
			System.out.println("�����������Ҫ��������֣�");
		    for(int i=0;i<total;i++){
			   mNumbers[i]=mScanner.nextInt();
		    }
			Arrays.sort(mNumbers);
			System.out.println("����������ִ��ھ�������ȥ��֮�󣬵õ����½��:");
			 System.out.print(mNumbers[0]); //���ź�����������ظ����������ѡ����������������һ����
			 //ע�������Ǵ�1��ʼ
		     for(int i =1;i<total;i++){
		    	 //ע�������ȥ�ص�д����ֻҪǰ��һ�����������һ�����鲻һ���������
		    	 if(mNumbers[i]!=mNumbers[i-1]){
		    		 System.out.print(" "+mNumbers[i]);
		    	 }
		     }
		}
		mScanner.close();
	} 
}























