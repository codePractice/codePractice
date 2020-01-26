package baekjun.greedyAlgorithm;

import java.util.Scanner;

public class P2857 {

	static int woman;
	static int man;
	static int internship;
	static int team = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		woman = sc.nextInt();
		man = sc.nextInt();
		internship = sc.nextInt();

		makeTeam();


		while (internship > 0) {
			minusIntern();
		}

		System.out.println(team);

	}

	public static void makeTeam() {

		while (woman >= 2 && man >= 1) {
			team++;
			woman -= 2;
			man--;
		}

	}

	// 테스트 케이스
	// 여 12 남 5 인턴 6
	// 남 남 남
	// 여 여 여 여 여 여 여 여

	public static void minusIntern() {

		if (man + woman < internship) {
			team--;
			woman += 2;
			man++;
		}

		if (man + woman >= internship) {
			internship -= (man + woman);
			return;
		}

	}

}
