package algorism;

public class QuickSort2 {

	public void sort2(int[] data, int start, int end) {

		if (start >= end) {
			System.out.println("원소가 1개입니다.");
			return;
		}

		int pivot = start;
		int left = start + 1;
		int right = end;
		int temp;
		
		while(left <= right) {
			
			while(left <= end && data[pivot] >= data[left]) {
				left++;
			}
			
			while(right > start && data[right] >= data[pivot]) {
				right--;
			}
			
			if(left > right) {
				
				temp = data[pivot];
				data[pivot] = data[right];
				data[right] = temp;
				
				
			}else {
				
				temp = data[right];
				data[right] = data[left];
				data[left] = temp;
				
			}
			
			
		}
		
		sort2(data,start,right-1);
		sort2(data,right+1,end);
		
		
		

	}

}
