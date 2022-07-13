package F3_문자열3_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 문자열3_알고리즘_랜덤타자 {

	/*
	 * # 타자연습 게임[2단계] 1. 문제를 섞는다.(shuffle) 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료 3. 단
	 * 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력 예) 문제 : mys*l 입력 : mysql <--- 정답을 맞추면, 다음 문제
	 * 제시 문제 : *sp 입력 : jsp ...
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] words = { "java", "mysql", "jsp", "spring" };
		for (int i = 0; i < words.length;) {
			int r = ran.nextInt(words[i].length());
			System.out.print("문제 : ");
			for (int j = 0; j < words[i].length(); j++) {
				if (r == j) {
					System.out.print("*");
				} else {
					System.out.print(words[i].charAt(j));
				}
			}
			System.out.println();
			System.out.print("입력 : ");
			String text = scan.nextLine();
			if (words[i].equals(text)) {
				System.out.println("정답!!!");
				i++;
			} else {
				System.out.println("오답!!!");
			}
		}
	}
}