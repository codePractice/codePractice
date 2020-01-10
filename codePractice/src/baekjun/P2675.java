package baekjun;

import java.util.Scanner;

public class P2675 {

	static Scanner sc = new Scanner(System.in);
	
	public static void solve(int n, String str) {
		
		
		
		for(int i = 0; i < str.length(); i++) {
			
			for(int j = 0; j < n; j++) {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		
		
	}
	
	public static void main(String[] args) {

		int n = sc.nextInt();
		
		int numbers[] = new int[n];
		String sarr[] = new String[n];
		
		for(int i = 0; i < n ; i++) {
			numbers[i] = sc.nextInt();
			sarr[i] = sc.next();
		}
		
		for(int i = 0; i < n; i++) {
			solve(numbers[i], sarr[i]);
		}
		
	}

}
