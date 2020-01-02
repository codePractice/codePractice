package baekjun;

import java.util.Scanner;

public class P1236 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char castle[][] = new char[n][m];
		
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < m ; j++) {
				
				castle[i][j] = sc.next().charAt(0);
			}
			
		}
		
		
		int count = 0;
		
		//가로 확인 
		for(int i = 0; i < n; i++) {
			
			boolean flag = false; 
			
			for(int j = 0; j < m ; j++) {
				//경비원이 있으면 탈출 
			
				if(castle[i][j] == 'X') {
					flag = true;
					break;
				}
					
			}
			
			if(flag == false) {
				count++;
			}
			
		}
		
		int count2 = 0;
		
		

		//세로 확인 
		for(int j = 0; j < m; j++) {
		
			boolean flag = false; 
			
			for(int i = 0; i < n ; i++) {
				//경비원이 있으면 탈출 
			
				if(castle[i][j] == 'X') {
					flag = true;
					break;
				}
					
			}
			
			if(flag == false) {
				count2++;
			}
			
		}
		
		
		
		
		
		if(count > count2) {
			System.out.println(count);
		}else {
			System.out.println(count2);
		}
		
		
	}

}
