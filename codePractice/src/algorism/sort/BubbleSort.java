package algorism.sort;

// ���� ���� �ٷ� �� index�� ���Ͽ� ���� ū���� �ڷ� ���� �Ǿ����� 
// O(n^2)
// ���� ������ ��� ���� ��ġ�� ������ �ѹ��� �ٲ����� ���� ������ ���� ����ؼ� �ڸ��� �ٲٱ� ������ 
// �ð����⵵�� ������ �����δ� �������ĺ��� �ξ� ������ ���� 
public class BubbleSort {

	
	int[] iarr = {1,10,6,5,8,7,4,3,2,9};
	int temp;
	
	
	public void sort() {
		
		System.out.println("Bubble Sort ����");
		
		
		for(int i = 0; i < iarr.length; i++) {
			
			//k < iarr.length-1-i ���� i�� ��� �ڿ������� ������� ���ĵǱ� ������ �����¾����� 
			//���ĵ� ���ڵ��� ������� �ѹ��� �ȱ� ������ ���� �ڵ�� �ƴ� 
			
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
