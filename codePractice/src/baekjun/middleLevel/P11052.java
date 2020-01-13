package baekjun.middleLevel;

import java.util.Scanner;

public class P11052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int price[] = new int[1001];
		int dp[] = new int[1001];
		
		sc.nextLine();
 		
		String str[] = sc.nextLine().split(" ");
		
		for(int i = 1; i <= N; i++) {
			
			price[i] = Integer.parseInt(str[i-1]);
			
		}
		
		//Á¡È­½Ä dp[i] = price[k] + dp[i-k]
		
		dp[1] = price[1];
		
		if(N == 1) {
			System.out.println(dp[1]);
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				
				dp[i] = Math.max(dp[i], dp[i-j] + price[j]);
				
			}
		}
		
		System.out.println(dp[N]);
		
		
		
	}

}
