package F3_���ڿ�3_�˰���;

import java.util.Scanner;

public class ���ڿ�3_�˰���_��ٱ��� {

//	 * # ���θ� [��ٱ���] 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�. (1) ��� (2) �ٳ��� (3) ����
//	 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�. 3. �α��� ȸ�����̵� �� �� ���� ù��° ���� �����Ѵ�. 4. �ش� ȸ���� ������
//	 * ��ǰ�� �� ���� �ι�° ���� �����Ѵ�. 
//	 * ��) 
//	 * { {qwer, ���}, 
//	 *   {javaking, �ٳ���}, 
//	 * 	 {abcd, ���}, 
//	 *   {qwer, ����}, 
//	 *   {qwer, ���}, ... } 
//	 * 
//	 * 5. ��ٱ��� �޴��� �����ϸ� �ڱⰡ �� ��ǰ�� ���̵����Ѵ�. 
//	��) qwer ==> ��� , ���� , ���

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] idList = { "qwer", "javaking", "abcd" };
		String[] pwList = { "1111", "2222", "3333" };

		int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];

		int count = 0;

		String[] items = { "���", "�ٳ���", "����" };

		int log = -1;

		while (true) {

			System.out.println("[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (log == -1) {
					scan.nextLine();
					System.out.print("���̵� �Է� : ");
					String id = scan.nextLine();
					System.out.println(id);
					System.out.print("��й�ȣ �Է� : ");
					String pw = scan.nextLine();
					for (int i = 0; i < idList.length; i++) {
						System.out.println(id);
						System.out.println(idList[i]);
						System.out.println(id.equals(idList[i]));
						if (idList[i].length() == id.length()) {
							if (idList[i].equals(id)) {
								if (pwList[i].equals(pw)) {
									log = i;
									System.out.println("�α��� ����");
									break;
								}
							}
						}
					}
				} else {
					System.out.println("�α��� �����Դϴ�.");
				}
			} else if (sel == 2) {
				log = -1;
				System.out.println("�α׾ƿ�");
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("�α����� �̿����ּ���.");
				} else {
					while (true) {
						System.out.println("[1.���][2.�ٳ���][3.����][0.�ڷΰ���]");
						sel = scan.nextInt();
						if (sel == 1) {
							cartList[count][0] = idList[log];
							cartList[count][1] = "���";
							count++;
						} else if (sel == 2) {
							cartList[count][0] = idList[log];
							cartList[count][1] = "�ٳ���";
							count++;
						} else if (sel == 3) {
							cartList[count][0] = idList[log];
							cartList[count][1] = "����";
							count++;
						} else if (sel == 0) {
							break;
						}
					}
				}
			} else if (sel == 4) {
				System.out.println("��ٱ���");
				for (int i = 0; i < idList.length; i++) {
					System.out.print(idList[i] + " : ");
					int ea = 0;
					for (int j = 0; j < cartList.length; j++) {
						if (idList[i].equals(cartList[j][0])) {
							System.out.print("[" + cartList[j][1] + "]");
						}
					}
					System.out.println();
				}
			} else if (sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}