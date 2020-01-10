package baekjun;

import java.util.Scanner;

public class P2920 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int melody[] = new int[8];
		
		for(int i = 0; i < 8; i++) {
			melody[i] = sc.nextInt();
		}
		
		

		if(melody[0] == 1) {
			
			
			for(int i = 0; i <= 6; i++) {
				int d = melody[i+1] - melody[i];
				
				if(d != 1) {
					System.out.println("mixed");
					break;
				}
				
				if(d == 1 && i == 6) {
					System.out.println("ascending");
				}
			
			}
			
			
		}else if(melody[0]==8) {
			
			
			for(int i = 0; i <= 6; i++) {
				int d = melody[i] - melody[i+1];
				
				if(d != 1) {
					System.out.println("mixed");
					break;
				}
				
				if(d == 1 && i == 6) {
					System.out.println("decending");
				}
			
			}
			
		}else {
			System.out.println("mixed");
		}
		

	}

}
