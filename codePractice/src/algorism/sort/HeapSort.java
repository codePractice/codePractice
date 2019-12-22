package algorism.sort;


//힙정렬은 병합정렬과 퀵정렬만큼 빠름 정렬 알고리즘임
//완전 이진 트리(Complete Binary Tree)에 대해서 알 필요가있음 
//완전 이진 트리는 좌우 자식노드 순서대로 값이 삽입되어 노드가 중간에 비어있지않고 뺵빽히 가득 찬 구조  
//힙은 최솟값이나 최댓값을 빠르게 찾아내기 위해 완전 이진트리를 기반으로 하는 트리임 
//최대 힙은 부모노드가 자식노드보다 큰 힙
//일단 힙 정렬을 하기 위해서는 정해진 데이터를 힙 구조를 가지도록 만들어야함 
//힙 구조가 붕괴되는 경우가 있는데 힙 생성 알고리즘을 사용함(Heapify) -> 자신보다 큰 자식노드와 자신의 위치를 바꿈 
//이진트리의 높이 (logN) * 모든 노드에 대해서 Heapify를 사용하면 N -> O(N*logN)


public class HeapSort {

	
	
	public static void heapSort() {
		
		int temp;
		int heap[] = {7,6,5,8,3,5,9,1,6};
		
		//먼저 전체 트리구조를 힙 구조로 바꾼다  (자식 노드가 부모 노드 보다 크지않은데 아직 정렬은 되지않은 상태임)
		for(int i = 1; i < heap.length; i++) {
			
			int c = i; //자식노드를 나타냄 
			do {
				int root = (c-1) /2; //특정 노드의 부모를 나타냄 
				if(heap[root] < heap[c]) { //부모노드가 자식노드보다 작으면 서로 값을 바꾼다 
					
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] =temp;
					
				}
				
				c = root; //수행한 자식노드의 부모로 이동하여 반복 수행
				
			}while(c!=0); //자식노드가 부모노드가 될때까지 반복 
		}
	

		
		//크기를 줄여가며 반복적으로 힙을 구성한다 
		for(int i = heap.length-1; i >= 0; i--) {
			//제일 처음으로 가장큰값인 꼭대기 노드와 제일 마지막 노드를 바꿔준다  
			temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp; //이렇게되면 제일 큰값이 정렬된다. 
			
			int root = 0;
			int c = 1;
			do {
				
				
				c = 2 * root + 1; 
				
				System.out.println("c : " + c  + ", root : " + root + ", i : " + i);
				
				if(c < i-1 && heap[c] < heap[c+1]) {//자식 중에 더 큰 값을 찾는다  c+1 때문에 i는  c-1 보다 작아야함 
					c++;
				}
				//루트보다 자식이 더 크다면 교환 
				if( c < i && heap[root] < heap[c]) {
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] =temp; // c는 i보다 작아야한다 왜냐면 i값은 제일 큰값으로서 이미 정렬되어있기 때문 
					
				}
				
				root = c; //부모노드를 자식노드로 이동시켜서 다시 실행함 
				
			}while(c < i);
			
		}
		
		
		for(int i = 0; i < heap.length; i++) {
			
			System.out.print(heap[i] + " ");
		}
 		
	}
	
	
	public static void main(String[] args) {
		
		heapSort();
	}
	
	
}
