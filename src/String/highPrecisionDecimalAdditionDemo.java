package String;

import java.util.*;

public class highPrecisionDecimalAdditionDemo{
     public static void AddLongInteger(String addend, String augend){
    	 //两者之间的一个交换
    	 //add前面那个，aug为后面那个
    	 //一定要要后面那个比前面的小
         if(addend.length()<augend.length()){
             String temp = addend;
             addend = augend;
             augend = temp;
         }
           
         //将两个字符串转换为字符类型
         char[] add = addend.toCharArray();
         char[] aug = augend.toCharArray();
         int len = add.length;
           
         //新建三个整型数组A，B，以及进位数组
         int[] A = new int[len];
         int[] B = new int[len];
         int[] C = new int[len+1];
  
         for (int i = 0; i < add.length; i++)
            A[i] =(int)(add[add.length-1-i]-'0');
         for (int i = 0; i < aug.length; i++)
            B[i] =(int)(aug[aug.length-1-i]-'0');
           
         int up=0;
         for(int i=0;i<aug.length;i++){
             C[i] = (A[i]+B[i]+up)%10;
             up=(A[i]+B[i]+up)/10;
         }
           
         for(int i=aug.length;i<len;i++){
             C[i] = (A[i]+up)%10;
             up=(A[i]+up)/10;
         }
           
         if(up>0){
             C[len]=up;
             for(int i=len;i>=0;i--){
                 System.out.print(C[i]);
             }
             System.out.println();
         }
         else{
             for(int i=len-1;i>=0;i--){
                 System.out.print(C[i]);
             }
             System.out.println();
         }
     }
    public static void main(String srgs[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String addend = in.next();
            in.nextLine();
            String augend = in.next();
            in.nextLine();
            AddLongInteger(addend,augend);
        }
    }
}