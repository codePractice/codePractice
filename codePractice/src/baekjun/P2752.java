package baekjun;

import java.util.Scanner;

//세 수 정렬문제 
public class P2752 {

	public void sort() {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		int temp;
		int index = 0;
		
		int[] data = {a,b,c};
		
	
		
		
		for(int i = 0; i < data.length; i++) {
			
			int min = 1000001;
			
			for(int j = i; j < data.length; j++) {
				
				if(min > data[j]) {
					
					min = data[j];
					index = j;
					
				}
				
			}
			
			temp = data[i];
			data[i] = data[index];
			data[index] = temp;
			
			
			
		}
		
		
		for(int i = 0; i < data.length; i++) {
			
			System.out.print(data[i] + " ");
		}
		
		
		
		
		
	}
	
	
}
