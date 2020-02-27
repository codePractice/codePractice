package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class TrainingClothes {

	public static void main(String[] args) {
		int[] lostInput = {3,7};
		int[] reverseInput = {2,4};
		System.out.println(solution(8,lostInput,reverseInput));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		
		//���� 
		int answer = n - lost.length;
		
		//�������� ���� ;;
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		
		// �迭�� ArrayList��
		ArrayList<Integer> lostList = new ArrayList<Integer>();
		ArrayList<Integer> reserveList = new ArrayList<Integer>();

		for (int i = 0; i < lost.length; i++) {
			lostList.add(lost[i]);
		}
		for (int i = 0; i < reserve.length; i++) {
			reserveList.add(reserve[i]);
		}
		
		

		// �켱 ���а����ִ»�� �߿� ü���� ������ ����ִ��� ������
		// �´� �����ټ��� ���⶧���� ���а����ִ� ��� ��Ͽ��� ������
		for (int i = 0; i < lostList.size(); i++) {
			for (int j = 0; j < reserveList.size(); j++) {
				if (lostList.get(i) == reserveList.get(j)) {
					lostList.remove(i);
					reserveList.remove(j);
					answer +=1;
				}
			}
		}
		
		//�߿� !! �������̶� �����̶� �������� �� ã�Ƽ� �迭�������� �װ� answer�� ��������� 
		
		
		//�׷� ��ư ���� ���� ��Ͽ��ִ� ������� ������ ������ ���� �� ���� 
		//answer += reserveList.size();
		
		System.out.println("������� answer : " + answer );
		//���а����ִ� �ֵ��߿��� +-1���ؼ� ������ �ֵ��� �ִٸ� 
		//���и�Ͽ��� ���� �������ֵ� ��Ͽ����� ���� ������ ������ �ִ� �� (answer)���ٰ� +1�ϸ�� 
		
		for(int i = 0; i < reserveList.size(); i++) {
			int plus1 = reserveList.get(i) +1;
			int minus1= reserveList.get(i) -1;
			
			if(lostList.contains(minus1)) {
				int index = lostList.indexOf(minus1);
				lostList.remove(index);
				answer += 1;
				continue;
			}
			
			if(lostList.contains(plus1)) {
				int index = lostList.indexOf(plus1);
				lostList.remove(index);
				answer += 1;
			}
			
			
		}
		
		// �׽�Ʈ
        

		return answer;
	}

}
