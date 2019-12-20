package algorism;

public class QuickSort2 {

	public static void quickSort(int data[] , int start, int end) {
		
		if(start >= end) {
			System.out.println("원소가 한개입니다");
			return;
		}
		
		
		int pivot = start;
		int left = start + 1 ; 
		int right = end ;
		
		int temp;
		
		while(left <= right) {
			
			while(left <= end && data[pivot] >= data[left]) {
				left++;
			}
			
			while(right > start && data[pivot] <= data[right]) {
				right--;
			}
			
			if(left > right) {
				//엇갈림 
				temp = data[pivot];
				data[pivot] = data[right];
				data[right] = temp;
				
			}else {
				temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				
			}
			
			
		}
		
		
		quickSort(data, start, right-1);
		quickSort(data, right+1, end);
		
		
	
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] data = {2,3,1,6,8,4,5,9,10};
		
		quickSort(data, 0, data.length-1);
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
	}

}
