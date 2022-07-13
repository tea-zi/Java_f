package F1_문자열1_알고리즘;

import java.util.Scanner;

public class 문자열1_알고리즘_끝말잇기_문제 {
	public static void main(String[] args) {
		/*
		 * # 끝말잇기 게임을 만들어보세요.
		 * 
		 * 제시어 : 자전거 입력 : 거미 제시어 : 거미 입력 : 미술 ...
		 */
		Scanner scan = new Scanner(System.in);
		String start = "자전거";
		System.out.println("제시어 : " + start);
		while (true) {
			int size = start.length();
			System.out.print("입력 : ");
			String in = scan.next();
			if (start.substring(size - 1).equals(in.substring(0, 1))) {
				// start.charAt(start.length()-1) == input.charAt(0)
				// 마지막 글자를 char로 바꿔서 비교 하는 방법도 있다.
				start = in;
				System.out.println("제시어 : " + start);
			} else {
				System.out.println("땡!!!");
				break;
			}
		}
	}

}