package Other;

import java.util.Scanner;

//识别有效的IP地址和掩码并进行分类统计
public class IPaddressDemo {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int err = 0;
		int priIp = 0;
		Scanner sc = new Scanner(System.in);
		String[] spStr = new String[2];
		while (sc.hasNextLine()) {

			String[] ispStr1 = new String[4];
			String[] ispStr2 = new String[4];
			int[] spStr1 = new int[4];
			int[] spStr2 = new int[4];
			String str = sc.nextLine();
			spStr = str.split("~");
			ispStr1 = spStr[0].split("\\.");
			for (int i = 0; i < 4; i++) {
				spStr1[i] = Integer.parseInt(ispStr1[i]);
			}
			ispStr2 = spStr[1].split("\\.");
			for (int i = 0; i < 4; i++) {
				spStr2[i] = Integer.parseInt(ispStr2[i]);
			}

			int flag = 0; // 用于判断子网掩码是否正确，如果正确flag=1
			if (spStr2[0] == 255) {
				if (spStr2[1] == 255) {
					if (spStr2[2] == 255) {
						if (spStr2[3] == 254 | spStr2[3] == 252 | spStr2[3] == 248 | spStr2[3] == 240 | spStr2[3] == 224
								| spStr2[3] == 192 | spStr2[3] == 128 | spStr2[3] == 0) {
							flag = 1;
						}
					} else if (spStr2[2] == 254 | spStr2[2] == 252 | spStr2[2] == 248 | spStr2[2] == 240
							| spStr2[2] == 224 | spStr2[2] == 192 | spStr2[2] == 128 | spStr2[2] == 0) {
						if (spStr2[3] == 0) {
							flag = 1;
						}
					}
				} else if (spStr2[1] == 254 | spStr2[1] == 252 | spStr2[1] == 248 | spStr2[1] == 240 | spStr2[1] == 224
						| spStr2[1] == 192 | spStr2[1] == 128 | spStr2[1] == 0) {
					if (spStr2[2] == 0) {
						if (spStr2[3] == 0) {
							flag = 1;
						}
					}
				}
			} else if (spStr2[0] == 254 | spStr2[0] == 252 | spStr2[0] == 248 | spStr2[0] == 240 | spStr2[0] == 224
					| spStr2[0] == 192 | spStr2[0] == 128) {
				if (spStr2[1] == 0) {
					if (spStr2[2] == 0) {
						if (spStr2[3] == 0) {
							flag = 1;
						}
					}
				}
			}

			if (flag == 1) {
				if (spStr1[0] >= 0 && spStr1[0] <= 255 && spStr1[1] >= 0 && spStr1[1] <= 255 && spStr1[2] >= 0
						&& spStr1[2] <= 255 && spStr1[3] >= 0 && spStr1[3] <= 255) {
					if (spStr1[0] > 0 && spStr1[0] < 127) {
						a++;
						if (spStr1[0] == 10) {
							priIp++;
						}
					} else if (spStr1[0] > 127 && spStr1[0] < 192) {
						b++;
						if (spStr1[0] == 172 && spStr1[1] >= 16 && spStr1[1] <= 31) {
							priIp++;
						}
					} else if (spStr1[0] > 191 && spStr1[0] < 224) {
						c++;
						if (spStr1[0] == 192 && spStr1[1] == 168) {
							priIp++;
						}
					} else if (spStr1[0] > 223 && spStr1[0] < 240) {
						d++;

					} else if (spStr1[0] > 239 && spStr1[0] < 256) {
						e++;
					}
				} else {
					err++;
				}
			} else {
				err++;
			}
		}
		System.out.println("" + a + " " + b + " " + c + " " + d + " " + e + " " + err + " " + priIp);
	}
}