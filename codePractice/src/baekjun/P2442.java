package baekjun;

import java.util.Scanner;

public class P2442 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int star = 1; 
		
		for(int i = 1; i <= n; i++) {
			
			int k = n - i;  
			
			for(int z = 1 ; z <= k; z++) {
				System.out.print(" ");
			}
			
			
			for(int m = 1; m <= star; m++) {
				System.out.print("*");
			}
			
			
			
			star+=2;
			System.out.println();
		}
	
		
	
	}

}
