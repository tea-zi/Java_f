package F4_문자열4_FINAL;

public class 문자열4_프로젝트_수열_문제 {
//    	다음은 읽고 말하기 수열의 규칙입니다.
//  
//  		1, 11, 12, 1121, 122111, 112213
//  
//	 	첫번째 수열 : 1
//	 	두번째 수열 : 1이 1개 = 11
//	 	세번째 수열 : 1이 2개 = 12
//	 	네번째 수열 : 1이 1개, 2가 1개 = 1121
//	 	다섯번째 수열 : 1이 2개, 2가 1개, 1이 1개 = 122111
//	 	여섯번재 수열 : 1이 1개, 2가 2개, 1이 3개 = 112213
//	 	
//	 	
//	 	이러한 수열의 10번째 숫자를 프로그램을 만들어 찾으시오.
	public static void main(String[] args) {
		String num = "1";
		System.out.println(num);
		for (int i = 0; i < 9; i++) {
			int size = num.length();
			String temp = num;
			char c = num.charAt(0);
			int count = 1;
			num = "";
			num += c;
			for (int j = 1; j < size; j++) {
				if (temp.charAt(j) == c) {
					count++;
				} else {
					c = temp.charAt(j);
					num += count;
					num += c;
					count = 1;
				}
			}
			num += count;
			System.out.println(num);
		}
	}
}