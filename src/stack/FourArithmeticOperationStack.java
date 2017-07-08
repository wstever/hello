package stack;

import java.util.Scanner;
import java.util.Stack;

public class FourArithmeticOperationStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.next();
			char[] c = s.toCharArray();
			int n = c.length;
			boolean flag = false;
			Stack<Integer> stack = new Stack<>();
			Stack<Character> stack2 = new Stack<>();
			int i = 0;
			while (i < n) {
				// 如果是数字
				if (c[i] <= '9' && c[i] >= '0') {
					// （-4这种情况
					if (i - 2 >= 0 && (c[i - 2] == '(' || c[i - 2] == '[' || c[i - 2] == '{') && c[i - 1] == '-') {
						stack2.pop();
						flag = true;
					}
					// 第一个字符为‘-’
					else if (i == 1 && c[0] == '-') {
						stack2.pop();
						flag = true;
					}
					// 其他位置的"-"号
					else if (i - 1 > 0 && c[i - 1] == '-') {
						stack2.pop();
						stack2.push('+');
						flag = true;
					}
					int opt = 0;
					while (i < n && c[i] <= '9' && c[i] >= '0') {
						opt = opt * 10 + (c[i] - '0');
						i++;
					}
					if (flag == true) {
						stack.push(0 - opt);
						flag = false;
					} else {
						stack.push(opt);
					}
					continue;
				} else {
					// 左括号直接入栈
					if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
						stack2.push(c[i]);
					}
					// 右括号出栈处理数据
					else if (c[i] == ')' || c[i] == ']' || c[i] == '}') {
						int a = stack.pop();
						while (!stack2.isEmpty()
								&& !(stack2.peek() == '(' || stack2.peek() == '[' || stack2.peek() == '{')) {
							stack2.pop();
							int b = stack.pop();
							a = a + b;
						}
						stack2.pop();
						if (!stack2.isEmpty() && (stack2.peek() == '*' || stack2.peek() == '/')) {
							int b = stack.pop();
							char ch = stack2.pop();
							a = calculate(b, a, ch);
						} else if (!stack2.isEmpty() && stack2.peek() == '-') {
							a = 0 - a;
							stack2.pop();
							stack2.push('+');
						}
						stack.push(a);
					}
					// 括号前面的乘除直接入站
					else if (i + 1 < n && (c[i] == '*' || c[i] == '/')
							&& (c[i + 1] == '(' || c[i + 1] == '[' || c[i + 1] == '{')) {
						stack2.push(c[i]);
					}
					// 四则运算乘除
					else if (i + 1 < n && (c[i] == '*' || c[i] == '/')) {
						int a = stack.pop();
						int opt = 0;
						int j;
						for (j = i + 1; j < n && c[j] >= '0' && c[j] <= '9'; j++) {
							opt = opt * 10 + (c[j] - '0');
						}
						int b = opt;
						a = calculate(a, b, c[i]);
						i = j;
						stack.push(a);
						continue;
					}
					// 加减法
					else if (c[i] == '+' || c[i] == '-') {
						stack2.push(c[i]);
					}
				}
				i++;
			}

			int a = stack.pop();
			while (!stack2.isEmpty()) {
				stack2.pop();
				int b = stack.pop();
				a = a + b;
			}
			System.out.println(a);
		}
		sc.close();
	}

	private static int calculate(int a, int b, char c) {
		switch (c) {
		case '*':
			a = a * b;
			break;
		case '/':
			a = a / b;
			break;
		case '-':
			break;
		}
		return a;
	}
}
