package F3_���ڿ�3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����Ÿ�� {

	/*
	 * # Ÿ�ڿ��� ����[2�ܰ�] 1. ������ ���´�.(shuffle) 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ���� 3. ��
	 * ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ��� ��) ���� : mys*l �Է� : mysql <--- ������ ���߸�, ���� ����
	 * ���� ���� : *sp �Է� : jsp ...
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] words = { "java", "mysql", "jsp", "spring" };
		for (int i = 0; i < words.length;) {
			int r = ran.nextInt(words[i].length());
			System.out.print("���� : ");
			for (int j = 0; j < words[i].length(); j++) {
				if (r == j) {
					System.out.print("*");
				} else {
					System.out.print(words[i].charAt(j));
				}
			}
			System.out.println();
			System.out.print("�Է� : ");
			String text = scan.nextLine();
			if (words[i].equals(text)) {
				System.out.println("����!!!");
				i++;
			} else {
				System.out.println("����!!!");
			}
		}
	}
}