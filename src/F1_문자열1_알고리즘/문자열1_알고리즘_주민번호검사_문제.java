package F1_문자열1_알고리즘;

public class 문자열1_알고리즘_주민번호검사_문제 {
	public static void main(String[] args) {

		String jumin = "890101-2012932";

		// 문제 1) 성별 출력
		// 정답 1) 여성
		if (jumin.charAt(7) == '1') {
			System.out.println("남성");
		} else if (jumin.charAt(7) == '2') {
			System.out.println("여성");
		}
		// 문제 2) 나이 출력
		// 정답 2) 30세
		String a = jumin.substring(0, 2);
		int b = Integer.parseInt(a);
		System.out.println(b);
		System.out.println("나이 : " + (122 - b));
	}

}