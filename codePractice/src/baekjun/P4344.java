package baekjun;

import java.util.Scanner;

public class P4344 {

	static Scanner sc = new Scanner(System.in);
	
	
	//n은 학생수 
	public static void solve(int n) {
		
		int score[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}
		

		//평균을 구하자 
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += score[i];
		}
		
		
		double avg = sum / (double)n;
		
		//평균 몇명이나 넘나 확인해보자 
		double cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(score[i] > avg) cnt++;
			
		}
		
		
		//평균 넘는사람이 반의 몇퍼센트인지 확인해보자 
		
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
