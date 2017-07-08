package String;

import java.util.*;

public class ConvertIPAddressDemo {

	// 整数与IP地址间的转换
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		String input1, input2;
		String[] inputs;
		long result1;
		String[] result2;
		while (mScanner.hasNext()) {
			input1 = mScanner.next();
			input2 = mScanner.next();
			// 对第一个字符串进行处理
			inputs = input1.split("\\.");
			result1 = 0;
			for (int i = 0; i < inputs.length; i++) {
				result1 = result1 + (Long.parseLong(inputs[i]) << (inputs.length - i - 1) * 8);
			}
			System.out.println(result1);
			// 对第二个字符串进行处理
			result2 = new String[4];
			long temp = Long.parseLong(input2);
			for (int i = 3; i >= 0; i--) {
				result2[i] = (temp & 0xff) + "";
				temp = temp >> 8;
			}

			for (int i = 0; i < 4; i++) {
				if (i != 3) {
					System.out.print(result2[i] + ".");
				} else {
					System.out.println(result2[i]);
				}
			}
		}
		mScanner.close();
	}
}
