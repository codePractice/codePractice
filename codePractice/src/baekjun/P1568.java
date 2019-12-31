package baekjun;

import java.util.Scanner;

public class P1568 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int bird = sc.nextInt();
		
		int count = 0;
		int k = 1;
		
		while(bird != 0) {
			
			if(bird < k) {
				k = 1; 
			}
			
			bird = bird - k;
			k++; 
			count++;
			
			
			
		}
		
		
		System.out.println(count);
		
	}

}
