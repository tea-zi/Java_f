package F3_¹®ÀÚ¿­3_ÇÁ·ÎÁ§Æ®;

public class ¹®ÀÚ¿­3_ÇÁ·ÎÁ§Æ®_Àå¹Ù±¸´Ï°Ë»ö {
	public static void main(String[] args) {
		String itemData = "1001/°í·¡¹ä,1002/»õ¿ì±ø,1003/Ä­ÃÝ";
		String userData = "3001/ÀÌ¸¸¼ö,3002/±èÃ¶¹Î,3003/ÀÌ¿µÈñ";

		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";

		// ¹®Á¦1) È¸¿øº° ¾ÆÀÌÅÛ ±¸¸Å¸ñ·Ï Ãâ·Â
		// ¿¹) ÀÌ¸¸¼ö==> °í·¡¹ä3,Ä­ÃÝ1 / ±èÃ¶¹Î ==> °í·¡¹ä1 / ÀÌ¿µÈñ ==> °í·¡¹ä2,»õ¿ì±ø1
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
		// ¹®Á¦2) ¾ÆÀÌÅÛº°·Î ±¸ÀÔÇÑ È¸¿øÀÌ¸§ Ãâ·Â
		// ¿¹) °í·¡¹ä==> ÀÌ¸¸¼ö,±èÃ¶¹Î,ÀÌ¿µÈñ / »õ¿ì±ø==> ÀÌ¿µÈñ / Ä­ÃÝ==> ÀÌ¸¸¼ö
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
