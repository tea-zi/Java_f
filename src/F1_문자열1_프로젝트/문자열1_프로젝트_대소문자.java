package F1_문자열1_프로젝트;

import java.util.Scanner;

public class 문자열1_프로젝트_대소문자 {
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
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pw = scan.next();
		int idcount = 0;
		int pwcount = 0;
//		System.out.println(힌트1.charAt(0) - 힌트2.charAt(0));
		char cap = 0;
		if (dbid.length() == id.length()) {
			for (int i = 0; i < dbid.length(); i++) {
				if (dbid.charAt(i) == id.charAt(i)) {
					idcount++;
				} else {
					if (id.charAt(i) - 32 < 65) {
						cap = id.charAt(i);
						if (dbid.charAt(i) == cap + 32) {
							idcount++;
						}
					} else {
						cap = id.charAt(i);
						if (dbid.charAt(i) == id.charAt(i) - 32) {
							idcount++;
						}
					}

				}
			}
			System.out.println(idcount);
			if (idcount == dbid.length()) {
				System.out.println("id 일치");
			} else {
				System.out.println("불일치");
			}
		}
//		System.out.println(dbpw.charAt(0) + 32);
		if (dbpw.length() == pw.length()) {
			for (int i = 0; i < dbpw.length(); i++) {
				if (dbpw.charAt(i) == pw.charAt(i)) {
					pwcount++;
				} else {
					cap = (char) (pw.charAt(i) - 32);
					if (cap < 65) {
						cap = (char) (pw.charAt(i) + 32);
					}
					if (dbpw.charAt(i) == cap) {
						pwcount++;
					}
				}
			}
			System.out.println(pwcount);
			if (pwcount == dbpw.length()) {
				System.out.println("pw 일치");
			} else {
				System.out.println("불일치");
			}
		}
		if (idcount == dbid.length() && pwcount == dbpw.length())

		{
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}