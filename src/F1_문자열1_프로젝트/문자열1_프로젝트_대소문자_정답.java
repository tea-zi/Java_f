package F1_���ڿ�1_������Ʈ;

import java.util.Scanner;

public class ���ڿ�1_������Ʈ_��ҹ���_���� {
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
					char bb = ��Ʈ2.charAt(aa - 65);
					System.out.println("bb: " + bb);
					if (b != bb) {
						check = true;
					}
					System.out.println(a + " " + b + " " + bb);
				} else if (aa >= 97 && aa <= 122) {
					char bb = ��Ʈ1.charAt(aa - 97);
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
