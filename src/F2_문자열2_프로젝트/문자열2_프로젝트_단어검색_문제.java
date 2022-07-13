package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_단어검색_문제 {
	/*
	 * # 단어 검색 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다. 2. 단어가 존재하면 전부출력한다. 3.
	 * 부분검색도 되어야한다. 예) ch ==> school , teacher , child
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] text = { "school", "teacher", "child", "father", "love" };
		System.out.println(text);

		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.nextLine();
		int size1 = text.length;
		int size2 = word.length();
		for (int i = 0; i < size1; i++) {
			int size3 = text[i].length();
			if (size2 == size3) {
				if (word.equals(text[i])) {
					System.out.println(text[i]);
				}
			} else {
				for (int j = 0; j < size3 - size2; j++) {
					String t = text[i].substring(j, j + size2);
					if (word.equals(t)) {
						System.out.print(text[i] + " ");
						break;
					}
				}
			}
		}
	}
}
