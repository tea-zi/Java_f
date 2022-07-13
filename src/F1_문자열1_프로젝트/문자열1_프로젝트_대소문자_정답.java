package F1_문자열1_프로젝트;

import java.util.Scanner;

public class 문자열1_프로젝트_대소문자_정답 {
	/*
	 * 아이디와 비밀번호 입력받고 로그인출력 조건) 단, 아이디와 비밀번호는 1) 대문자로 입력하던 , 2) 소문자로 입력하던 , 3) 섞어서
	 * 입력하던 전부 인식되어야한다.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String dbid = "q1w2e3r4";
		String dbpw = "r4e3w2q1";

		String 힌트1 = "abcdefghijklmnopqrstuvwxyz";
		String 힌트2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String db = "a1b2C";
		String id = "A1B2c";

		System.out.println("A : " + (int) 'A');
		System.out.println("Z : " + (int) 'Z');
		System.out.println("a : " + (int) 'a');
		System.out.println("z : " + (int) 'z');

		boolean check = false;
		for (int i = 0; i < db.length(); i++) {
			char a = db.charAt(i);
			char b = id.charAt(i);
			if (a != b) {
				System.out.println(db.charAt(i) + " " + id.charAt(i));
				int aa = (int) a;
				System.out.println("aa : " + aa);
				if (aa >= 65 && aa <= 90) {
					char bb = 힌트2.charAt(aa - 65);
					System.out.println("bb: " + bb);
					if (b != bb) {
						check = true;
					}
					System.out.println(a + " " + b + " " + bb);
				} else if (aa >= 97 && aa <= 122) {
					char bb = 힌트1.charAt(aa - 97);
					if (b != bb) {
						check = true;
					}
					System.out.println(a + " " + b + " " + bb);
				} else {
					check = false;
				}

			} else {
				check = true;
			}
		}
		System.out.println(check);
	}
}
