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

	// �׽�Ʈ ���̽�
	// �� 12 �� 5 ���� 6
	// �� �� ��
	// �� �� �� �� �� �� �� ��

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
