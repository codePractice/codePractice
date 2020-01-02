package baekjun;

import java.util.Scanner;

public class P1668 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int t[] = new int[number];
		
		for(int i = 0; i < t.length; i++) {
			
			t[i] = sc.nextInt();
			
		}
		
		int max = 0;
		int leftCount = 0;
		
		for(int i = 0; i < t.length; i++) {
			
			if(t[i] > max) {
				max = t[i];
				leftCount++;
			}
			
		}
		
		int max2 = 0;
		int rightCount = 0;
		
		for(int i = t.length-1; i >= 0; i--) {
			
			if(t[i] > max2) {
				max2 = t[i];
				rightCount++;
			}
			
			
		}
		
		System.out.println(leftCount);
		System.out.println(rightCount);
		
	}

}
