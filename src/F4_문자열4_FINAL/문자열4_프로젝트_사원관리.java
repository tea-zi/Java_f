package F4_���ڿ�4_FINAL;

import java.util.Arrays;

public class ���ڿ�4_������Ʈ_������� {
	public static void main(String[] args) {
		// [�μ�����]
		// [�μ���ȣ,�μ���,����]
		String[][] departmentData = { { "10", "ACCOUNTING", "NEW YORK" }, { "20", "RESEARCH", "DALLAS" },
				{ "30", "SALES", "CHICAGO" }, { "40", "OPERATIONS", "BOSTON" }, };
		// [�������]
		// [��ȣ,�̸�,��å,����ȣ,�Ի���,�޿�,Ŀ�̼�,�μ���ȣ]
		String[][] employeeData = { { "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },
				{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },
				{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },
				{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },
				{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },
				{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },
				{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10" },
				{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },
				{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },
				{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },
				{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },
				{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" } };

		// [���� ���]
		// [��� , �޿�MIN , �޿�MAX]
		int salaryGradeData[][] = { { 1, 700, 1200 }, // 1����̰� �޿� 700~1200 ����
				{ 2, 1201, 1400 }, { 3, 1401, 2000 }, { 4, 2001, 3000 }, { 5, 3001, 9999 } };
		int size = employeeData.length;
		String[] location = new String[size];
		// ����) # "DALLAS"���� �ٹ��ϴ� ����� �̸�,����,�μ���ȣ,�μ����� ��ȸ�Ͻÿ�.
		String departMentNumber = "";
		for (int i = 0; i < departmentData.length; i++) {
			if (departmentData[i][2].equals("DALLAS")) {
				departMentNumber = departmentData[i][0];
			}
		}
		System.out.println(departMentNumber);
		for (int i = 0; i < employeeData.length; i++) {
			if (departMentNumber.equals(employeeData[i][7])) {
				System.out.println(Arrays.toString(employeeData[i]));
			}
		}

		// ����) # ALLEN�� ���� �μ��� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ��ȸ�Ͻÿ�.
		String depNum = "";
		for (int i = 0; i < size; i++) {
			if (employeeData[i][1].equals("ALLEN")) {
				depNum = employeeData[i][7];
			}
		}

		for (int i = 0; i < size; i++) {
			if (depNum.equals(employeeData[i][7])) {
				System.out.println(employeeData[i][1] + " : " + employeeData[i][7]);
			}
		}

//		 * #������ �μ����� ��ȸ�Ͻÿ�.
		System.out.println("\n������ �μ����� ��ȸ");
		String department[] = new String[size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < departmentData.length; j++) {
				if (employeeData[i][7].equals(departmentData[j][0])) {
					department[i] = departmentData[j][1];
					location[i] = departmentData[j][2];
					System.out.println(employeeData[i][1] + " : " + department[i]);
				}
			}
		}
//		 * #�̸�,����,���޵���� ��ȸ�Ͻÿ�.
		System.out.println("\n�̸�,����,���޵���� ��ȸ");
		int salarygrade[] = new int[size];
		for (int i = 0; i < size; i++) {
			int salary = Integer.parseInt(employeeData[i][5]);
			for (int j = 0; j < salaryGradeData.length; j++) {
				int min = salaryGradeData[j][1];
				int max = salaryGradeData[j][2];
				if (salary >= min && salary <= max) {
					salarygrade[i] = salaryGradeData[j][0];
					System.out.printf("Name : %10s , Salary : %5d , Salary Grade : %2d\n", employeeData[i][1], salary,
							salarygrade[i]);
				}
			}
		}
//		 * #�̸�,�μ���,���޵���� ��ȸ�Ͻÿ�.
		System.out.println("\n�̸�,�μ���,���޵���� ��ȸ");
		for (int i = 0; i < size; i++) {
			System.out.printf("%10s , %10s , %2d\n", employeeData[i][1], department[i], salarygrade[i]);
		}
//		 * #�̸�,���ӻ���̸��� ��ȸ�Ͻÿ�.
		for (int i = 0; i < size; i++) {
			String boss = employeeData[i][3];
			int count = 0;
			for (int j = 0; j < size; j++) {
				if (boss.equals(employeeData[j][0])) {
					System.out.printf("Name : %10s , Boss : %10s\n", employeeData[i][1], employeeData[j][1]);
				} else {
					count++;
				}
			}
			if (count == employeeData.length) {
				System.out.printf("Name : %10s , Boss : %10s\n", employeeData[i][1], boss);
			}
		}
//		 * # �̸�,�μ���ȣ,�μ��̸��� ��ȸ�Ͻÿ�.
		System.out.println("�̸�,�μ���ȣ,�μ��̸��� ��ȸ");
		for (int i = 0; i < size; i++) {
			System.out.printf("Name : %10s , DepartmentNum : %3s , Department : %10s\n", employeeData[i][1],
					employeeData[i][7], department[i]);
		}
//		 * #�μ���ȣ�� 30���� ������� �̸�, ����, �μ���ȣ, �μ���ġ�� ��ȸ�Ͻÿ�.
		System.out.println("�μ���ȣ�� 30���� ������� �̸�, ����, �μ���ȣ, �μ���ġ�� ��ȸ");
		for (int i = 0; i < size; i++) {
			if (employeeData[i][7].equals("30")) {
				System.out.printf("Name : %10s , Position : %10s , DepartmentNum : %3s , Departmentlocation : %10s\n",
						employeeData[i][1], employeeData[i][2], employeeData[i][7], location[i]);
			}
		}
//		 * #Ŀ�̼��� �޴� ����� �̸�, Ŀ�̼�, �μ��̸�,�μ���ġ�� ��ȸ�Ͻÿ�.
		System.out.println("Ŀ�̼��� �޴� ����� �̸�, Ŀ�̼�, �μ��̸�,�μ���ġ�� ��ȸ");
		for (int i = 0; i < size; i++) {
			if (employeeData[i][6].equals("0")) {

			} else {
				System.out.printf("Name : %10s , Commission : %5s , Department : %10s , Departmentlocation : %7s\n",
						employeeData[i][1], employeeData[i][6], department[i], location[i]);
			}
		}
//		 * #DALLAS���� �ٹ��ϴ� ����� �̸�,����,�μ���ȣ,�μ����� ��ȸ�Ͻÿ�.
		System.out.println("DALLAS���� �ٹ��ϴ� ����� �̸�,����,�μ���ȣ,�μ����� ��ȸ");
		for (int i = 0; i < size; i++) {
			if (location[i].equals("DALLAS")) {
				System.out.printf("Name : %10s , Position : %10s , DepartmentNum : %3s , Department : %10s\n",
						employeeData[i][1], employeeData[i][2], employeeData[i][7], department[i]);
			}
		}
//		 * # �̸��� A �� ���� ����� �̸�,�μ����� ��ȸ�Ͻÿ�.
		System.out.println("�̸��� A �� ���� ����� �̸�,�μ����� ��ȸ");
		for (int i = 0; i < size; i++) {
			String name = employeeData[i][1];
			boolean check = false;
			for (int j = 0; j < name.length(); j++) {
				char text = name.charAt(j);
				if (text == 'A') {
					check = true;
				}
			}
			if (check == true) {
				System.out.printf("Name : %10s , Department : %10s\n", employeeData[i][1], department[i]);
			}
		}
//		 * #�̸�, ����, ���޿�, ���޿������ ��ȸ�Ͻÿ�.
		System.out.println("�̸�, ����, ���޿�, ���޿������ ��ȸ");
		for (int i = 0; i < size; i++) {
			System.out.printf("Name : %10s , Position : %10s , Salary : %5s , Salarygrade : %2s\n", employeeData[i][1],
					employeeData[i][2], employeeData[i][5], salarygrade[i]);
		}
//		 * #ALLEN�� ���� �μ��� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ��ȸ�Ͻÿ�.
		System.out.println("ALLEN�� ���� �μ��� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ��ȸ");
		String dptnum = "";
		for (int i = 0; i < size; i++) {
			if (employeeData[i][1].equals("ALLEN")) {
				dptnum = employeeData[i][7];
			}
		}
		for (int i = 0; i < size; i++) {
			if (dptnum.equals(employeeData[i][7])) {
				System.out.printf("Name : %10s , DepartmentNum : %3s\n", employeeData[i][1], employeeData[i][7]);
			}
		}
//		 * # ����� 'JONES'�� ���� �μ����� ��ȸ�Ͻÿ�.
		System.out.println("����� 'JONES'�� ���� �μ����� ��ȸ");
		for (int i = 0; i < size; i++) {
			if (employeeData[i][1].equals("JONES")) {
				System.out.printf("Name : %-10s , Department : %-10s\n", employeeData[i][1], department[i]);
			}
		}
//		 * # 10�� �μ����� �ٹ��ϴ� ����� �̸��� 10�� �μ��� �μ����� ��ȸ�Ͻÿ�.
		System.out.println("10�� �μ����� �ٹ��ϴ� ����� �̸��� 10�� �μ��� �μ����� ��ȸ");
		for (int i = 0; i < size; i++) {
			if (employeeData[i][7].equals("10")) {
				System.out.printf("Name : %10s , Department : %10s\n", employeeData[i][1], department[i]);
			}
		}
//		 * # ��� ���޿����� �� ���� ���޿��� ���� ����� �����ȣ,�̸�,���޿� ��ȸ�Ͻÿ�.
		System.out.println("��� ���޿����� �� ���� ���޿��� ���� ����� �����ȣ,�̸�,���޿� ��ȸ");
		int total = 0;
		for (int i = 0; i < size; i++) {
			total += Integer.parseInt(employeeData[i][5]);
		}
		int avg = total / size;
		System.out.println("��� ���� : " + avg);
		for (int i = 0; i < size; i++) {
			if (avg < Integer.parseInt(employeeData[i][5])) {
				System.out.printf("Num : %5s , Name : %10s , Salary : %5s\n", employeeData[i][0], employeeData[i][1],
						employeeData[i][5]);
			}
		}
//		 * # �μ���ȣ�� 20�� ����߿��� �ִ�޿��� �޴� ����� ������ �޿��� �޴� ����� �����ȣ, �̸��� ��ȸ�Ͻÿ�.
		System.out.println("�μ���ȣ�� 20�� ����߿��� �ִ�޿��� �޴� ����� ������ �޿��� �޴� ����� �����ȣ, �̸��� ��ȸ");
		int max = 0;
		for (int i = 0; i < size; i++) {
			if (employeeData[i][7].equals("20")) {
				max = Integer.parseInt(employeeData[i][5]);
				for (int j = 0; j < size; j++) {
					if (employeeData[j][7].equals("20")) {
						if (max < Integer.parseInt(employeeData[j][5])) {
							max = Integer.parseInt(employeeData[j][5]);
						}
					}
				}
				if (max == Integer.parseInt(employeeData[i][5])) {
					System.out.printf("Num : %5s , Name : %10s , Salary : %5s\n", employeeData[i][0],
							employeeData[i][1], employeeData[i][5]);
				}
			}
		}
//		 * #�μ� ���̺�� ������̺��� ���, �����, �μ��ڵ�, �μ����� �˻��Ͻÿ�. ( ����� �������� ������ �� )
		System.out.println("�μ� ���̺�� ������̺��� ���, �����, �μ��ڵ�, �μ����� �˻�");
		for (int i = 0; i < size; i++) {
			String minname = employeeData[i][1];
			int minnamein = i;
			for (int j = i + 1; j < size; j++) {
				int length = employeeData[i][1].length();
				if (minname.length() > employeeData[j][1].length()) {
					length = employeeData[j][1].length();
				}
				for (int k = 0; k < length; k++) {
					char minN = minname.charAt(k);
					char Nam = employeeData[j][1].charAt(k);
					if (minN > Nam) {
						minname = employeeData[j][1];
						minnamein = j;
						break;
					} else if (minN < Nam) {
						break;
					}
				}
			}
			String temp[] = employeeData[i];
			employeeData[i] = employeeData[minnamein];
			employeeData[minnamein] = temp;
			String tmp = department[i];
			department[i] = department[minnamein];
			department[minnamein] = tmp;
			tmp = location[i];
			location[i] = location[minnamein];
			location[minnamein] = tmp;
			int tp = salarygrade[i];
			salarygrade[i] = salarygrade[minnamein];
			salarygrade[minnamein] = tp;
		}
		for (int i = 0; i < size; i++) {
			System.out.printf("Num : %5s , Name : %10s , DepartmentNum : %3s , Department : %10s\n", employeeData[i][0],
					employeeData[i][1], employeeData[i][7], department[i]);
		}
//		 * #��� ���̺�� �޿� ��� ���̺��� ���, �����, �޿�, ����� �˻��Ͻÿ�. ��, ����� �޿��� ���Ѱ��� ���Ѱ� ������ ���Եǰ� �����
//		 * 4�̸� �޿��� �������� �������������� ��.
		System.out.println("4�̸� �޿��� �������� ������������");
		String[][] grade = new String[size][];
		for (int i = 0; i < size; i++) {
			if (salarygrade[i] == 4) {
				int maxsal = Integer.parseInt(employeeData[i][5]);
				int maxindex = i;
				for (int j = i; j < size; j++) {
					if (salarygrade[j] == 4) {
						int sal = Integer.parseInt(employeeData[j][5]);
						if (maxsal < sal) {
							maxsal = sal;
							maxindex = j;
						}
					}
				}
				String[] temp = employeeData[i];
				employeeData[i] = employeeData[maxindex];
				employeeData[maxindex] = temp;
				String tmp = department[i];
				department[i] = department[maxindex];
				department[maxindex] = tmp;
				tmp = location[i];
				location[i] = location[maxindex];
				location[maxindex] = tmp;
				int tp = salarygrade[i];
				salarygrade[i] = salarygrade[maxindex];
				salarygrade[maxindex] = tp;
				System.out.printf("Num : %5s , Name : %10s , Salary : %5s , Salarygrade : %3s\n", employeeData[i][0],
						employeeData[i][1], employeeData[i][5], salarygrade[i]);
			}
		}
//		 * #�μ� ���̺�, ��� ���̺�, �޿���� ���̺��� ���, �����, �μ���, �޿� , ����� �˻��Ͻÿ�. ��, ����� �޿��� ���Ѱ��� ���Ѱ�
//		 * ������ ���ԵǸ� ����� �������� �������� ������ ��.
		System.out.println("����� �������� �������� ����");
		for (int i = 0; i < size; i++) {
			int mingrade = salarygrade[i];
			int index = i;
			for (int j = i; j < size; j++) {
				if (mingrade > salarygrade[j]) {
					mingrade = salarygrade[j];
					index = j;
				}
			}

			for (int k = i; k < size; k++) {
				if (mingrade == salarygrade[k]) {
					int maxsal = Integer.parseInt(employeeData[index][5]);
					int sal = Integer.parseInt(employeeData[k][5]);
					if (maxsal < sal) {
						maxsal = sal;
						index = k;
					}
				}
			}
			String[] temp = employeeData[i];
			employeeData[i] = employeeData[index];
			employeeData[index] = temp;
			String tmp = department[i];
			department[i] = department[index];
			department[index] = tmp;
			tmp = location[i];
			location[i] = location[index];
			location[index] = tmp;
			int tp = salarygrade[i];
			salarygrade[i] = salarygrade[index];
			salarygrade[index] = tp;
			System.out.printf("Num : %5s , Name : %10s , Department : %10s , Salary : %5s , Salarygrade : %3s\n",
					employeeData[i][0], employeeData[i][1], department[i], employeeData[i][5], salarygrade[i]);

		}
//		 * #��� ���̺��� ������ �ش� ����� �����ڸ��� �˻��Ͻÿ�
		for (int i = 0; i < size; i++) {
			boolean check = false;
			int index = 0;
			for (int j = 0; j < size; j++) {
				if (employeeData[i][3].equals(employeeData[j][0])) {
					check = true;
					index = j;
				}
			}
			if (check == true) {
				System.out.printf("Name : %10s , Boss : %10s\n", employeeData[i][1], employeeData[index][1]);
			} else {
				System.out.printf("Name : %10s , Boss : %10s\n", employeeData[i][1], employeeData[i][3]);
			}
		}
//		 * #��� ���̺��� �����, �ش� ����� �����ڸ�, �ش� ����� �������� �����ڸ��� �˻��Ͻÿ�
		for (int i = 0; i < size; i++) {
			boolean check = false;
			int index = 0;
			for (int j = 0; j < size; j++) {
				if (employeeData[i][3].equals(employeeData[j][0])) {
					check = true;
					index = j;
				}
			}
			int index1 = 0;
			boolean check1 = false;
			for (int j = 0; j < size; j++) {
				if (employeeData[index][3].equals(employeeData[j][0])) {
					check1 = true;
					index1 = j;
				}
			}
			if (check == true) {
				if (check1 == true) {
					System.out.printf("Name : %10s , Boss : %10s Bigboss : %10s\n", employeeData[i][1],
							employeeData[index][1], employeeData[index1][1]);
				} else {
					System.out.printf("Name : %10s , Boss : %10s Bigboss : %10s\n", employeeData[i][1],
							employeeData[index][1], employeeData[index][3]);
				}
			} else {
				System.out.printf("Name : %10s , Boss : %10s Bigboss : %10s\n", employeeData[i][1], employeeData[i][3],
						employeeData[i][3]);
			}
		}
//		 * # 30�� �μ��� �̸��� �� �μ��� �ٹ��ϴ� ����� �̸��� ����Ͻÿ�.
		for (int i = 0; i < size; i++) {
			if (employeeData[i][7].equals("30")) {
				System.out.printf("Department : %10s , Name : %10s\n", department[i], employeeData[i][1]);
			}
		}
//		 * #��� ���̺��� MILLER ���� �ʰ� �Ի��� ����� ���, �̸�, �Ի����� �˻��Ͻÿ�
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (employeeData[i][1].equals("MILLER")) {
				index = i;
				break;
			}
		}
		String[] date1 = employeeData[index][4].split("-");
		for (int i = 0; i < size; i++) {
			String[] date2 = employeeData[i][4].split("-");
			if (date1[2].compareTo(date2[2]) < 0) {
				System.out.printf("Num %5s , Name : %10s , Date : %10s\n", employeeData[i][0], employeeData[i][1],
						employeeData[i][4]);
			} else if (date1[2].equals(date2[2])) {
				if (date1[1].compareTo(date2[1]) < 0) {
					System.out.printf("Num %5s , Name : %10s , Date : %10s\n", employeeData[i][0], employeeData[i][1],
							employeeData[i][4]);
				} else if (date1[1].equals(date2[1])) {
					if (date1[0].compareTo(date2[0]) < 0) {
						System.out.printf("Num %5s , Name : %10s , Date : %10s\n", employeeData[i][0],
								employeeData[i][1], employeeData[i][4]);
					}
				}
			}

		}
//		 * # ��� ���̺��� �μ��� �ִ� �޿��� �޴� ������� ���, �̸�, �μ��ڵ�, �޿��� �˻��Ͻÿ�.
		for (int i = 0; i < departmentData.length; i++) {
			max = 0;
			index = 0;
			boolean check = false;
			for (int j = 0; j < size; j++) {
				if (departmentData[i][0].equals(employeeData[j][7])) {
					int num = Integer.parseInt(employeeData[j][5]);
					if (max < num) {
						max = num;
						index = j;
						check = true;
					}
				}
			}
			if (check == true) {
				for (int j = 0; j < size; j++) {
					if (max == Integer.parseInt(employeeData[j][5])) {
						System.out.printf("Num : %5s , Name : %10s , DepartmentNum : %3s , Salary : %5s\n",
								employeeData[index][0], employeeData[index][1], employeeData[index][7],
								employeeData[index][5]);
					}
				}
			}
		}
//		 * #Salarygrade�� 2����� ������� ��� �޿����� ���� �޴� ��� ������ �˻��Ͻÿ�.
		int sum = 0;
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (salarygrade[i] == 2) {
				sum += Integer.parseInt(employeeData[i][5]);
				count++;
			}
		}
		avg = sum / count;
		System.out.println(avg);
		for (int i = 0; i < size; i++) {
			if (salarygrade[i] == 2) {
				if (Integer.parseInt(employeeData[i][5]) < avg) {
					System.out.println(Arrays.toString(employeeData[i]));
				}
			}
		}
	}
}
