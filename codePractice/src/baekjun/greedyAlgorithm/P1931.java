package baekjun.greedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class P1931 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Conference[] arr = new Conference[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = new Conference(sc.nextInt(), sc.nextInt());
			
		}
		
		Arrays.sort(arr);
		
		int cnt = 1;
		int end = arr[0].end;
		
		for(int i = 1; i < n; i++) {
			if(arr[i].start >= end) {
				cnt++;
				end = arr[i].end;
			}
			
		}
		
		System.out.println(cnt);
		
	}
	
	
	static class Conference implements Comparable<Conference>{
		
		int start;
		int end;
		
		public Conference(int start, int end) {
			
			this.start = start; 
			this.end = end ;
			
		}

		@Override
		public int compareTo(Conference o) {
			
			if(this.end == o.end) {
				return this.start - o.start;
			}
				
			return this.end - o.end;
			
		}
		
		
	}
	
}
