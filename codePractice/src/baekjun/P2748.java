package baekjun;

import java.util.Scanner;

public class P2748 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long dp[] = new long[91];
		
		dp[0] = 0;
		dp[1] = 1;
		
		
		if(n == 1) {
			System.out.println(dp[1]);
			return; 
		}
		
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[n]);
	}

}
