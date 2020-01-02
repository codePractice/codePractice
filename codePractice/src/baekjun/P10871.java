package baekjun;

import java.util.Scanner;

public class P10871 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		
		int data[] = new int[n];
		
		
		for(int i =0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		
		sc.close();
		
		
		for(int i = 0; i < n; i++) {
			
			if(data[i] < x) {
				System.out.print(data[i]+" ");
			}
			
		}
	
		
	}
	
}
