package F4_문자열4_FINAL;

import java.util.Arrays;

public class 문자열4_프로젝트_사원관리 {
	public static void main(String[] args) {
		// [부서정보]
		// [부서번호,부서명,지역]
		String[][] departmentData = { { "10", "ACCOUNTING", "NEW YORK" }, { "20", "RESEARCH", "DALLAS" },
				{ "30", "SALES", "CHICAGO" }, { "40", "OPERATIONS", "BOSTON" }, };
		// [사원정보]
		// [번호,이름,직책,상사번호,입사일,급여,커미션,부서번호]
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

		// [월급 등급]
		// [등급 , 급여MIN , 급여MAX]
		int salaryGradeData[][] = { { 1, 700, 1200 }, // 1등급이고 급여 700~1200 사이
				{ 2, 1201, 1400 }, { 3, 1401, 2000 }, { 4, 2001, 3000 }, { 5, 3001, 9999 } };
		int size = employeeData.length;
		String[] location = new String[size];
		// 문제) # "DALLAS"에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오.
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

		// 문제) # ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
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

//		 * #사원명과 부서명을 조회하시오.
		System.out.println("\n사원명과 부서명을 조회");
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
//		 * #이름,월급,월급등급을 조회하시오.
		System.out.println("\n이름,월급,월급등급을 조회");
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
//		 * #이름,부서명,월급등급을 조회하시오.
		System.out.println("\n이름,부서명,월급등급을 조회");
		for (int i = 0; i < size; i++) {
			System.out.printf("%10s , %10s , %2d\n", employeeData[i][1], department[i], salarygrade[i]);
		}
//		 * #이름,직속상사이름을 조회하시오.
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
//		 * # 이름,부서번호,부서이름을 조회하시오.
		System.out.println("이름,부서번호,부서이름을 조회");
		for (int i = 0; i < size; i++) {
			System.out.printf("Name : %10s , DepartmentNum : %3s , Department : %10s\n", employeeData[i][1],
					employeeData[i][7], department[i]);
		}
//		 * #부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회하시오.
		System.out.println("부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회");
		for (int i = 0; i < size; i++) {
			if (employeeData[i][7].equals("30")) {
				System.out.printf("Name : %10s , Position : %10s , DepartmentNum : %3s , Departmentlocation : %10s\n",
						employeeData[i][1], employeeData[i][2], employeeData[i][7], location[i]);
			}
		}
//		 * #커미션을 받는 사원의 이름, 커미션, 부서이름,부서위치를 조회하시오.
		System.out.println("커미션을 받는 사원의 이름, 커미션, 부서이름,부서위치를 조회");
		for (int i = 0; i < size; i++) {
			if (employeeData[i][6].equals("0")) {

			} else {
				System.out.printf("Name : %10s , Commission : %5s , Department : %10s , Departmentlocation : %7s\n",
						employeeData[i][1], employeeData[i][6], department[i], location[i]);
			}
		}
//		 * #DALLAS에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오.
		System.out.println("DALLAS에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회");
		for (int i = 0; i < size; i++) {
			if (location[i].equals("DALLAS")) {
				System.out.printf("Name : %10s , Position : %10s , DepartmentNum : %3s , Department : %10s\n",
						employeeData[i][1], employeeData[i][2], employeeData[i][7], department[i]);
			}
		}
//		 * # 이름에 A 가 들어가는 사원의 이름,부서명을 조회하시오.
		System.out.println("이름에 A 가 들어가는 사원의 이름,부서명을 조회");
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
//		 * #이름, 직급, 월급여, 월급여등급을 조회하시오.
		System.out.println("이름, 직급, 월급여, 월급여등급을 조회");
		for (int i = 0; i < size; i++) {
			System.out.printf("Name : %10s , Position : %10s , Salary : %5s , Salarygrade : %2s\n", employeeData[i][1],
					employeeData[i][2], employeeData[i][5], salarygrade[i]);
		}
//		 * #ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
		System.out.println("ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회");
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
//		 * # 사원명 'JONES'가 속한 부서명을 조회하시오.
		System.out.println("사원명 'JONES'가 속한 부서명을 조회");
		for (int i = 0; i < size; i++) {
			if (employeeData[i][1].equals("JONES")) {
				System.out.printf("Name : %-10s , Department : %-10s\n", employeeData[i][1], department[i]);
			}
		}
//		 * # 10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회하시오.
		System.out.println("10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회");
		for (int i = 0; i < size; i++) {
			if (employeeData[i][7].equals("10")) {
				System.out.printf("Name : %10s , Department : %10s\n", employeeData[i][1], department[i]);
			}
		}
//		 * # 평균 월급여보다 더 많은 월급여를 받은 사원의 사원번호,이름,월급여 조회하시오.
		System.out.println("평균 월급여보다 더 많은 월급여를 받은 사원의 사원번호,이름,월급여 조회");
		int total = 0;
		for (int i = 0; i < size; i++) {
			total += Integer.parseInt(employeeData[i][5]);
		}
		int avg = total / size;
		System.out.println("평균 월급 : " + avg);
		for (int i = 0; i < size; i++) {
			if (avg < Integer.parseInt(employeeData[i][5])) {
				System.out.printf("Num : %5s , Name : %10s , Salary : %5s\n", employeeData[i][0], employeeData[i][1],
						employeeData[i][5]);
			}
		}
//		 * # 부서번호가 20인 사원중에서 최대급여를 받는 사원과 동일한 급여를 받는 사원의 사원번호, 이름을 조회하시오.
		System.out.println("부서번호가 20인 사원중에서 최대급여를 받는 사원과 동일한 급여를 받는 사원의 사원번호, 이름을 조회");
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
//		 * #부서 테이블과 사원테이블에서 사번, 사원명, 부서코드, 부서명을 검색하시오. ( 사원명 오름차순 정렬할 것 )
		System.out.println("부서 테이블과 사원테이블에서 사번, 사원명, 부서코드, 부서명을 검색");
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
//		 * #사원 테이블과 급여 등급 테이블에서 사번, 사원명, 급여, 등급을 검색하시오. 단, 등급은 급여가 하한값과 상한값 범위에 포함되고 등급이
//		 * 4이며 급여를 기준으로 내림차순정렬할 것.
		System.out.println("4이며 급여를 기준으로 내림차순정렬");
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
//		 * #부서 테이블, 사원 테이블, 급여등급 테이블에서 사번, 사원명, 부서명, 급여 , 등급을 검색하시오. 단, 등급은 급여가 하한값과 상한값
//		 * 범위에 포함되며 등급을 기준으로 내림차순 정렬할 것.
		System.out.println("등급을 기준으로 내림차순 정렬");
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
//		 * #사원 테이블에서 사원명과 해당 사원의 관리자명을 검색하시오
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
//		 * #사원 테이블에서 사원명, 해당 사원의 관리자명, 해당 사원의 관리자의 관리자명을 검색하시오
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
//		 * # 30번 부서의 이름과 그 부서에 근무하는 사원의 이름을 출력하시오.
		for (int i = 0; i < size; i++) {
			if (employeeData[i][7].equals("30")) {
				System.out.printf("Department : %10s , Name : %10s\n", department[i], employeeData[i][1]);
			}
		}
//		 * #사원 테이블에서 MILLER 보다 늦게 입사한 사원의 사번, 이름, 입사일을 검색하시오
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
//		 * # 사원 테이블에서 부서별 최대 급여를 받는 사원들의 사번, 이름, 부서코드, 급여를 검색하시오.
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
//		 * #Salarygrade가 2등급인 사원들의 평균 급여보다 적게 받는 사원 정보를 검색하시오.
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
