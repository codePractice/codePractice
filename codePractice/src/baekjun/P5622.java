package baekjun;

import java.util.Scanner;

public class P5622 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.next();
		
		
		int num[] = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			
			num[i] = (int)(str.charAt(i));
			
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
