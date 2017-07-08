package stack;

import java.util.LinkedList;
import java.util.Scanner;

public class FourArithmeticOperationQueue {

	public static int getValue(String str) {
		char[] arr = str.toCharArray();
		trans(arr);
		return value(arr, 0)[0];
	}

	public static void trans(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '[' || arr[i] == '{')
				arr[i] = '(';
			if (arr[i] == ']' || arr[i] == '}')
				arr[i] = ')';
		}
	}

	public static int[] value(char[] str, int i) {
		LinkedList<String> que = new LinkedList<String>();
		int pre = 0;
		int[] bra = null;
		while (i < str.length && str[i] != ')') {
			if (str[i] >= '0' && str[i] <= '9') {
				pre = pre * 10 + str[i++] - '0';
			} else if (str[i] != '(') {
				addNum(que, pre);
				que.addLast(String.valueOf(str[i++]));
				pre = 0;
			} else {
				bra = value(str, i + 1);
				pre = bra[0];
				i = bra[1] + 1;
			}
		}
		addNum(que, pre);
		return new int[] { getNum(que), i };
	}

	public static void addNum(LinkedList<String> que, int num) {
		if (!que.isEmpty()) {
			int cur = 0;
			String top = que.pollLast();
			if (top.equals("+") || top.equals("-")) {
				que.addLast(top);
			} else {
				cur = Integer.valueOf(que.pollLast());
				num = top.equals("*") ? (cur * num) : (cur / num);
			}
		}
		que.addLast(String.valueOf(num));
	}

	public static int getNum(LinkedList<String> que) {
		int res = 0;
		boolean add = true;
		String cur = null;
		int num = 0;
		while (!que.isEmpty()) {
			cur = que.pollFirst();
			if (cur.equals("+")) {
				add = true;
			} else if (cur.equals("-")) {
				add = false;
			} else {
				num = Integer.valueOf(cur);
				res += add ? num : (-num);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.next();
			System.out.println(getValue(str));
		}
	}
}
