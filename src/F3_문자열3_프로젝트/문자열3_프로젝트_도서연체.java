package F3_���ڿ�3_������Ʈ;

public class ���ڿ�3_������Ʈ_������ü {

	public static void main(String[] args) {
		String rentalData = "";
		rentalData += "å��ȣ/å����/�뿩��¥/ȸ����ȣ\n";
		rentalData += "20122/���ʷξ���/2020-11-25/1001\n";
		rentalData += "40143/�ܱ��� ������ ����/2020-11-27/1003\n";
		rentalData += "54321/��ǻ��Ȱ��ɷ�/2020-11-27/1041\n";
		rentalData += "26543/�ƹ�ư,�ܱ���/2020-12-01/1034";

		String userData = "";
		userData += "ȸ����ȣ/å��ȣ/�뿩�ϼ�(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";

		String[] rental = rentalData.split("\n");
		String[] user = userData.split("\n");
		for (int i = 1; i < rental.length; i++) {
			String[] ren = rental[i].split("/");
			for (int j = 1; j < user.length; j++) {
				String[] use = user[j].split("/");
//				System.out.println("ren[3] : " + ren[3] + " use[0] : " + use[0]);
				if (ren[3].equals(use[0])) {
					if (ren[0].equals(use[1])) {
						String[] rentday = ren[2].split("-");
						int day = Integer.parseInt(rentday[2]);
						int month = Integer.parseInt(rentday[1]);
						int c = Integer.parseInt(use[2]);
						day += c;
						if (day > 30) {
							month++;
							day -= 30;
						}
						if (month == 12) {
							if (day > 4) {
								System.out.println(use[0]);
							}
						}
					}

				}
			}
		}
		// �� �����ʹ� ������ å �뿩 �������̴�.
		// ������ 12��4�� �̶�������� ��ü�� ȸ����ȣ ���
	}

}