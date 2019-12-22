package algorism.sort;

//계수 정렬 
//EX) 5이하 자연수 데이터들을 오름차순 정렬하시오와 같은 
//범위 조건이 있는 경우에 한해서 굉장히 빠른 알고리즘이다 속도가 무려 O(N)
//크기를 기준으로 갯수를 세면 어떨까? 라는 개념 


public class CountingSort {

	
	
	
	public static void main(String[] args) {

		
		int[] count = new int[5]; //중요 ! 범위를 정해준것임 5이하 자연수이기 때문에 5 
		int[] array = {
				1,3,2,4,3,2,5,3,1,2,
				3,4,4,3,5,1,2,3,5,2,
				3,1,4,3,5,1,2,1,1,1
		};
		
		for(int i = 0; i < array.length; i++) {
			count[array[i]-1]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			
			if(count[i] != 0) {
				
				for(int j = 0; j < count[i]; j++) {
					System.out.print(i + 1 + " ");
				}
				
			}
			
		}
		
	}
	
}
