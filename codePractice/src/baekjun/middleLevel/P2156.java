package baekjun.middleLevel;

import java.util.Scanner;

//    https://hees-dev.tistory.com/30
public class P2156 {

		static int array[];
		static int dp[];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		array = new int[n+1];
		dp = new int[n+1];
		
		
		for(int i = 1; i <= n; i++) {
			
			array[i] = sc.nextInt();
		}
		
		System.out.println(solve(n));
		
	}
	
	
	public static int solve(int n) {
		
		
		dp[1] = array[1];
		if(n == 1) return dp[1];
		
		
		dp[2] = array[1] + array[2];
		if(n == 2) return dp[2];
		
		
		
		for(int i = 3; i <= n; i++) {
			
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + array[i], dp[i-3] + array[i-1] + array[i]));
			
		}
		
		return dp[n];
		
		
	}

}
