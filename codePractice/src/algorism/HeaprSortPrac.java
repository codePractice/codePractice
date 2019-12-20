package algorism;

public class HeaprSortPrac {

	
	public static void heapSort() {
		
		int temp;
		int heap[] = {7,6,10,8,3,5,9,1,12};
		
		//먼저 힙구조로 바꿔줌 
		for(int i = 1; i < heap.length; i++) {
			
			int c = i;
			
			do {
				
				int root = (c-1) /2 ;
				
				if(heap[root] < heap[c]) {
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				
				c = root;
				
				
			}while(c != 0);
		} //여기까지 해서 힙구조로 바꿨음 
		
		//여기서부터 힙 정렬 사이즈를 하나씩 줄여가면서 정렬함 
		
		for(int i = heap.length -1; i >= 0; i--) {
			
			//우선 제일 앞(제일 큰수)이랑 제일 뒤랑 위치를 바꿈 
			temp  = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			
			int root = 0;
			int c;
			
			do {
				c = root * 2 +1;
				
				//자식중에 큰값을 찾는다 
				if( c < i-1 && heap[c] < heap[c+1]) {
					c++;
				}
				
				if(c < i && heap[root] < heap[c]) {
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
					
				}
				
				root = c;
				
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
