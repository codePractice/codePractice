package practice100;

import java.util.Scanner;

//코드업 기초 100제 코드     https://codeup.kr/problemsetsol.php?psid=23
public class PracticeMethod {

	public void P1091() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		int i = 1;

		long answer = (long) a;

		while (true) {

			if (i == n)
				break;

			answer = (answer * (long) m) + (long) d;

			i++;

		}

		System.out.println(answer);

	}

	public void P1090() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int r = sc.nextInt();

		int n = sc.nextInt();

		Long answer = (long) (num * r);

		for (int i = 1; i <= n - 2; i++) {

			answer = answer * r;

		}

		System.out.println(answer);

	}

	public void P1089() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		int i = 1;

		int answer = a;

		while (true) {

			if (i == n)
				break;

			answer += d;

			i++;

		}

		System.out.println(answer);

	}

	public void P1088() {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int sum = 0;

		int i = 1;

		while (true) {

			if (i % 3 != 0)
				System.out.println(i);

			if (i == number)
				break;

			i++;

		}

	}

	public void P1087() {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int sum = 0;

		int i = 1;

		while (true) {

			if (sum >= number)
				break;

			sum += i;
			i++;

		}

		System.out.println(sum);

	}

	public void P1085() {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();

		long sum = (long) h * b * c * s;

		double answer = (double) (sum) / 8d / 1024d / 1024d;

		System.out.printf("%.1f MB", answer);

	}

	public void P1079() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String str = sc.next();

			System.out.println(str);

			if (str.equals("q"))
				break;

		}

	}

	public void P1080() {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int i = 1;
		int sum = 0;

		while (true) {

			sum += i;

			if (sum >= number) {
				System.out.println(i);
				break;
			}

			i++;

		}
	}

	public void P1082() {

		Scanner sc = new Scanner(System.in);

		String num = sc.next();

		int n = Integer.parseInt(num, 16);

		for (int i = 1; i < 16; i++) {

			System.out.printf("%X*%X=%X\n", n, i, i * n);

		}

	}

	public void P1064() {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int[] iarr = { num1, num2, num3 };

		int min = num1 > num2 ? num2 : num1;

		min = min < num3 ? min : num3;

		System.out.println(min);

	}

	public void P1092() {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int n = 1;

		// n % num1 != 0 || n % num2 != 0 || n % num3 != 0
		// n % num1 == 0 && n % num2 == 0 && n % num3 == 0
		while (!(n % num1 == 0 && n % num2 == 0 && n % num3 == 0)) {

			n++;

		}

		System.out.println(n);

	}

	public void P1093() {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 출석 부른 횟수

		int[] iarr = new int[23];

		for (int i = 1; i <= n; i++) {

			int who = sc.nextInt();

			iarr[who-1] = iarr[who-1] + 1;

		}

		for (int i = 0; i < iarr.length; i++) {

			System.out.print(iarr[i] + " ");
		}

	}

}
