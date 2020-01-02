package baekjun;

import java.util.Scanner;

public class P11721 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.next();
		
		int length = str.length();
		
	/*	for(int i = 0; i <= 9; i++) {
			
		}
		
		System.out.println();
		
		for(int i = 10; i <=18; i++ ) {
			System.out.print(str.charAt(i));
		}*/
		
		int i = 0;

		while(true) {
			
			
			
			if(i + 9 >= length) {
				for(int k = i; k < length; k++) {
					System.out.print(str.charAt(k));
				}
				break;
			}else {
				for(int k = i; k <= i + 9; k++) {
					System.out.print(str.charAt(k));
				}
			}
			
			System.out.println();
			
			i += 10;
			
			
		}
		
		
		
		
		
	}

}
