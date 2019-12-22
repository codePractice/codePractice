package algorism.sort;

public class MergeSortPrac {

	static int sorted[] = new int[9];
	
	public static void merge(int[] data, int start , int middle, int end) {
	
		int i = start;
		int j = middle + 1;
		int k = start;
		
		while(i <= middle && j <= end) {
			
			if(data[i] <= data[j]) {
				sorted[k] = data[i];
				i++;
			}else {
				sorted[k] = data[j];
				j++;
			}
			
			k++;
		}
		
		if(i > middle) {
			for(int num = j; num <= end; num++) {
				sorted[k] = data[num];
				k++;
			}
		}else {
			for(int num = i; num <= middle; num++) {
				sorted[k] = data[num];
				k++;
			}
		}
		
		for(int t = start; t <= end; t++) {
			data[t] = sorted[t];
		}
		
	}
	
	public static void mergeSort(int[] data, int start, int end) {
		
		if(start < end) {
			
			int middle = (start + end)/2 ;
			
			mergeSort(data, start, middle);
			mergeSort(data, middle+1, end);
			merge(data, start, middle, end);
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] data = {2,3,7,5,6,9,10,4};
		
		mergeSort(data, 0, data.length-1);
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
	}
}
