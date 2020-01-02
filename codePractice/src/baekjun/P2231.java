package baekjun;

import java.util.Scanner;


public class P2231 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		int part = 0;
		int sum = 0;
		
	
			for(int i = 0; i <= n; i++) {
				
				sum = i;
				part = i;
				
				while(part != 0) {
					
					sum += part % 10;
					part = part / 10;
					
				}
				
				if(n == sum) {
					System.out.println(i);
					return;
				}
				
				
			}
			
			
		System.out.println(0);
		
		
		
		
	}
	
	

}
