package F1_문자열1_프로젝트;

import java.util.Scanner;

public class 문자열1_프로젝트_타자연습 {

	/*
	 * # 타자연습 게임[1단계] 1. 문제를 섞는다.(shuffle) 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료 예) 문제 :
	 * mysql 입력 : mydb 문제 : mysql 입력 : mysql <--- 정답을 맞추면, 다음 문제 제시 문제 : jsp
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = { "java", "mysql", "jsp", "spring" };

		for (String str : words) {
			boolean check = false;
			while (true) {
				System.out.println("문제 : " + str);
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