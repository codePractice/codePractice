package baekjun;

import java.util.Scanner;

public class P11720 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int data[] = new int[N];
		
		String str = sc.next();
		
		for(int i = 0; i < N; i++) {
			data[i] = str.charAt(i) - '0';
		}
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += data[i];
		}
		
		System.out.println(sum);
		
	}

}
