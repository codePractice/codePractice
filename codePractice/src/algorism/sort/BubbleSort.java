package algorism.sort;

// 버블 정렬 바로 옆 index와 비교하여 제일 큰값이 뒤로 가게 되어있음 
// O(n^2)
// 선택 정렬의 경우 값의 위치를 정렬후 한번만 바꾸지만 버블 정렬의 경우는 계속해서 자리를 바꾸기 때문에 
// 시간복잡도는 같지만 실제로는 선택정렬보다 훨씬 성능이 낮다 
public class BubbleSort {

	
	int[] iarr = {1,10,6,5,8,7,4,3,2,9};
	int temp;
	
	
	public void sort() {
		
		System.out.println("Bubble Sort 실행");
		
		
		for(int i = 0; i < iarr.length; i++) {
			
			//k < iarr.length-1-i 에서 i가 없어도 뒤에서부터 순서대로 정렬되기 때문에 에러는없지만 
			//정렬된 숫자들은 쓸대없이 한번더 훑기 때문에 좋은 코드는 아님 
			
			for(int k = 0; k < iarr.length-1-i; k++) {
				
				if(iarr[k] > iarr[k+1]) {
					temp = iarr[k];
					iarr[k] = iarr[k+1];
					iarr[k+1] = temp;
					
					
				}
				
			}
			
		}
		
		
		
		/*for(int i = 0; i < iarr.length; i++) {
			
			for(int k = 0; k < iarr.length-1-i; k++) {
				
				if(iarr[k] > iarr[k+1]) {
					
					temp = iarr[k];
					iarr[k] = iarr[k+1];
					iarr[k+1] = temp;
					
					
					
				}
				
			}
			
			
		
		}*/
		
		
		

		
		
		for(int i = 0; i < iarr.length; i++) {
			
			System.out.print(iarr[i] + ", ");
		}
		
		
		
		
	}
	
	
}
