package Other;

/*public class fangChengShiDemo {
	public static void main(String[] args) {
		int a = 809, b, i;
		for (i = 10; i < 99; i++) {
			b = i * a;
			if (8 * i < 100 && 9 * i >= 100)
				System.out.println("809*" + i + "=" + "800*" + i + "+" + "9*" + i + "=" + b);
		}
	}

}*/

public class fangChengShiDemo {
	public static void main(String[] args) {
		int result;
		for (int i = 10; i < 99; i++) { // 此时的i为我的未知数
			result = 809 * i;
			if (8 * i < 100 && 9 * i > 99) {
				System.out.println("809*" + i + "=" + "800*" + i + "+" + "9*" + i + "=" + result);
			}
		}
	}
}
