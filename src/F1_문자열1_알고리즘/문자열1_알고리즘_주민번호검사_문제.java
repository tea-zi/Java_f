package F1_���ڿ�1_�˰���;

public class ���ڿ�1_�˰���_�ֹι�ȣ�˻�_���� {
	public static void main(String[] args) {

		String jumin = "890101-2012932";

		// ���� 1) ���� ���
		// ���� 1) ����
		if (jumin.charAt(7) == '1') {
			System.out.println("����");
		} else if (jumin.charAt(7) == '2') {
			System.out.println("����");
		}
		// ���� 2) ���� ���
		// ���� 2) 30��
		String a = jumin.substring(0, 2);
		int b = Integer.parseInt(a);
		System.out.println(b);
		System.out.println("���� : " + (122 - b));
	}

}