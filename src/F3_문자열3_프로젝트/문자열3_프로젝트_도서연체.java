package F3_문자열3_프로젝트;

public class 문자열3_프로젝트_도서연체 {

	public static void main(String[] args) {
		String rentalData = "";
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2020-11-25/1001\n";
		rentalData += "40143/외국어 공부의 감각/2020-11-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2020-11-27/1041\n";
		rentalData += "26543/아무튼,외국어/2020-12-01/1034";

		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";

		String[] rental = rentalData.split("\n");
		String[] user = userData.split("\n");
		for (int i = 1; i < rental.length; i++) {
			String[] ren = rental[i].split("/");
			for (int j = 1; j < user.length; j++) {
				String[] use = user[j].split("/");
//				System.out.println("ren[3] : " + ren[3] + " use[0] : " + use[0]);
				if (ren[3].equals(use[0])) {
					if (ren[0].equals(use[1])) {
						String[] rentday = ren[2].split("-");
						int day = Integer.parseInt(rentday[2]);
						int month = Integer.parseInt(rentday[1]);
						int c = Integer.parseInt(use[2]);
						day += c;
						if (day > 30) {
							month++;
							day -= 30;
						}
						if (month == 12) {
							if (day > 4) {
								System.out.println(use[0]);
							}
						}
					}

				}
			}
		}
		// 위 데이터는 도서관 책 대여 데이터이다.
		// 오늘은 12월4일 이라고했을때 연체한 회원번호 출력
	}

}