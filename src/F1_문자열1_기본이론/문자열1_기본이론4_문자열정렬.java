package F1_���ڿ�1_�⺻�̷�;

import java.util.Arrays;

public class ���ڿ�1_�⺻�̷�4_���ڿ����� {

	public static void main(String[] args) {
		// ����) ���� ������ �̸� ����
		String[] names = { "ȫ�浿", "������", "������", "�ڹ�ŷ", "������" };

		for (int i = 0; i < names.length; i++) {
			String minName = names[i];
			int minIdx = i;
			for (int j = i; j < names.length; j++) {
				if (minName.compareTo(names[j]) > 0) {
					minName = names[j];
					System.out.print("j : ");
					System.out.println(Arrays.toString(names));
					minIdx = j;
				}
			}
			System.out.println(Arrays.toString(names));
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
			System.out.println(Arrays.toString(names));
		}

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}

	}

}