package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾ�˻�_���� {
	/*
	 * # �ܾ� �˻� 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�. 2. �ܾ �����ϸ� ��������Ѵ�. 3.
	 * �κа˻��� �Ǿ���Ѵ�. ��) ch ==> school , teacher , child
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] text = { "school", "teacher", "child", "father", "love" };
		System.out.println(text);

		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		int size1 = text.length;
		int size2 = word.length();
		for (int i = 0; i < size1; i++) {
			int size3 = text[i].length();
			if (size2 == size3) {
				if (word.equals(text[i])) {
					System.out.println(text[i]);
				}
			} else {
				for (int j = 0; j < size3 - size2; j++) {
					String t = text[i].substring(j, j + size2);
					if (word.equals(t)) {
						System.out.print(text[i] + " ");
						break;
					}
				}
			}
		}
	}
}
