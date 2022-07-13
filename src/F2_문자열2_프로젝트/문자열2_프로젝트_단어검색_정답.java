package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_단어검색_정답 {
	/*
	 * # 단어 검색 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다. 2. 단어가 존재하면 출력한다. 3. 부분검색도
	 * 되어야한다. 예) ch ==> school , teacher , child
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] text = { "school", "teacher", "child", "father", "love" };
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.nextLine();

		int wordCount = 0;
		String[] wordList = new String[text.length];

		for (int i = 0; i < text.length; i++) {
			String sample = text[i];
			for (int j = 0; j < sample.length() - word.length() + 1; j++) {
				int count = 0;
				for (int k = 0; k < word.length(); k++) {
					if (sample.charAt(j + k) == word.charAt(k)) {
						count += 1;
					}
				}
				if (count == word.length()) {
					wordList[wordCount] = sample;
					wordCount += 1;
					break;
				}
			}
		}
		for (int i = 0; i < wordCount; i++) {
			System.out.println(wordList[i]);
		}
	}

}