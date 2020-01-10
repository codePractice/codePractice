package baekjun;

import java.util.Scanner;

public class P1932 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int list[][] = new int[n+1][n+1];
		
		
		for(int i = 1; i <= n ; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				list[i][j] = sc.nextInt();
				
			}
			
		}
		
		
		//이미 list배열이 초기화 되어있기 떄문에 
		//여기서는 DP배열을 사용하지않는다 
		
		
		
		int sum = 0;
		
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j<=i; j++) {
				
				
				//오른쪽 대각선으로 쭉 내려갈때 
				if(i==j) {
					list[i][j] = list[i][j] + list[i-1][j-1];
				//왼쪽 대각선으로 쭉 내려갈때 
				}else if(j == 1) {
					list[i][j] = list[i-1][j] + list[i][j];
					
				//왼쪽 오른쪽 중에 큰값이랑 자기 자신이랑 합친다 
				}else {
					list[i][j] = list[i][j] + Math.max(list[i-1][j-1], list[i-1][j]);
				}
				
				if(list[i][j] > sum) {
					sum = list[i][j];
				}
				
				
			}
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		

	}

}