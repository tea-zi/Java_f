package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾü_���� {
	/*
	 * # �ܾ� ��ü�ϱ�(replace) 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�, 2. ��ü���ִ� ����� �����Ѵ�. ��)
	 * Life is too short. �����ϰ� ���� �ܾ��Է� : Life �ٲ� �ܾ��Է� : Time
	 * 
	 * Time is too short.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		String[] t = text.split(" ");
		System.out.print("�ٲ� �ܾ��Է� : ");
		String word2 = scan.nextLine();
		for (int i = 0; i < t.length; i++) {
			if (word.equals(t[i])) {
				t[i] = word2;
				break;
			} else {
				int size1 = t[i].length();
				int size2 = word.length();
				boolean check = false;
				for (int j = 0; j < size1; j++) {
					if (size1 == size2) {
						char s = t[i].charAt(j);
						char w = word.charAt(j);
						if (s != w) {
							if (s != w + 32) {
								if (s != w - 32) {
									check = true;
								}
							}
						}
					} else {
						check = true;
					}
				}
				if (check == false) {
					t[i] = word2;
					break;
				}
			}
		}
		text = "";
		for (int i = 0; i < t.length; i++) {
			text += t[i];
			text += " ";
		}
		System.out.println(text);
	}
}