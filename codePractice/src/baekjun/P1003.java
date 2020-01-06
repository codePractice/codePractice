package baekjun;

import java.util.Scanner;

public class P1003 {
	
	//0이 출력되는 횟수 
	static int dp[] = new int[41];
	
	//1이 출력도는 횟수 
	static int dp2[] = new int[41];
	
	public static void solve(int n) {
		
		int cnt = 0;
		
		//0이출력되는 횟수 
		dp[0] = 1; 
		dp[1] = 0;
		
		if(n == 0) {
			System.out.print(dp[0] + " "); 
		}else if(n == 1) {
			System.out.print(dp[1] + " "); 
		}else {
		
		for(int i = 2; i <= n ; i++) {
			
		dp[i] = dp[i-1] + dp[i-2];
			
		}
		
		 cnt = dp[n];
		
		}
		
		int cnt2 = 0;
		
		dp2[0] = 0;
		dp2[1] = 1; 
		
		if(n == 0) {
			System.out.print(dp2[0]); 
			System.out.println();
		}else if(n == 1) {
			System.out.print(dp2[1]); 
			System.out.println();
		}else {
		
		for(int i = 2; i <= n ; i++) {
			dp2[i] = dp2[i-1] + dp2[i-2];
		}
		
		 	cnt2 = dp2[n];
		
		}
		
		if(cnt != 0 && cnt2 != 0) {
			System.out.println(cnt + " " + cnt2);
		}
		
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int data[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		
		for(int i =0; i < n; i++) {
			solve(data[i]);
		}
	
		
	}

}
