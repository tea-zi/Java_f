package F1_���ڿ�1_������Ʈ;

import java.util.Scanner;

public class ���ڿ�1_������Ʈ_��ҹ���_����2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String dbid = "q1w2e3r4";
		String dbpw = "r4e3w2q1";

		String str0 = "0123456789";
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String id = "Q1w2E3r4";
		boolean check = false;
		if (dbid.length() != id.length()) {
			check = true;
		} else {
			for (int i = 0; i < dbid.length(); i++) {
				char dbc = dbid.charAt(i);
				char idc = id.charAt(i);
//				if(dbc == idc) {
//					System.out.println(dbc + " " + idc);
//				}
				if (dbc != idc) {

					for (int j = 0; j < str0.length(); j++) {
						if (dbc == str0.charAt(j)) {
							if (dbc != idc) {
								check = true;
								System.out.println(dbc + " " + idc);
								break;
							}

						}
					}

					for (int j = 0; j < str1.length(); j++) {
						if (str1.charAt(j) == dbc) {
							if (str2.charAt(j) != idc) {
								check = true;
								System.out.println(dbc + " " + idc);
								break;
							}
						} else if (str2.charAt(j) == dbc) {
							if (str1.charAt(j) != idc) {
								check = true;
								System.out.println(dbc + " " + idc);
								break;
							}
						}
					}

				}
			}
		}
		if (check == false) {
			System.out.println("��ġ");
		} else {
			System.out.println("����ġ");
		}
	}
}
