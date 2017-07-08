package Study;

import java.util.*;

public class CutOffStringDemo{
	public static void main (String []args){
		Scanner mScanner =new Scanner (System.in);
		String str1=mScanner.next();
		String str2=mScanner.next();
	    doTask(str1);
	    doTask(str2);
	    mScanner.close();
	}

	private static void doTask(String str) {
		int l=0;
		//单行字符串的总长
		int n=str.length();
		//判断单行字符串的总长是否是8的倍数
		if(n%8>0){
			//l放的是剪切之后的字符串！决定你要补充多少个0
			l = 8 - n % 8;
		} 
		//使用字符串拼接的API,注意你的传参
		StringBuilder mStringBuilder=new StringBuilder(str);
		//开始用0补充到总长中
		while(l > 0){
			mStringBuilder.append("0");
			l--;
		}
		//i为大概要分为几段+1
		int i = n / 8 + 1;
		for (int j = 0; j < i; j++) {
			if (j * 8 + 8 <= mStringBuilder.length()) {
				String s = mStringBuilder.substring(j * 8, j * 8 + 8);
				System.out.println(s);
			}
		} 
	}
}












