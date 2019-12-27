package algorism.sort;


//퀵 정렬 (분할정복을 이용한 정렬 : 반반씩 쪼개서 나중에 합친다) 
//시간 복잡도 O(N*logN) 속도가 굉장히 빠른 정렬이다, 이미 정렬이 거의 되어있는 경우 최악의 시간복잡도 O(n^2) 
//백만은 2의 20제곱이기때문에 퀵정렬을 이용하면 시간복잡도가 20밖에 되지않음 
//기준(피벗을)이용한 정렬임 
//왼쪽에서 오른쪽으로 진행할때는 피벗보다 큰값을 찾고 
//오른쪽에서 왼쪽으로 진행할때는 피벗보다 작은값을 찾아서 큰값 작은값의 위치를 바꾼다 
//그런데 작은값의 인덱스가 큰값의 인덱스보다 작을때 (엇갈렷다고한다) EX) 3 2 1 8 5 9 6 10 7 4  피벗  : 3 
//작은 값과 피벗의 위치를 바꾸어준다  EX) 1 2 3 8 5 9 6 10 7 4  ws

public class QuickSort {
	
	
	
	public void sort(int[] data, int start, int end) {
		
		//start는 정렬을 수행하는 부분집합의 첫번째 원소 ,end는 정렬을 수행하는 부분집합의 마지막원소 
		
		System.out.println("Quick Sort 실행");
		
		
		if(start >= end) {
			System.out.println("원소가 1개입니다.");
			return;
		}
		
		int key = start; //키(피벗)는 첫번째 원소이다 
		int left = start + 1 ; //피벗을 제외한 왼쪽출발지점 인덱스
		int right = end; //피벗을 제외한 오른쪽 출발지점 인덱스 
		int temp;
		
		while(left <= right) { // 큰값과 작은값이  엇갈릴때까지 반복 
			
			//################### 피벗 값이 10일 경우 10보다 큰값이 없기 때문에  제일 끝인덱스까지가서 i가 10이 되버려서 
			// left <= end  조건문과 data[left] <= data[key] 조건문의 순서가 뒤바뀌면 
			//data[left]값부터 찾아버리기때문에 data[10]이되서 배열인덱스초과 에러가 난다 
			//때문에 반드시 left <= end부터 조건식이 나와야함, C나 C#은 관련에러가 없는듯함.. 
			
			
			
			//내림차순을 하고싶다면 while문 부호2개만 바꿔주면된다 
			while( left <= end && data[left] <= data[key] ) {
				left++; // 피벗보다 큰값을 찾을때까지 오른쪽으로 한칸씩 전진
			}
			
			//right > start 인 이유는 start가 피벗값이기 떄문에 거기까지 가면안됨 
			while(right > start && data[right] >= data[key] ) { //왼쪽으로 계속가되 시작점을 넘어서면안됨 
				right--; //피벗보다 작은값을 찾을때까지 왼쪽으로 전진 
			}
			
			
			if(left > right) { //현재 엇갈린 상태면 피벗과 작은값을 교체 
			
				
				temp = data[right];
				data[right] = data[key];
				data[key] = temp;
				
			}else { //엇갈린 상태가 아니라면 큰값과 작은값 위치를 바꿈
				
				temp = data[right];
				data[right] = data[left];
				data[left] = temp;
				
			}
			
		}//while end 
		

		
		
	    sort(data, start, right-1);
		sort(data, right+1, end);
		
		
	}
	
	
	
	
	
}
