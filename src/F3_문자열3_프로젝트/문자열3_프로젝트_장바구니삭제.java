package F3_���ڿ�3_������Ʈ;

public class ���ڿ�3_������Ʈ_��ٱ��ϻ��� {
	public static void main(String[] args) {

		String item = "ĭ��/�����/����/�ݶ�/���̴�";
		String id = "qwer/abcd/java";

		String cart = "";
		cart += "qwer/����\n";
		cart += "qwer/�����\n";
		cart += "abcd/�ݶ�\n";
		cart += "java/ĭ��\n";
		cart += "qwer/ĭ��\n";
		cart += "java/����\n";
		cart += "abcd/���̴�";

		String input[][] = { { "qwer", "3" }, { "abcd", "1" } };
//		 cart�����ʹ� ���� ��ٱ��� ��Ȳ�̴�.
//		 input�����ʹ� ������ ��û�ѵ������̴�.
//		
//		 qwer�� ���̵��̰�  3 �� ������ȣ�̴�.
//		 qwer ���忡���� ���ξ������� 3���ۿ� ������ ĭ�ݸ� ��������� 3�� 
//		 ���������� ���� ��ü �����Ϳ����� 5��° �������̴�. 
//		
//		 ���������� abcd �� �ݶ�� ���̴� �� �����߰� ,
//		 �ݶ� ��������� 1���� �����Ѱ��̰� �����δ�3���������� �����Ǿ���Ѵ�.
//		
//		 [ ���� ]
//		    cart += "qwer/����\n";
//			cart += "qwer/�����\n";
//			cart += "java/ĭ��\n";
//			cart += "java/����\n";
//			cart += "abcd/���̴�";
		String itemData[] = item.split("/");
		String idData[] = id.split("/");
		String cartData[] = cart.split("\n");
		int index[] = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int count = 0;
			for (int j = 0; j < cartData.length; j++) {
				String[] cartdata = cartData[j].split("/");
				if (input[i][0].equals(cartdata[0])) {
					count++;
					if (count == Integer.parseInt(input[i][1])) {
						index[i] = j;
					}
				}
			}
		}
		cart = "";
		for (int i = 0; i < cartData.length; i++) {
			boolean check = false;
			for (int j = 0; j < index.length; j++) {
				if (index[j] == i) {
					check = true;
				}
			}
			if (check == false) {
				cart += cartData[i];
				cart += "\n";
			}
		}
		System.out.println(cart);
	}
}