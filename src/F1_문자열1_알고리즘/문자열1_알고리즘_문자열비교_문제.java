package F1_문자열1_알고리즘;

import java.util.Scanner;

public class 문자열1_알고리즘_문자열비교_문제 {
	/*
	 * # 문자열 비교 . equals() 메서드 사용없이 equals 직접구현 문자의 일치여부 비교 예) 코끼리 입력 = 티라노사우루스 출력 =
	 * false
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String name = "코끼리";

		System.out.print("동물 이름을 입력하세요 : "); // ex) 티라노사우루스
		String myName = scan.next();
		int size = name.length();
		int count = 0;
		if (name.length() == myName.length()) {
			for (int i = 0; i < size; i++) {
				if (name.charAt(i) == myName.charAt(i)) {
					count++;
				}
			}
		}
		if (count == size) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}