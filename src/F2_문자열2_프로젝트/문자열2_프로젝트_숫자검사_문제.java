package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_���ڰ˻�_���� {
	/*
	 * # ���ڿ� �� ���ڰ˻� ��) adklajsiod ���ڸ� �ִ�. ��) 123123 ���ڸ� �ִ�. ��) dasd12312asd ���ڿ� ���ڰ�
	 * �����ִ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.print("�Է� : ");
		String text = scan.next();
		int size = text.length();
		int count1 = 0;
		int count2 = 0;
		int count = 0;
		for (int i = 0; i < size; i++) {
			char te = text.charAt(i);
			System.out.println(te);
			boolean num = false;
			boolean word = false;
			for (int j = 0; j < str1.length(); j++) {
				if (te != str1.charAt(j)) {
					if (te != str2.charAt(j)) {
						word = true;
					}
				} else {
					word = false;
					num = true;
					break;
				}
			}
			if (num == false) {
				count1++;
			}
			if (word == false) {
				count2++;
			}
		}
		System.out.println("count1 : " + count1);
		System.out.println("count2 : " + count2);
		if (count1 == size) {
			System.out.println("���ڸ� �ִ�.");
		} else if (count2 == size) {
			System.out.println("���ڸ� �ִ�.");
		} else {
			System.out.println("���ڿ� ���ڰ� �����ִ�.");
		}
	}

}
