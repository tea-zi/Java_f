package F1_���ڿ�1_�˰���;

import java.util.Scanner;

public class ���ڿ�1_�˰���_�����ձ�_���� {
	public static void main(String[] args) {
		/*
		 * # �����ձ� ������ ��������.
		 * 
		 * ���þ� : ������ �Է� : �Ź� ���þ� : �Ź� �Է� : �̼� ...
		 */
		Scanner scan = new Scanner(System.in);
		String start = "������";
		System.out.println("���þ� : " + start);
		while (true) {
			int size = start.length();
			System.out.print("�Է� : ");
			String in = scan.next();
			if (start.substring(size - 1).equals(in.substring(0, 1))) {
				// start.charAt(start.length()-1) == input.charAt(0)
				// ������ ���ڸ� char�� �ٲ㼭 �� �ϴ� ����� �ִ�.
				start = in;
				System.out.println("���þ� : " + start);
			} else {
				System.out.println("��!!!");
				break;
			}
		}
	}

}