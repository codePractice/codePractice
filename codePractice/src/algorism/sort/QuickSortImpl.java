package algorism.sort;

public class QuickSortImpl {

	

	public static void sort(int data[], int start, int end) {

		if (start >= end) {
			System.out.println("원소가 하나입니다");
			return;
		}

		int pivot = start;
		int left = start + 1;
		int right = end;
		int temp;

		while (left <= right) {

			// 왼쪽에서 오른쪽으로 한칸씩 전진하면서 피벗값보다 큰값을 찾는다
			while (left <= end && data[left] <= data[pivot]) {
				left++;
			}

			// 오른쪽에서 왼쪽으로 한칸씩 전진하면서 피벗값보다 작은값을 찾는다
			while (right > start && data[right] >= data[pivot]) {
				right--;
			}

			if (left > right) { // 엇갈렸다면 피벗과 작은값(오른쪽) 바꿔라
				temp = data[right];
				data[right] = data[pivot];
				data[pivot] = temp;

			} else { // 엇갈리지 않았다면 작은값과 큰값을 바꿔라 (왼쪽이랑 오른쪽)
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
