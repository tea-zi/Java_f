package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_단어교체_문제 {
	/*
	 * # 단어 교체하기(replace) 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아, 2. 교체해주는 기능을 구현한다. 예)
	 * Life is too short. 변경하고 싶은 단어입력 : Life 바꿀 단어입력 : Time
	 * 
	 * Time is too short.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		String[] t = text.split(" ");
		System.out.print("바꿀 단어입력 : ");
		String word2 = scan.nextLine();
		for (int i = 0; i < t.length; i++) {
			if (word.equals(t[i])) {
				t[i] = word2;
				break;
			} else {
				int size1 = t[i].length();
				int size2 = word.length();
				boolean check = false;
				for (int j = 0; j < size1; j++) {
					if (size1 == size2) {
						char s = t[i].charAt(j);
						char w = word.charAt(j);
						if (s != w) {
							if (s != w + 32) {
								if (s != w - 32) {
									check = true;
								}
							}
						}
					} else {
						check = true;
					}
				}
				if (check == false) {
					t[i] = word2;
					break;
				}
			}
		}
		text = "";
		for (int i = 0; i < t.length; i++) {
			text += t[i];
			text += " ";
		}
		System.out.println(text);
	}
}