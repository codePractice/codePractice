package algorism;

//�������� (MergeSort)
//�� ���ĵ� O(N*logn)���� �ӵ��� ������ �������� �ǹ����� ���� ������ ���׵ǰ� �̷������� O(N^2)���� ������ �̷�������� ������ 
//���������� O(N*logn)�� �ð����⵵�� �������ش� 
//�⺻���� ������ "�ϴ� ������ ������ ���߿� ���ļ� ���� "

/*
 *  7   6   5   8    3   5   9   1   
 *  
 *  6,7     5,8     3,5     1,9 	2^1
 *   
 *  5,6,7,8         1,3,5,9 		2^2
 *  
 *  1,3,5,5,6,7,8,9					2^3  
 *  
 *    ... 							���� : logN  ���� : N  =  N*logN  
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
		// n�� ����
		int i = m; // ù��° �迭�� ������(�ε���)
		int j = middle + 1; // �ι�° �迭�� ������(�ε���)
		int k = m; // �������� �迭�� ������ (�ε���)

		// ���� ������� �迭�� ����
		while (i <= middle && j <= n) {

			// �� �迭�� ������ ��
			if (data[i] <= data[j]) {

				sorted[k] = data[i];
				i++; // ��ĭ�̵�
			} else {
				sorted[k] = data[j];
				j++; // ��ĭ�̵�
			}

			k++; // ������ �迭 ��ĭ�̵�

		}

		// ���� �����͵� ����

		if (i > middle) {
			// ù��° �迭�� ���� ������ �����ٸ� �ι�° �迭�� ��� �־���

			for (int num = j; num <= n; num++) {

				sorted[k] = data[num];
				
				k++;
			}

		} else {
			// �ι�° �迭�� ���� ������ �����ٸ� ù��° �迭�� ��� �־���

			for (int num = i; num <= middle; num++) {

				sorted[k] = data[num];
				
				k++;
			}

		}
		
		// ���ĵ� �迭�� ���� 
		for(int t = m; t <= n; t++) {
			
			data[t] = sorted[t];
		}
		
		System.out.println("������");

	}
	
	
	public void mergeSort(int[] data, int m, int n) {
		
		//ũ�Ⱑ 1���� ū ���
		//����Լ��� ���� �ɰ��� ���������� �ɰ� 
		
		if(m < n) {
			
			System.out.println("�������� �����");
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
