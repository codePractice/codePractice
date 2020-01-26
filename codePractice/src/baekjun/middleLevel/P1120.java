package baekjun.middleLevel;

import java.util.Scanner;

public class P1120 {

		static String s1;
		static String s2;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		s1 = sc.next();
		s2 = sc.next();
		
		
		int min = 999999999; 
		
		
		for(int i = 0; i < s2.length()- s1.length()+1; i++) {
			int sum = 0;
			String sub = s2.substring(i, i+s1.length());
			
			
			for(int j = 0; j < s1.length(); j++) {
				if(s1.charAt(j) != sub.charAt(j)) {
					sum++;
				}
			}
			
			if(sum < min) {
				min = sum;
			}
			
		}
		
		System.out.println(min);
		
	}
	
	
}
