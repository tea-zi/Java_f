package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾü_���� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("���� �ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		String front = "";
		String end = "";
		for (int i = 0; i < text.length() - word.length() + 1; i++) {
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (text.charAt(i + j) == word.charAt(j)) {
					count += 1;
				}
			}
			if (count == word.length()) {
				front = text.substring(0, i);
				end = text.substring(i + word.length());
			}
		}

		System.out.print("������ �ܾ �Է��ϼ��� : ");
		String word2 = scan.nextLine();

		System.out.println(front + word2 + end);
	}

}