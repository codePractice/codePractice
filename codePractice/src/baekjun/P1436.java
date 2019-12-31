package baekjun;

import java.util.Scanner;

public class P1436 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int num = 0;
		
		while(n != 0) {
			
			num++;
			if(String.valueOf(num).contains("666")) {
				n--;
			}
			
		}
		
		System.out.println(num);
		
	}

}
