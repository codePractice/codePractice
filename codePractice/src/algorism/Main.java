package algorism;

public class Main {

	public static void main(String[] args) {
		
		
		int[] data = {1,10,5,8,7,6,4,3,2,9};
		
		SelectionSort ss = new SelectionSort();
		BubbleSort bs = new BubbleSort();
		InsertionSort is = new InsertionSort();
		QuickSort qs = new QuickSort();
		
		//ss.sort();
		//bs.sort();
		//is.sort();
		qs.sort(data, 0, data.length-1);
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		
	}
	
}
