package baekjun;

import java.util.Scanner;

public class P10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		sc.close();
		
		int[] data = {a,b,c};
		
	
		
		
		int result;
		
		
		for(int i =0; i < data.length; i++) {
			
			int min = 1000;
			int temp = 0 ;
			int index= 0;
			
			for(int j=i; j< data.length;j++) {
				
				if(min > data[j]) {
					min = data[j];
					index = j;
				}
				
			}
		
			temp = data[i];
			data[i] = data[index];
			data[index] = temp;
		}
		
		System.out.println(data[1]);
		

	}

}
