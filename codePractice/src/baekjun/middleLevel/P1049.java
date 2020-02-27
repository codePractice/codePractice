package baekjun.middleLevel;

import java.util.Arrays;
import java.util.Scanner;

public class P1049 {

	static int[] pack;
	static int[] one;
	static int broken;
	static int brand;
	static int packCase;
	static int oneCase;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		broken = sc.nextInt();
		brand = sc.nextInt();
		
		pack = new int[brand];
		one = new int[brand];

		for (int i = 0; i < brand; i++) {
			pack[i] = sc.nextInt();
			one[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(pack);
		Arrays.sort(one);
		
		//n�� 7���̻��� ��� 1�� ¥���� ��������� 
		
		
		oneCase = broken * one[0];
		packCase = pack[0];
		
		int packCase2 = 0;
		
		if(broken > 6) {
		packCase = pack[0] * (broken / 6) + one[0] * (broken % 6);
		// ����¥���� �Ѻ��� �� ��Ѱ�� ;; �� �־ 7������������ 6��¥�� 2����°� �� �Ѱ�찡 ���� 
		packCase2 = pack[0] * (broken / 6 + 1);
		packCase = Math.min(packCase2, packCase);
		}
		
		System.out.println(Math.min(oneCase, packCase));

	}

}
