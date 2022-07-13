package F2_문자열2_알고리즘;

public class 문자열2_알고리즘_형변환2_문제 {
	public static void main(String[] args) {

		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력

		String str = "김철수/87,이만수/42,이영희/95";

		String[] name = new String[3]; // 김철수,이만수,이영희
		int[] score = new int[3]; // 87,42,95
		String[] st = str.split(",");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
			String[] s = st[i].split("/");
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[j]);
				if (j == 0) {
					name[i] = s[j];
				} else {
					score[i] = Integer.parseInt(s[j]);
				}
			}
		}
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}

}