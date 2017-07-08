package stack;

import java.util.*;

public class StackAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			List<String> all = new ArrayList<String>();
			int len = str.length();
			for (int i = 0; i < len;) {
				if (str.charAt(i) >= 40 && str.charAt(i) <= 47) {
					all.add(String.valueOf(str.charAt(i)));
					i++;
					continue;
				} else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
					if (i == len - 1) {
						all.add(str.substring(i));
						break;
					} else {
						int j = 0;
						for (j = i + 1; j < len; j++) {
							if (str.charAt(j) >= 40 && str.charAt(j) <= 47) {// ������
								all.add(str.substring(i, j));
								all.add(str.substring(j, j + 1));
								i = j + 1;
								break;
							}
						}
						if (j == len - 1 && str.charAt(j) >= 48 && str.charAt(j) <= 57) {
							all.add(str.substring(i, len));
							break;
						}
					}
				}
			}
			// ������ϣ�all���������е�Ԫ�أ��������ֺͷ���

			// ���濪ʼ�㷨������ջ������׺ת��Ϊ��׺
			List<String> number = new ArrayList<>();
			Stack<String> symbol = new Stack<>();
			int len2 = all.size();
			for (int i = 0; i < len2; i++) {
				String temp = all.get(i);
				if (!temp.equals("(") && !temp.equals(")") && !temp.equals("+") && !temp.equals("-")
						&& !temp.equals("*") && !temp.equals("/")) {// ���������,�����List
																	// number
					number.add(temp);
				} else if (temp.equals("(") || temp.equals("*") || temp.equals("/")) {// ����ǿ����ţ���������ջ
					symbol.push(temp);
				} else if (temp.equals(")")) {// ����Ǳ����ţ��򽫶�Ӧ�Ŀ�����֮ǰ�ķ��Ŵ�������ջ
					for (int j = symbol.size() - 1; j >= 0; j--) {
						String ch = symbol.pop();
						if (!ch.equals("("))
							number.add(ch);
						else if (ch.equals("("))
							break;
					}
				} else if (temp.equals("+") || temp.equals("-")) {
					if (symbol.size() == 0 || (symbol.size() >= 1 && symbol.get(symbol.size() - 1).equals("(")))
						symbol.push(temp);
					else {
						for (int j = symbol.size() - 1; j >= 0; j--) {
							String ch = symbol.get(symbol.size() - 1);
							if (!ch.equals("("))
								number.add(symbol.pop());
							else
								break;
						}
						symbol.push(temp);
					}
				}
			}
			int len3 = symbol.size();
			for (int i = 0; i < len3; i++)
				number.add(symbol.pop());
			// �����׺���

			// ����ʽ��ֵ
			int len4 = number.size();
			Stack<Integer> newNumber = new Stack<>();
			for (int i = 0; i < len4; i++) {
				String temp = number.get(i);
				if (!temp.equals("(") && !temp.equals(")") && !temp.equals("+") && !temp.equals("-")
						&& !temp.equals("*") && !temp.equals("/"))// ���ֵĻ���ֱ����ջ
					newNumber.push(Integer.parseInt(temp));
				else {// �����������ţ���������ջ�������Ժ�����ջ
					int n1 = newNumber.pop();
					int n2 = newNumber.pop();
					int n3 = 0;
					if (temp.equals("+"))
						n3 = n2 + n1;
					else if (temp.equals("-"))
						n3 = n2 - n1;
					else if (temp.equals("*"))
						n3 = n2 * n1;
					else if (temp.equals("/"))
						n3 = n2 / n1;
					newNumber.push(n3);
				}
			}
			System.out.println(newNumber.pop());
		}
		sc.close();
	}
}