package programmers;

import java.util.ArrayList;

public class Skyscraper {

	public static void main(String[] args) {
		int[] result = solution(new int[] { 6, 9, 5, 7, 4 });

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] solution(int[] heights) {

		ArrayList<Integer> answerList = new ArrayList<Integer>();

		// ù��° ž�� �ž�� �۽Ź��� �� ����
		answerList.add(0);

		for (int i = 1; i < heights.length; i++) {
			boolean flag = false;
			for(int k = i-1	; k >= 0; k--) {
				if(heights[i] < heights[k]) {
					//System.out.println("���� : " + i);
					answerList.add(k+1);
					flag = true;
					break;
				}
			}
			if(!flag) {
				//System.out.println("���Ÿ��� : " + i);
				answerList.add(0);
			}
		}
		
		int answer[] = new int[answerList.size()];
		
		for(int i =0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}

		return answer;
	}

}
