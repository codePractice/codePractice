package baekjun.middleLevel;

import java.util.Scanner;

public class P1783 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;

		if (N == 1) {
			count = 1;
		}else if(N == 2) { 
			count = Math.min((M+1)/2, 4);
		}else if(M < 7) {
			count = Math.min(M, 4);
		}else { 
			count = 5 + M - 7;
		}
		
		System.out.println(count);

	}

}
