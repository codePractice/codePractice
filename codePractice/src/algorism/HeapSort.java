package algorism;


//�������� �������İ� �����ĸ�ŭ ���� ���� �˰�������
//���� ���� Ʈ��(Complete Binary Tree)�� ���ؼ� �� �ʿ䰡���� 
//���� ���� Ʈ���� �¿� �ڽĳ�� ������� ���� ���ԵǾ� ��尡 �߰��� ��������ʰ� ������ ���� �� ����  
//���� �ּڰ��̳� �ִ��� ������ ã�Ƴ��� ���� ���� ����Ʈ���� ������� �ϴ� Ʈ���� 
//�ִ� ���� �θ��尡 �ڽĳ�庸�� ū ��
//�ϴ� �� ������ �ϱ� ���ؼ��� ������ �����͸� �� ������ �������� �������� 
//�� ������ �ر��Ǵ� ��찡 �ִµ� �� ���� �˰������� �����(Heapify) -> �ڽź��� ū �ڽĳ��� �ڽ��� ��ġ�� �ٲ� 
//����Ʈ���� ���� (logN) * ��� ��忡 ���ؼ� Heapify�� ����ϸ� N -> O(N*logN)


public class HeapSort {

	
	public static void heapSort2() {
		
		int temp;
		int heap[] = {7,6,5,8,3,10,9,1,6};
		
		
		for(int i = 0; i < heap.length; i++) {
			
			int c = i;
			
			do {
				
			int root = (c - 1) / 2;
				
			if(heap[root] < heap[c]) {

				temp = heap[root];
				heap[root] = heap[c];
				heap[c] = temp;
			}
			
			c = root;
			
			}while(c != 0);
			
		}
		
		
		
		for(int i = heap.length-1; i >= 0; i--) {
			
			temp = heap[i];
			heap[i] = heap[0];
			heap[0] = temp;
			
			int root = 0; 
			int c = 1; 
			
			do {
			
			c = 2 * root + 1;
				
			
			if(c < i-1 && heap[c] < heap[c+1]) {
				c++;
			}
			
			if( c < i && heap[root] < heap[c]) {
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
	
	public static void heapSort() {
		
		int temp;
		int heap[] = {7,6,5,8,3,5,9,1,6};
		
		//���� ��ü Ʈ�������� �� ������ �ٲ۴�  (�ڽ� ��尡 �θ� ��� ���� ũ�������� ���� ������ �������� ������)
		for(int i = 1; i < heap.length; i++) {
			
			int c = i; //�ڽĳ�带 ��Ÿ�� 
			do {
				int root = (c-1) /2; //Ư�� ����� �θ� ��Ÿ�� 
				if(heap[root] < heap[c]) { //�θ��尡 �ڽĳ�庸�� ������ ���� ���� �ٲ۴� 
					
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] =temp;
					
				}
				
				c = root; //������ �ڽĳ���� �θ�� �̵��Ͽ� �ݺ� ����
				
			}while(c!=0); //�ڽĳ�尡 �θ��尡 �ɶ����� �ݺ� 
		}
	

		
		//ũ�⸦ �ٿ����� �ݺ������� ���� �����Ѵ� 
		for(int i = heap.length-1; i >= 0; i--) {
			//���� ó������ ����ū���� ����� ���� ���� ������ ��带 �ٲ��ش�  
			temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp; //�̷��ԵǸ� ���� ū���� ���ĵȴ�. 
			
			int root = 0;
			int c = 1;
			do {
				
				
				c = 2 * root + 1; 
				
				System.out.println("c : " + c  + ", root : " + root + ", i : " + i);
				
				if(c < i-1 && heap[c] < heap[c+1]) {//�ڽ� �߿� �� ū ���� ã�´�  c�� i-1���� Ŀ�������� �̹� ���ĵ� ������ ������ ���ع��� 
					c++;
				}
				//��Ʈ���� �ڽ��� �� ũ�ٸ� ��ȯ 
				if( c < i && heap[root] < heap[c]) {
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] =temp;
					
				}
				
				root = c; //�θ��带 �ڽĳ��� �̵����Ѽ� �ٽ� ������ 
				
			}while(c < i);
			
		}
		
		
		for(int i = 0; i < heap.length; i++) {
			
			System.out.print(heap[i] + " ");
		}
 		
	}
	
	
	public static void main(String[] args) {
		
		heapSort2();
	}
	
	
}