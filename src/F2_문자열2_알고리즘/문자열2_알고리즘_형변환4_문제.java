package F2_���ڿ�2_�˰���;

public class ���ڿ�2_�˰���_����ȯ4_���� {
	public static void main(String[] args) {

		String str = "��ö��/87,�̸���/42,�̿���/95";

		// �� �����Ϳ��� �õ��� ������ �ٽ� ���ڿ��� ����

		// 1) ���ڿ��� �߶� �迭�� �����Ѵ�.
		// 2) �迭���� �õ��� �����Ѵ�
		// 3) �����ѹ迭�� �ٽ� ���ڿ��� �����.

		// str = "��ö��/87,�̿���/95";
		String[] st = str.split(",");
		String[] name = new String[st.length];
		int score[] = new int[st.length];
		int min = 100;
		int index = 0;
		for (int i = 0; i < st.length; i++) {
			String[] s = st[i].split("/");
			for (int j = 0; j < s.length; j++) {
				if (j == 0) {
					name[i] = s[j];
				} else {
					score[i] = Integer.parseInt(s[j]);
				}
			}
			if (min > score[i]) {
				min = score[i];
				index = i;
			}
		}
		str = "";
		int size = score.length;
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			if (index != i) {
				str += name[i];
				str += "/";
				str += score[i];
				if (i != size - 1) {
					str += ",";
				}
			}
		}
		System.out.println(str);
	}

}