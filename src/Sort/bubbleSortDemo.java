package Sort;
import java.util.Arrays;

public class bubbleSortDemo {
	public static void main(String[] args) {
		int[] array={12,435,56,21,89,78,1223,23}; 
		array=bubbleSort(array); 
        String s=Arrays.toString(array); 
        System.out.print(s); 
	}
	//用二重循环实现，外循环变量设为i，内循环变量设为j。外循环重复9次，内循环依次重复9，8，...，1次。
	//每次进行比较的两个元素都是与内循环j有关的，它们可以分别用a[j]和a[j+1]标识，i的值依次为1,2,...,9，
	//对于每一个i, j的值依次为1,2,...10-i。
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
