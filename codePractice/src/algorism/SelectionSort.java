package algorism;


//선택 정렬 : 제일 작은수를 무조건 앞으로  O(n^2)
public class SelectionSort {
	
	
	int[] iarr = {1,10,5,8,7,6,4,3,2,9};
	
	
	int index;
	int temp;
	int min;
	int count = 0;
	
	
	public void sort() {
		
		System.out.println("Selection Sort 실행");
		
		
		
		
		
		for(int i = 0; i < iarr.length; i++) {
			
			min = 9999;
			
			for(int k = i; k < iarr.length; k++) {
				
				if(min > iarr[k]) {
					
					min = iarr[k];
					index = k;
					
				}
				
			}
			
			temp = iarr[i];
			iarr[i] = iarr[index];
			iarr[index] = temp;
			
			
		}
		
		
		
		
		/*for(int i = 0; i < iarr.length; i++) {
			
			int min = 9999;
			
			for(int k = i; k < iarr.length; k++) {
				
				count++;
				
				if(min > iarr[k]) {
					
					min = iarr[k];
					
					index = k;
					
					
				}
			}
			
			temp = iarr[i];
			iarr[i] = min;
			iarr[index] = temp;
			
			System.out.print(iarr[i] + ",");
			
				
		}*/
		
		
		
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		
	}

	
	
	
}
