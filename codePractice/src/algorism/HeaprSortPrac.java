package algorism;

public class HeaprSortPrac {

	
	public static void heapSort() {
		
		int temp;
		int heap[] = {7,6,10,8,3,5,9,1,12};
		
		//���� �������� �ٲ��� 
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
		} //������� �ؼ� �������� �ٲ��� 
		
		//���⼭���� �� ���� ����� �ϳ��� �ٿ����鼭 ������ 
		
		for(int i = heap.length -1; i >= 0; i--) {
			
			//�켱 ���� ��(���� ū��)�̶� ���� �ڶ� ��ġ�� �ٲ� 
			temp  = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			
			int root = 0;
			int c;
			
			do {
				c = root * 2 +1;
				
				//�ڽ��߿� ū���� ã�´� 
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
