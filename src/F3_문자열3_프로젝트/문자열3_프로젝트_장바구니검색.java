package F3_���ڿ�3_������Ʈ;

public class ���ڿ�3_������Ʈ_��ٱ��ϰ˻� {
	public static void main(String[] args) {
		String itemData = "1001/����,1002/�����,1003/ĭ��";
		String userData = "3001/�̸���,3002/��ö��,3003/�̿���";

		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";

		// ����1) ȸ���� ������ ���Ÿ�� ���
		// ��) �̸���==> ����3,ĭ��1 / ��ö�� ==> ����1 / �̿��� ==> ����2,�����1
		String[] userdata = userData.split(",");
		String[] itemdata = itemData.split(",");
		String[] cartdata = cartData.split("\n");
		for (int i = 0; i < userdata.length; i++) {
			String[] user = userdata[i].split("/");
			System.out.print(user[1] + " ==> ");
			for (int j = 0; j < itemdata.length; j++) {
				String[] item = itemdata[j].split("/");
				int count = 0;
				for (int k = 0; k < cartdata.length; k++) {
					String[] cart = cartdata[k].split("/");
					if (user[0].equals(cart[0])) {
						if (item[0].equals(cart[1])) {
							count++;
						}
					}
				}
				if (count != 0) {
					System.out.print(item[1] + count + " ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------");
		// ����2) �����ۺ��� ������ ȸ���̸� ���
		// ��) ����==> �̸���,��ö��,�̿��� / �����==> �̿��� / ĭ��==> �̸���
		for (int i = 0; i < itemdata.length; i++) {
			boolean check[] = new boolean[3];
			String[] item = itemdata[i].split("/");
			System.out.print(item[1] + " ==> ");
			for (int j = 0; j < cartdata.length; j++) {
				String[] cart = cartdata[j].split("/");
				for (int k = 0; k < userdata.length; k++) {
					String[] user = userdata[k].split("/");
					if (item[0].equals(cart[1])) {
						if (cart[0].equals(user[0])) {
							if (check[k] == false) {
								System.out.print(user[1] + " ");
								check[k] = true;
							}
						}
					}
				}
			}
			System.out.println();
		}
	}
}
