package F1_���ڿ�1_������Ʈ;

import java.util.Scanner;

public class ���ڿ�1_������Ʈ_��ҹ��� {
	/*
	 * ���̵�� ��й�ȣ �Է¹ް� �α������ ����) ��, ���̵�� ��й�ȣ�� 1) �빮�ڷ� �Է��ϴ� , 2) �ҹ��ڷ� �Է��ϴ� , 3) ���
	 * �Է��ϴ� ���� �νĵǾ���Ѵ�.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String dbid = "q1w2e3r4";
		String dbpw = "r4e3w2q1";

		String ��Ʈ1 = "abcdefghijklmnopqrstuvwxyz";
		String ��Ʈ2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.print("���̵� �Է� : ");
		String id = scan.next();
		System.out.print("��й�ȣ �Է� : ");
		String pw = scan.next();
		int idcount = 0;
		int pwcount = 0;
//		System.out.println(��Ʈ1.charAt(0) - ��Ʈ2.charAt(0));
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
				System.out.println("id ��ġ");
			} else {
				System.out.println("����ġ");
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
				System.out.println("pw ��ġ");
			} else {
				System.out.println("����ġ");
			}
		}
		if (idcount == dbid.length() && pwcount == dbpw.length())

		{
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
	}
}