package Sort;
import java.util.Arrays;

public class selectSortDemo {

	public static void main(String[] args) {
		int[] array={12,435,56,21,89,78,1223,23}; 
		array=selectSort(array); 
        String s=Arrays.toString(array); 
        System.out.print(s); 
	}
	
	public static int[] selectSort(int[] array){ 
		 int n=array.length;
	       for(int i=0;i<n-1;i++){ 
		       for(int j=i+1;j<n;j++){ 
		              if(array[i]>array[j]){ 
		                     int temp=array[i]; 
		                     array[i]=array[j]; 
		                     array[j]=temp; 
		              } 
		       } 
	    } 
	       return array;

	}

	/*	private static void selectSort(int[] a) { 
			int n=a.length;
			for(int k=0;k<n-1;k++){
				int min=k;
				for(int i=k+1;i<n;i++)
				    if(a[i]<a[min])
				    	min=i;
				if(k!=min){
					int temp=a[k];
					a[k]=a[min];
					a[min]=temp;
				}
			}
		}  */
}
