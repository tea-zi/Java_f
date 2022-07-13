package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_단어교체_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("변경 하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		String front = "";
		String end = "";
		for (int i = 0; i < text.length() - word.length() + 1; i++) {
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (text.charAt(i + j) == word.charAt(j)) {
					count += 1;
				}
			}
			if (count == word.length()) {
				front = text.substring(0, i);
				end = text.substring(i + word.length());
			}
		}

		System.out.print("삽입할 단어를 입력하세요 : ");
		String word2 = scan.nextLine();

		System.out.println(front + word2 + end);
	}

}