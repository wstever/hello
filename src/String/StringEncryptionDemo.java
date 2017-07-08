package String;

import java.util.*;

public class StringEncryptionDemo {

	public static void Encrypt(char aucPassword[], char aucResult[]) {
		for (int i = 0; i < aucPassword.length; i++) {
			if (aucPassword[i] == 'z') {
				aucResult[i] = 'A';
			} else if (aucPassword[i] >= 'a' && aucPassword[i] <= 'y') {
				aucResult[i] = (char) (aucPassword[i] + 1 - 32);
			} else if (aucPassword[i] == 'Z') {
				aucResult[i] = 'a';
			} else if (aucPassword[i] >= 'A' && aucPassword[i] <= 'Y') {
				aucResult[i] = (char) (aucPassword[i] + 1 + 32);
			} else if (aucPassword[i] == '9') {
				aucResult[i] = '0';
			} else if (aucPassword[i] >= '0' && aucPassword[i] <= '8') {
				aucResult[i] = (char) (aucPassword[i] + 1);
			}
		}

	}

	public static void unEncrypt(char result[], char password[]) {
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 'A') {
				password[i] = 'z';
			} else if (result[i] >= 'B' && result[i] <= 'Z') {
				password[i] = (char) (result[i] - 1 + 32);
			} else if (result[i] == 'a') {
				password[i] = 'Z';
			} else if (result[i] >= 'a' && result[i] <= 'z') {
				password[i] = (char) (result[i] - 1 - 32);
			} else if (result[i] == '0') {
				password[i] = '9';
			} else if (result[i] >= '1' && result[i] <= '9') {
				password[i] = (char) (result[i] - 1);
			}
		}

	}

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		while (mScanner.hasNextLine()) {
			String str1 = mScanner.nextLine();
			String str2 = mScanner.nextLine();
			char[] arrayChr1 = str1.toCharArray();
			char[] arrayChr2 = str2.toCharArray();
			int num1 = str1.length();
			int num2 = str2.length();
			char[] aucResult = new char[num1];
			char[] password = new char[num2];
			Encrypt(arrayChr1, aucResult);
			unEncrypt(arrayChr2, password);
			System.out.println(String.copyValueOf(aucResult, 0, num1));
			System.out.println(String.copyValueOf(password, 0, num2));
		}
		mScanner.close();
	}

}
