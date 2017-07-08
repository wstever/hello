package String;

import java.util.Scanner;

public class StudyEnglishDemo {

	static String[] a = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };// ��������1-9
	static String[] b = new String[] { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };// ��������10-19
	static String[] c = new String[] { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen" };// ����������ʮ

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String n = sc.next();
			String regex = "^[0-9]{1,9}$";// ������ʽ
			if (!n.matches(regex) || n.startsWith("0")) {// �ж������Ƿ�Ϸ�
				System.out.println("error");
			} else {
				// ���ｫ���ִ�����Ϊ��λһ�����ֱ��ȡ��Ӣ���ַ�����Ȼ���ٽ�������
				int m = n.length();
				int num = 0;
				while (m - 3 > 0) {// ���ֳ��ȴ���3ʱ���и��¼�и�������糤��Ϊ9�����и����Σ�����Ϊ5��ֻ���и�һ��
					num++;
					m -= 3;
				}
				switch (num) {// ��������и���������ͬ���в�ͬ�����parse�����Ƕ�ȡС����λ�����ֵ�Ӣ���ַ�����
				case 0:
					System.out.println(parse(n.substring(0, m)));
					break;// �и�Ϊ0��˵�����ֳ���С��3��ֱ�����parse�����ķ���ֵ����
				case 1:
					if (parse(n.substring(m, m + 3)).equals("")) {// ����>3������<=6��������λΪȫ������
						System.out.println(parse(n.substring(0, m)) + " thousand");
					} else {
						System.out.println(parse(n.substring(0, m)) + " thousand " + parse(n.substring(m, m + 3)));
					}
					break;
				case 2:// ����Ϊ7-9λ
					if (parse(n.substring(m, m + 3)).equals("") && parse(n.substring(m + 3, m + 6)).equals("")) {// ����λȫΪ�����
						System.out.println(parse(n.substring(0, m)) + " million");
					} else if (parse(n.substring(m, m + 3)).equals("")
							&& !parse(n.substring(m + 3, m + 6)).equals("")) {// �м���λΪ0������λ��Ϊ0
						System.out.println(parse(n.substring(0, m)) + " million " + parse(n.substring(m + 3, m + 6)));
					} else if (!parse(n.substring(m, m + 3)).equals("")
							&& parse(n.substring(m + 3, m + 6)).equals("")) {// �м䲻Ϊ�㣬����λΪ0
						System.out.println(parse(n.substring(0, m)) + " million " + parse(n.substring(m, m + 3)));
					} else {// ����Ϊ��
						System.out.println(parse(n.substring(0, m)) + " million " + parse(n.substring(m, m + 3))
								+ " thousand " + parse(n.substring(m + 3, m + 6)));
					}
					break;
				}
			}
		}
		sc.close();
	}

	private static String parse(String ss) {
		int oo = Integer.parseInt(ss);// ��ȡ�ַ�������ֵ����ֹ�м�λΪ020,002,000�������ֻ��ȡ��Чλ
		String s = "" + oo;
		int m = s.length();// ��Чλ�ĳ���
		StringBuilder str = new StringBuilder();
		switch (m) {
		case 1:
			str.append(a[Integer.parseInt(s)]);
			break;
		case 2:
			if (s.charAt(0) == '1') {
				str.append(c[s.charAt(1) - '0']);
			} else if (s.charAt(1) == '0') {
				str.append(b[s.charAt(0) - '0']);
			} else {
				str.append(b[s.charAt(0) - '0'] + " " + a[s.charAt(1) - '0']);
			}
			break;
		case 3:
			if (s.charAt(1) == '0' && s.charAt(2) == '0') {
				str.append(a[s.charAt(0) - '0'] + " hundred");
			} else if (s.charAt(1) == '0') {
				str.append(a[s.charAt(0) - '0'] + " hundred and " + a[s.charAt(2) - '0']);
			} else if (s.charAt(1) == '1') {
				str.append(a[s.charAt(0) - '0'] + " hundred and " + c[s.charAt(2) - '0']);
			} else if (s.charAt(2) == '0') {
				str.append(a[s.charAt(0) - '0'] + " hundred and " + b[s.charAt(1) - '0']);
			} else {
				str.append(a[s.charAt(0) - '0'] + " hundred and " + b[s.charAt(1) - '0'] + " " + a[s.charAt(2) - '0']);
			}
			break;
		}
		return str.toString();
	}
}
