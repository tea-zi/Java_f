package F4_���ڿ�4_FINAL;

public class ���ڿ�4_������Ʈ_����_���� {
//    	������ �а� ���ϱ� ������ ��Ģ�Դϴ�.
//  
//  		1, 11, 12, 1121, 122111, 112213
//  
//	 	ù��° ���� : 1
//	 	�ι�° ���� : 1�� 1�� = 11
//	 	����° ���� : 1�� 2�� = 12
//	 	�׹�° ���� : 1�� 1��, 2�� 1�� = 1121
//	 	�ټ���° ���� : 1�� 2��, 2�� 1��, 1�� 1�� = 122111
//	 	�������� ���� : 1�� 1��, 2�� 2��, 1�� 3�� = 112213
//	 	
//	 	
//	 	�̷��� ������ 10��° ���ڸ� ���α׷��� ����� ã���ÿ�.
	public static void main(String[] args) {
		String num = "1";
		System.out.println(num);
		for (int i = 0; i < 9; i++) {
			int size = num.length();
			String temp = num;
			char c = num.charAt(0);
			int count = 1;
			num = "";
			num += c;
			for (int j = 1; j < size; j++) {
				if (temp.charAt(j) == c) {
					count++;
				} else {
					c = temp.charAt(j);
					num += count;
					num += c;
					count = 1;
				}
			}
			num += count;
			System.out.println(num);
		}
	}
}