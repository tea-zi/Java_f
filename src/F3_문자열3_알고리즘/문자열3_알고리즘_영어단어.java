package F3_���ڿ�3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����ܾ� {
	public static void main(String[] args) {
		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 100;
		String word = "performance";
		String meaning = "����";
		int size = word.length();
		int check[] = new int[size]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.

		while (true) {
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			int count = 0;
			for (int i = 0; i < size; i++) {
				if (check[i] == 3) {
					System.out.print(word.charAt(i));
					count++;
				} else {
					System.out.print("*");
				}
			}
			if (count == check.length) {
				System.out.println("\n����");
				break;
			}
			System.out.println();
			System.out.println("����ܾ �Է��ϼ��� >>> ");
			String me = scan.next();
			if (word.equals(me)) {
				System.out.println("����!!!");
				break;
			} else {
				boolean ch = false;
				for (int i = 0; i < me.length(); i++) {
					for (int j = 0; j < word.length(); j++) {
						if (me.charAt(i) == word.charAt(j)) {
							check[j] = 3;
							ch = true;
						}
					}
				}
				if (ch == false) {
					int r = ran.nextInt(size);
					check[r] = 3;
				}
			}
		}

	}
}