package Sort;
import java.util.Arrays;

public class bubbleSortDemo {
	public static void main(String[] args) {
		int[] array={12,435,56,21,89,78,1223,23}; 
		array=bubbleSort(array); 
        String s=Arrays.toString(array); 
        System.out.print(s); 
	}
	//�ö���ѭ��ʵ�֣���ѭ��������Ϊi����ѭ��������Ϊj����ѭ���ظ�9�Σ���ѭ�������ظ�9��8��...��1�Ρ�
	//ÿ�ν��бȽϵ�����Ԫ�ض�������ѭ��j�йصģ����ǿ��Էֱ���a[j]��a[j+1]��ʶ��i��ֵ����Ϊ1,2,...,9��
	//����ÿһ��i, j��ֵ����Ϊ1,2,...10-i��
	public static int[] bubbleSort(int[] array){ 
		 int n=array.length;
		for(int i=0;i<n-1;i++){ 
			for(int j=0;j<n-i-1;j++){ 
			       if(array[j]>array[j+1]){ 
			              int temp=array[j]; 
			              array[j]=array[j+1]; 
			              array[j+1]=temp;   
			       }            
			     } 
			} 
		return array; 
	}
}
