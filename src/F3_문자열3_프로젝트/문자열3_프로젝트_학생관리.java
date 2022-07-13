package F3_문자열3_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열3_프로젝트_학생관리 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		String[][] dataList = new String[max][5];

		// 번호 , 아이디 , 비밀번호 , 이름 , 점수
		String sample[][] = { { "1001", "qwer", "1234", "김철수", "10" }, { "1002", "asdf", "2345", "이영희", "30" }, };

		// 이차원 배열을 이용해서 crud 구현
		int size = 0;
		for (int i = 0; i < sample.length; i++) {
			for (int j = 0; j < sample[i].length; j++) {
				dataList[i][j] = sample[i][j];
			}
			size += 1;
		}

		while (true) {
			System.out.print(" [0]종료 [1]가입 [2]탈퇴 [3]수정 [4]검색 [5] 전체출력 ");
			int sel = scan.nextInt();
			scan.nextLine();
			if (sel == 0) {
				break;
			} else if (sel == 1) {

				System.out.println("회원가입");
				int count = 0;
				int maxnum = Integer.parseInt(dataList[size - 1][0]);
				while (true) {
					if (count == 0) {
						maxnum++;
						dataList[size][count] = maxnum + "";
						count++;
						continue;
					} else if (count == 1) {
						System.out.print("아이디 입력 : ");
					} else if (count == 2) {
						System.out.print("비밀번호 입력 : ");
					} else if (count == 3) {
						System.out.print("이름 입력 : ");
					} else if (count == 4) {
						System.out.print("점수 입력 : ");
					} else if (count == 5) {
						System.out.println("가입 성공");
						size++;
						break;
					}
					String input = scan.nextLine();
					if (count == 1 || count == 2) {
						boolean check = false;
						for (int i = 0; i < dataList.length; i++) {
							if (input.equals(dataList[i][count])) {
								check = true;
								break;
							}
						}
						if (check == true) {
							System.out.println("다시 입력하세요.");
							continue;
						}
					}
					dataList[size][count] = input;
					count++;
				}
			} else if (sel == 2) {
				System.out.print("아이디 입력 : ");
				String input = scan.nextLine();
				int index = 0;
				boolean check = false;
				for (int i = 0; i < dataList.length; i++) {
					for (int j = 0; j < dataList[i].length; j++) {
						if (input.equals(dataList[i][j])) {
							check = true;
							index = i;
						}
					}
				}
				if (check == true) {
					System.out.println(Arrays.toString(dataList[index]));
					System.out.println("탈퇴하시겠습니까?");
					System.out.print("[1.예][2.아니오]");
					sel = scan.nextInt();
					if (sel == 1) {
						for (int i = index; i < size - 1; i++) {
							for (int j = 0; j < dataList[i].length; j++) {
								if (j != 0) {
									dataList[i][j] = dataList[i + 1][j];
								}
								dataList[size - 1][j] = "";
							}
						}
						size--;
					} else if (sel == 2) {
						break;
					}
				} else {
					System.out.println("아이디를 찾을 수 없습니다.");
				}

			} else if (sel == 3) {
				System.out.println("아이디 입력 : ");
				String id = scan.nextLine();
				int index = 0;
				for (int i = 0; i < dataList.length; i++) {
					if (id.equals(dataList[i][1])) {
						index = i;
					}
				}
				while (true) {
					System.out.println("수정할 내용을 선택하세요.");
					System.out.println("[1.아이디][2.비밀번호][3.이름][4.점수][0.뒤로가기]");
					sel = scan.nextInt();
					boolean check = false;
					if (sel == 1) {
						System.out.print("변경할 아이디 입력 : ");
						String changeid = scan.nextLine();
						for (int i = 0; i < dataList.length; i++) {
							if (changeid.equals(dataList[i][sel])) {
								System.out.println("동일한 아이디가 있습니다.");
								check = true;
								break;
							}
						}
						if (check == false) {
							dataList[index][sel] = changeid;
						}
					} else if (sel == 2) {
						System.out.print("변경할 비밀번호 입력 : ");
						String changepw = scan.nextLine();
						for (int i = 0; i < dataList.length; i++) {
							if (changepw.equals(dataList[i][sel])) {
								System.out.println("사용할 수 없는 비밀번호입니다.");
								check = true;
								break;
							}
						}
						if (check == false) {
							dataList[index][sel] = changepw;
						}
					} else if (sel == 3) {
						System.out.print("변경할 이름 입력 : ");
						String name = scan.nextLine();
						System.out.println("변경하시겠습니까?");
						System.out.print("[1.예][2.아니오]");
						int sel1 = scan.nextInt();
						if (sel1 == 1) {
							dataList[index][sel] = name;
						} else {
							break;
						}
					} else if (sel == 4) {
						System.out.print("변경할 점수 입력 : ");
						String score = scan.nextLine();
						System.out.println("변경하시겠습니까?");
						System.out.print("[1.예][2.아니오]");
						int sel1 = scan.nextInt();
						if (sel1 == 1) {
							dataList[index][sel] = score;
						} else {
							break;
						}
					} else if (sel == 0) {
						break;
					}
				}
			} else if (sel == 4) {
				System.out.print("검색 : ");
				String seach = scan.nextLine();
				for (int i = 0; i < dataList.length; i++) {
					for (int j = 0; j < dataList[i].length; j++) {
						if (seach.equals(dataList[i][j])) {
							System.out.println(Arrays.toString(dataList[i]));
						}
					}
				}
			} else if (sel == 5) {
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < dataList[i].length; j++) {
						System.out.print(dataList[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
	}
}