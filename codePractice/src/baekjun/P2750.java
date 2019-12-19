package baekjun;

import java.util.Scanner;



//O(N^2)정렬문제 
public class P2750 {

     
	Scanner sc = new Scanner(System.in);
	int index;
	int temp;
	
	public void sort() {
		
		
		
		
		int size = sc.nextInt();
		
		int[] data = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			int number = sc.nextInt();
			data[i] = number;
			
		}
		
		
		for(int i = 0; i < data.length; i++) {
			
			int min = 1002;
			
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
			
			
		System.out.println(data[i]);
			
			
		}
		
		
	}
	
	

	
}
