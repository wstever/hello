package String;

import java.util.Arrays;

public class BeautyDegreeShort {
	public static void main(String[] args) {
		String zhangsan = new String("zhangsan");
		System.out.println(getBeauty(zhangsan));
	}

	private static void outPutBeauty(String string) {
		String[] result = string.split(",");
		for (String tmp : result) {
			System.out.println(getBeauty(tmp));
		}
	}

	public static int getBeauty(String name) {
		// 先取得所有的字符串,将其转换成字符数组,
		char[] chs = name.toLowerCase().toCharArray();
		// 创建整型变量
		int[] target = new int[26];
		// 遍历字符数组
		for (int i = 0; i < chs.length; i++) {
			// a-a=0
			target[chs[i] - 'a']++;
		}
		// 将出出现的整型数目进行排序
		Arrays.sort(target);
		int res = 0;
		for (int i = 25; i >= 0; i--) {
			res += target[i] * (i + 1);
		}
		return res;
	}
}
