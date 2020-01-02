package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		
		
		double score[] = new double[(int) (N+1)];

		
		for(int i = 1; i<=N; i++) {
			score[i] = sc.nextDouble();
		}
		
		Arrays.sort(score);
		
		
		double max = score[score.length-1];
		
		
		double result = 0;
		
		for(int i = 1; i<=N; i++) {
			result += score[i] / max * 100;
		}
		
		System.out.println(result/N);
	}

}
