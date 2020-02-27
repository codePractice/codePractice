package baekjun.middleLevel;

import java.util.Scanner;

public class P1946 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			solve();
		}
	}

	public static void solve() {

		int n = sc.nextInt();
		int[] emp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			emp[sc.nextInt()] = sc.nextInt();
		}

		int first = emp[1];
		int cnt = 1;

		for (int i = 2; i <= n; i++) {
			if (emp[i] < first) {
				first = emp[i];
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
