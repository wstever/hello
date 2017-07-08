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
		// ��ȡ�����е��ַ���,����ת�����ַ�����,
		char[] chs = name.toLowerCase().toCharArray();
		// �������ͱ���
		int[] target = new int[26];
		// �����ַ�����
		for (int i = 0; i < chs.length; i++) {
			// a-a=0
			target[chs[i] - 'a']++;
		}
		// �������ֵ�������Ŀ��������
		Arrays.sort(target);
		int res = 0;
		for (int i = 25; i >= 0; i--) {
			res += target[i] * (i + 1);
		}
		return res;
	}
}
