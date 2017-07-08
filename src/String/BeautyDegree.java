package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BeautyDegree {

	public static void main(String[] args) {
		// 获取用户的输入
		BufferedReader mBufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// 行数
		String line;
		int timer = 0;
		boolean mFlag = true;
		StringBuilder mStringBuilder = null;
		try {
			while ((line = mBufferedReader.readLine()) != null) {
				if (mFlag) {
					timer = Integer.parseInt(line);
					mFlag = false;
					mStringBuilder = new StringBuilder();
					continue;
				}
				mStringBuilder.append(line + ',');
				timer--;
				if (timer == 0) {
					mFlag = true;
					outPutBeauty(mStringBuilder.toString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void outPutBeauty(String string) {
		String[] result = string.split(",");
		for (String tmp : result) {
			System.out.println(getBeauty(tmp));
		}
	}

	public static int getBeauty(String name) {
		char[] chs = name.toLowerCase().toCharArray();
		int[] target = new int[26];
		for (int i = 0; i < chs.length; i++) {
			target[chs[i] - 'a']++;
		}
		Arrays.sort(target);
		int res = 0;
		for (int i = 25; i >= 0; i--) {
			res += target[i] * (i + 1);
		}
		return res;
	}

}
