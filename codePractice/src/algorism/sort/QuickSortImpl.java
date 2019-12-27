package algorism.sort;

public class QuickSortImpl {

	

	public static void sort(int data[], int start, int end) {

		if (start >= end) {
			System.out.println("���Ұ� �ϳ��Դϴ�");
			return;
		}

		int pivot = start;
		int left = start + 1;
		int right = end;
		int temp;

		while (left <= right) {

			// ���ʿ��� ���������� ��ĭ�� �����ϸ鼭 �ǹ������� ū���� ã�´�
			while (left <= end && data[left] <= data[pivot]) {
				left++;
			}

			// �����ʿ��� �������� ��ĭ�� �����ϸ鼭 �ǹ������� �������� ã�´�
			while (right > start && data[right] >= data[pivot]) {
				right--;
			}

			if (left > right) { // �����ȴٸ� �ǹ��� ������(������) �ٲ��
				temp = data[right];
				data[right] = data[pivot];
				data[pivot] = temp;

			} else { // �������� �ʾҴٸ� �������� ū���� �ٲ�� (�����̶� ������)
				temp = data[right];
				data[right] = data[left];
				data[left] = temp;

			}

		}//while end 
		

	    sort(data, start, right-1);
		sort(data, right+1, end);

	}

	public static void main(String[] args) {
		int array[] = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		
		sort(array,0, array.length-1);		
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "");
		}
			
	}

}
