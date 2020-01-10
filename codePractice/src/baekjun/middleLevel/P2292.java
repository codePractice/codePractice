package baekjun.middleLevel;

import java.util.Scanner;

public class P2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(solve(n));
		
	}	
	
	
	public static int solve(long n) {
		
		int count = 2;
		
		if(n == 1)
			return 1;
		
		int small = 2;
		int big = 7;
		
		int add1 =6; 
		int add2 =12;
		while(true) {
			
			 
			
			if(small <=  n && n <= big) {
				return count;
			}
			
			
			small += add1;
			big +=add2;
			
			add1 +=6;
			add2 +=6;
					
			
			count++;
		}
		
		
		
	}

}
