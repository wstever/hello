package Study;
import java.util.ArrayList;
import java.util.Scanner;
public class GetNonRepeatIntegerDemo {
	public static void main(String[] args) {
		System.out.println("��������Ҫ����������ַ�����");
		Scanner mScanner=new Scanner(System.in);
		while(mScanner.hasNextLine()){
			String mString =mScanner.nextLine();
			char [] mChar=mString.toCharArray();
			ArrayList<Character>mArrayList=new ArrayList<Character>();
			//ע��������mChar.length-1��Ȼ���ж�������>=0
			for(int i=mChar.length-1;i>=0;i--){
				if(!mArrayList.contains(mChar[i])){
					mArrayList.add(mChar[i]);
				}
			}
			System.out.println("����Ľ�����£�");
			for(char out_char :mArrayList ){
				 System.out.print(out_char);
			}
		}
		mScanner.close();
	}
}
