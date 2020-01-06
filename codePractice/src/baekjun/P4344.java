package baekjun;

import java.util.Scanner;

public class P4344 {

	static Scanner sc = new Scanner(System.in);
	
	
	//n�� �л��� 
	public static void solve(int n) {
		
		int score[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}
		

		//����� ������ 
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += score[i];
		}
		
		
		double avg = sum / (double)n;
		
		//��� ����̳� �ѳ� Ȯ���غ��� 
		double cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(score[i] > avg) cnt++;
			
		}
		
		
		//��� �Ѵ»���� ���� ���ۼ�Ʈ���� Ȯ���غ��� 
		
		double result = (cnt/(double)n) * 100;
		System.out.println(String.format("%.3f", result) + "%");
		
		
	}
	
	
	
	public static void main(String[] args) {

		int n = sc.nextInt();
		
		
		for(int i = 1 ; i <=n; i++) {
			int a = sc.nextInt();
			solve(a);
		}
		
	}

}
