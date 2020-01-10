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
		
		
		//�̹� list�迭�� �ʱ�ȭ �Ǿ��ֱ� ������ 
		//���⼭�� DP�迭�� ��������ʴ´� 
		
		
		
		int sum = 0;
		
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j<=i; j++) {
				
				
				//������ �밢������ �� �������� 
				if(i==j) {
					list[i][j] = list[i][j] + list[i-1][j-1];
				//���� �밢������ �� �������� 
				}else if(j == 1) {
					list[i][j] = list[i-1][j] + list[i][j];
					
				//���� ������ �߿� ū���̶� �ڱ� �ڽ��̶� ��ģ�� 
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