package Study;
import java.util.ArrayList;
import java.util.Scanner;
public class GetNonRepeatIntegerDemo {
	public static void main(String[] args) {
		System.out.println("请输入您要处理的数字字符串：");
		Scanner mScanner=new Scanner(System.in);
		while(mScanner.hasNextLine()){
			String mString =mScanner.nextLine();
			char [] mChar=mString.toCharArray();
			ArrayList<Character>mArrayList=new ArrayList<Character>();
			//注意这里是mChar.length-1，然后判断条件是>=0
			for(int i=mChar.length-1;i>=0;i--){
				if(!mArrayList.contains(mChar[i])){
					mArrayList.add(mChar[i]);
				}
			}
			System.out.println("输出的结果如下：");
			for(char out_char :mArrayList ){
				 System.out.print(out_char);
			}
		}
		mScanner.close();
	}
}
