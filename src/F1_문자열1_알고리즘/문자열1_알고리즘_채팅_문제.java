package F1_���ڿ�1_�˰���;

public class ���ڿ�1_�˰���_ä��_���� {
	/*
	 * ��ä���� �Ʒ��� ���� ����ϴµ� , ö���� �������� , ����� ���������ķ� ����غ���.
	 */
	public static void main(String[] args) {

		String wordList[][] = { { "ö��", "����� �ȳ�" }, { "����", "ö���� �ȳ�" }, { "ö��", "���� ���ɰ��� ������?" },
				{ "����", "�ƴ� ����־�. ������ ����." }, { "ö��", "�׷� ������ ����." } };

		/*
		 * 
		 * "����� �ȳ�" "ö���� �ȳ�" "���� ���ɰ��� ������?" "�ƴ� ����־�. ������ ����." "�׷� ������ ����."
		 */
		for (int i = 0; i < wordList.length; i++) {
			if (wordList[i][0].equals("ö��")) {
				System.out.printf("%30s\n", wordList[i][1]);
			} else if (wordList[i][0].equals("����")) {
				System.out.printf("%-30s\n", wordList[i][1]);
			}
		}
		System.out.println("----------------------------------");
		for (int i = wordList.length - 1; i >= 0; i--) {
			if (wordList[i][0].equals("ö��")) {
				System.out.printf("%-30s\n", "ö��");
				System.out.printf("%-30s\n", wordList[i][1]);
			} else if (wordList[i][0].equals("����")) {
				System.out.printf("%30s\n", "����");
				System.out.printf("%30s\n", wordList[i][1]);
			}
		}
	}

}