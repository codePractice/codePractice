package baekjun;

import java.util.ArrayList;
import java.util.Scanner;

//(최대 100만개)N개의 수 오름차순 퀵 정렬 

public class P2751 {

	
	
	public ArrayList<Integer> makeData() {
		
		
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		
		for(int i = 0; i < length; i++) {
			
			int number = sc.nextInt();
			
			data.add(number);
			
			
		}
		
		
		return data;
		
		
	}
	
	
	public void sort(ArrayList<Integer> data, int start, int end) {
		
		
		
		int pivot = start;
		int left = start + 1;
		int right = end;
		int temp;
		
		if(start >= end) {
			
			System.out.println("원소가 1개입니다.");
			
			return;
		}
		
		
		while(left <= right) {
			
			while(left <= end && data.get(pivot) >= data.get(left)) {
				
				left++;
				
			}
			
			while(right > start && data.get(pivot) <= data.get(right)) {
				
				right--;
			}
			
			
			if(left > right) {
				
				temp = data.get(right);
				data.set(right, data.get(pivot));
				data.set(pivot, temp);
				
			}else {
				
				temp = data.get(right);
				data.set(right, data.get(left));
				data.set(left, temp);
				
			}
			
		}
		
		
		sort(data,start,right-1);
		sort(data,right+1,end);
		
		
	}
	
	
}
