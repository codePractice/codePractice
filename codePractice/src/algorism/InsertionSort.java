package algorism;

//�������� ������ ����� ���� ��ҵ��� ���ĵǾ��ִٴ� �����Ͽ� ����Ǳ⶧���� 
//��������,�������Ŀ� ���ؼ� ���� ������ ���� 
//�ð����⵵�� O(n^2)
public class InsertionSort {

	int[] iarr = {1,10,5,8,7,6,4,3,2,9};
	int temp;
	
	
	public void sort() {
		
		/*for(int i = 0; i < iarr.length-1; i++) {
			
			int j = i;
			
			while(iarr[j] > iarr[j+1]) {
				
				temp = iarr[j];
				iarr[j] = iarr[j+1];
				iarr[j+1] = temp;
				
				j--;
				
			}
			
			
		}*/
		
		for(int i = 0; i < iarr.length-1; i++) {
			
			int j = i;
			
			while(iarr[j] > iarr[j+1]) {
				
				temp = iarr[j];
				iarr[j] = iarr[j+1];
				iarr[j+1] = temp;
				
				j--;
				
			}
			
 			
		}
		
		
		
		
		
		for(int i = 0; i < iarr.length; i++) {
			
			System.out.print(iarr[i]+ " ");
		}
		
		
		
		
	}
	
	
}
