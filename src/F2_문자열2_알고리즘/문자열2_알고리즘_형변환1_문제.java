package F2_���ڿ�2_�˰���;

public class ���ڿ�2_�˰���_����ȯ1_���� {
	public static void main(String[] args) {

		// ���ڿ� �Լ��� ����ؼ� Ǯ���

		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];
		int sum = 0;
		String[] st = str.split("/");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st[i]);
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(sum);
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = { 11, 100, 89 };
		String text = "";
		for (int i = 0; i < scores.length; i++) {
			text += scores[i];
			if (i != scores.length - 1) {
				text += "/";
			}
		}
		System.out.println(text);
	}

}