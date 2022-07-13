package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_숫자검사_문제 {
	/*
	 * # 문자열 속 숫자검사 예) adklajsiod 문자만 있다. 예) 123123 숫자만 있다. 예) dasd12312asd 문자와 숫자가
	 * 섞여있다.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.print("입력 : ");
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
			System.out.println("숫자만 있다.");
		} else if (count2 == size) {
			System.out.println("문자만 있다.");
		} else {
			System.out.println("문자와 숫자가 섞어있다.");
		}
	}

}
