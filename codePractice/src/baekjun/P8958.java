package baekjun;

import java.util.Scanner;

public class P8958 {

	public static void solve(String q) {
		
		
		String arr[] = q.split("X");
		
		int a[] = new int[81];
				
		int score  = 0;
		
		for(int i =0; i < arr.length; i++) {
			
			a[i] = arr[i].length();
			
		}
		
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j <= a[i]; j++) {
				score += j;
			}
		}
		
		System.out.println(score);

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			
			String str = sc.next();
			solve(str);
			
		}
		
		
	}

}
