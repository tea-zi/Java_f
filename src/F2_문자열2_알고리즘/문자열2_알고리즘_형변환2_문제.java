package F2_���ڿ�2_�˰���;

public class ���ڿ�2_�˰���_����ȯ2_���� {
	public static void main(String[] args) {

		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���

		String str = "��ö��/87,�̸���/42,�̿���/95";

		String[] name = new String[3]; // ��ö��,�̸���,�̿���
		int[] score = new int[3]; // 87,42,95
		String[] st = str.split(",");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
			String[] s = st[i].split("/");
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[j]);
				if (j == 0) {
					name[i] = s[j];
				} else {
					score[i] = Integer.parseInt(s[j]);
				}
			}
		}
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}

}