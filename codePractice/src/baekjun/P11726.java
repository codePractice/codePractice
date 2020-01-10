package baekjun;

import java.util.Scanner;

public class P11726 {

	
	public static int solve(int n){
		
		int dp[] = new int[1001];
		
		dp[1] = 1;
		dp[2] = 2;
		
		if(n == 1) return dp[1];
		if(n == 2 ) return dp[2];
		
		for(int i = 3; i <= n ; i++) {
			dp[i] = (dp[i-2] + dp[i-1]) %10007;
		}
		
		return dp[n] ;
		
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		
		System.out.println(solve(n));
		 
		
		
	}

}
