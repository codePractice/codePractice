package algorism;

//병합정렬 (MergeSort)
//퀵 정렬도 O(N*logn)으로 속도가 굉장히 빠르지만 피벗값에 따라 정렬이 편항되게 이루어질경우 O(N^2)으로 연산이 이루어질수도 있지만 
//병합정렬은 O(N*logn)의 시간복잡도를 보장해준다 
//기본적인 로직은 "일단 반으로 나누고 나중에 합쳐서 정렬 "

/*
 *  7   6   5   8    3   5   9   1   
 *  
 *  6,7     5,8     3,5     1,9 	2^1
 *   
 *  5,6,7,8         1,3,5,9 		2^2
 *  
 *  1,3,5,5,6,7,8,9					2^3  
 *  
 *    ... 							세로 : logN  가로 : N  =  N*logN  
 *    
 *    -------------------------------------------
 *   "m"       	   "n"
 *   "i" middle    "j"
 *    6,7  	 		5,8
 * 
 */

public class MergeSort {

	int sorted[] = new int[9];

	public void merge(int[] data, int m, int middle, int n) {
		// n은 끝점
		int i = m; // 첫번째 배열의 시작점(인덱스)
		int j = middle + 1; // 두번째 배열의 시작점(인덱스)
		int k = m; // 합쳐지는 배열의 시작점 (인덱스)

		// 작은 순서대로 배열에 삽입
		while (i <= middle && j <= n) {

			// 각 배열의 값끼리 비교
			if (data[i] <= data[j]) {

				sorted[k] = data[i];
				i++; // 한칸이동
			} else {
				sorted[k] = data[j];
				j++; // 한칸이동
			}

			k++; // 합쳐질 배열 한칸이동

		}

		// 남은 데이터도 삽입

		if (i > middle) {
			// 첫번째 배열이 먼저 병합이 끝났다면 두번째 배열을 모두 넣어줌

			for (int num = j; num <= n; num++) {

				sorted[k] = data[num];
				
				k++;
			}

		} else {
			// 두번째 배열이 먼저 병합이 끝났다면 첫번째 배열을 모두 넣어줌

			for (int num = i; num <= middle; num++) {

				sorted[k] = data[num];
				
				k++;
			}

		}
		
		// 정렬된 배열을 삽입 
		for(int t = m; t <= n; t++) {
			
			data[t] = sorted[t];
		}
		
		System.out.println("병합함");

	}
	
	
	public void mergeSort(int[] data, int m, int n) {
		
		//크기가 1보다 큰 경우
		//재귀함수를 통해 쪼갤수 있을때까지 쪼갬 
		
		if(m < n) {
			
			System.out.println("병합정렬 실행됨");
			System.out.println("m : " + m);
			System.out.println("n : " + n);
			
			
			int middle = (m + n)/2;
			
			System.out.println("middle : " + middle); 
			
			mergeSort(data, m , middle);
			mergeSort(data, middle + 1, n);
			merge(data, m , middle, n);
			
			for(int i = 0; i < data.length; i++) {
				System.out.print(data[i] + " ");
				
			}
			System.out.println();
		}
		
		
		
	}
	

}
