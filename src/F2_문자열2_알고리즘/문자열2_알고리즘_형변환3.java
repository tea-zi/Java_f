package F2_���ڿ�2_�˰���;

public class ���ڿ�2_�˰���_����ȯ3 {
	public static void main(String[] args) {

		// ����) �̸��� ������ �Ʒ��Ͱ��� �ϳ��� ���ڿ��� ����
		// ����) "��ö��/87,�̸���/42,�̿���/95"

		String[] name = { "��ö��", "�̸���", "�̿���" };
		int[] score = { 87, 42, 95 };

		String str = "";
		for (int i = 0; i < name.length; i++) {
			str += name[i] + "/" + score[i];
			if (i != name.length - 1) {
				str += ",";
			}
		}
		System.out.println(str);
	}

}