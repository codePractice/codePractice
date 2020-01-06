package baekjun;

import java.util.Scanner;

public class P1978 {

	static int cnt = 0;
	
	public static void solve(int n) {
		
		if(n == 1) {
			return ;
		}
		
		for(int i = 2; i < n; i++) {
			if(n%i == 0) return;
		}
		
		cnt++;
		
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int numbers[] = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			solve(sc.nextInt());
		}
		
		
		System.out.println(cnt);
		
		
	}

}
