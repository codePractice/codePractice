package algorism.sort;

//��� ���� 
//EX) 5���� �ڿ��� �����͵��� �������� �����Ͻÿ��� ���� 
//���� ������ �ִ� ��쿡 ���ؼ� ������ ���� �˰����̴� �ӵ��� ���� O(N)
//ũ�⸦ �������� ������ ���� ���? ��� ���� 


public class CountingSort {

	
	
	
	public static void main(String[] args) {

		
		int[] count = new int[5]; //�߿� ! ������ �����ذ��� 5���� �ڿ����̱� ������ 5 
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
