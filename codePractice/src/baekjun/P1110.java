package baekjun;

import java.util.Scanner;

public class P1110 {

	public static void main(String[] args) {

		
		Scanner sc  = new Scanner(System.in);
		
		
		
		int N = sc.nextInt();
		int count = 0;
		int result = 0;
		int ten = N / 10;
		int one = N % 10;
		
		while(true) {
			
			count++;
			
			int sum = ten + one;
			
			result = one * 10 + sum % 10;
			
			if(result == N) {
				System.out.println(count);
				break;
			}
			
			
			
			 ten = result / 10;
			 one = result % 10;
			
			
			
		}
		
		
	}

}
