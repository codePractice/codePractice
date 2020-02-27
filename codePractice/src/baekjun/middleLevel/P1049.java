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
		
		//n이 7개이상일 경우 1팩 짜리를 더해줘야함 
		
		
		oneCase = broken * one[0];
		packCase = pack[0];
		
		int packCase2 = 0;
		
		if(broken > 6) {
		packCase = pack[0] * (broken / 6) + one[0] * (broken % 6);
		// 한줄짜리가 팩보다 더 비싼경우 ;; 가 있어서 7개끊어졌을때 6팩짜리 2개사는게 더 싼경우가 있음 
		packCase2 = pack[0] * (broken / 6 + 1);
		packCase = Math.min(packCase2, packCase);
		}
		
		System.out.println(Math.min(oneCase, packCase));

	}

}
