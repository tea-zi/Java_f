package F1_���ڿ�1_������Ʈ;

import java.util.Scanner;

public class ���ڿ�1_������Ʈ_Ÿ�ڿ��� {

	/*
	 * # Ÿ�ڿ��� ����[1�ܰ�] 1. ������ ���´�.(shuffle) 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ���� ��) ���� :
	 * mysql �Է� : mydb ���� : mysql �Է� : mysql <--- ������ ���߸�, ���� ���� ���� ���� : jsp
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = { "java", "mysql", "jsp", "spring" };

		for (String str : words) {
			boolean check = false;
			while (true) {
				System.out.println("���� : " + str);
				String ans = scan.next();
				if (ans.length() == str.length()) {
					for (int j = 0; j < str.length(); j++) {
						if (str.charAt(j) == ans.charAt(j)) {
							check = true;
						} else {
							check = false;
						}
					}
				}
				if (check == true) {
					break;
				}
			}
		}
	}
}