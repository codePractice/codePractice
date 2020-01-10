package baekjun.middleLevel;

import java.util.Scanner;

public class P1149 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int dp[][] = new int[n+1][3];
		
		for(int i = 1; i <=n; i++) {
			for(int j=0; j<= 2; j++ ) {
				dp[i][j] = sc.nextInt();
			}
		}
		
		int min = 0;
		
		for(int i = 1; i <=n; i++) {
				
					dp[i][0] = dp[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
					dp[i][1] = dp[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
					dp[i][2] = dp[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
				
				min = Math.min(dp[i][0], Math.min(dp[i][1], dp[i][2]));
				
		}
		
		System.out.println(min);
		
		
	}

}
