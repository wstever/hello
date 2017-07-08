package Other;
import java.util.Scanner;

public class starPrintOutDemo {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);// 從系統中輸出一個值
		int i = 1;									// 這個為一個標誌數，標誌循環的次數為7
		int number;										// 這裡是獲得從系統中輸出的值
		while (i <= 7) { 
			do {
				System.out.print("請輸入一個1-50的整數：");
				number = mScanner.nextInt();      
			} while (number < 1 || number > 50);         //用來判斷非在範圍內的數的處理
			for (int j = 1; j <= number; j++) {
				System.out.print("*");                  
			}
			System.out.println();
			i++;
		}

	}
}

