package algorism;

public class CountingSortPrac {

	
	public static void main(String[] args) {
		
		int[] count = new int[5]; //중요 ! 범위를 정해준것임 5이하 자연수이기 때문에 5 
		int[] array = {
				1,3,2,4,3,2,5,3,1,2,
				3,4,4,3,5,1,2,3,5,2,
				3,1,4,3,5,1,2,1,1,1
		};
		
		//우선 count 배열에 값을 하나씩 세어서 넣어줌 
		for(int i = 0; i < array.length; i++) {
			count[array[i] -1 ]++;
		}
		
		//그 후에 하나씩 출력함 
		for(int i = 0; i < count.length; i++) {
			
			if(count[i] != 0) {
				
				for(int j = 0; j < count[i]; j++) {
					System.out.print(i + 1  + " ");
				}
				
			}
			
		}
		
		
	}
}
