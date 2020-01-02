package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P2309 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			
		 int data = sc.nextInt();
		 list.add(data);	
		
		 sum += data;
		 
		}
		

		int first =  0;
		int second = 0;
		
	
		
		
		for(int i = 0; i < list.size(); i++) {
			
			for(int j = 0; j < list.size(); j++) {
				
				int fake = list.get(i) + list.get(j);
				
				if(sum - fake == 100) {
					first = i;
					second = j;
				
					break;
				}
				
			}
			
			
		}
		
		
		
		list.remove(first);
		list.remove(second);
		
		Collections.sort(list);
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
