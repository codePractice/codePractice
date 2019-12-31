package baekjun;

import java.util.Scanner;

public class P1068 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int parent[] = new int[n];
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			int v = sc.nextInt();
			
			parent[i] = v;
			
		}
		
		int root = 0;
		
		for(int i = 0; i < n; i++) {
			
			int v = parent[i];
			
			if(v == -1) {
				root = i;
				continue;
			}
			
			
			
			
			
			
			
		}
	
		
	}
	
}
