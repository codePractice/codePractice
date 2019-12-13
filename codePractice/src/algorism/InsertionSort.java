package algorism;

//삽입정렬 삽입할 요소의 앞쪽 요소들은 정렬되어있다는 가정하에 진행되기때문에 
//버블정렬,선택정렬에 비해서 가장 성능이 좋다 
//시간복잡도는 O(n^2)
public class InsertionSort {

	int[] iarr = {1,10,5,8,7,6,4,3,2,9};
	int temp;
	
	
	public void sort() {
		
		/*for(int i = 0; i < iarr.length-1; i++) {
			
			int j = i;
			
			while(iarr[j] > iarr[j+1]) {
				
				temp = iarr[j];
				iarr[j] = iarr[j+1];
				iarr[j+1] = temp;
				
				j--;
				
			}
			
			
		}*/
		
		for(int i = 0; i < iarr.length-1; i++) {
			
			int j = i;
			
			while(iarr[j] > iarr[j+1]) {
				
				temp = iarr[j];
				iarr[j] = iarr[j+1];
				iarr[j+1] = temp;
				
				j--;
				
			}
			
 			
		}
		
		
		
		
		
		for(int i = 0; i < iarr.length; i++) {
			
			System.out.print(iarr[i]+ " ");
		}
		
		
		
		
	}
	
	
}
