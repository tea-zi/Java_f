package F1_���ڿ�1_�˰���;

import java.util.Scanner;

public class ���ڿ�1_�˰���_���ڿ���_���� {
	/*
	 * # ���ڿ� �� . equals() �޼��� ������ equals �������� ������ ��ġ���� �� ��) �ڳ��� �Է� = Ƽ�����罺 ��� =
	 * false
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String name = "�ڳ���";

		System.out.print("���� �̸��� �Է��ϼ��� : "); // ex) Ƽ�����罺
		String myName = scan.next();
		int size = name.length();
		int count = 0;
		if (name.length() == myName.length()) {
			for (int i = 0; i < size; i++) {
				if (name.charAt(i) == myName.charAt(i)) {
					count++;
				}
			}
		}
		if (count == size) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}