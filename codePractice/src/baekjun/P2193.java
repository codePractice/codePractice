package baekjun;

import java.util.Scanner;

public class P2193 {

	
	public static long solve(int n) {
		
		long dp[] = new long[91];
		
		dp[1] = 1; 
		dp[2] = 1;
		
		
		if(n == 1) return 1;
		if(n == 2) return 1;
	
		
		for(int i = 3; i <= n; i++) {
			dp[i] = dp[i-2] + dp[i-1];
		}
		
		return dp[n];
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		System.out.println(solve(n));
		
		
	}

}
