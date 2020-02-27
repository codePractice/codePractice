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
		
		//정답 
		int answer = n - lost.length;
		
		//오름차순 정렬 ;;
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		
		// 배열을 ArrayList로
		ArrayList<Integer> lostList = new ArrayList<Integer>();
		ArrayList<Integer> reserveList = new ArrayList<Integer>();

		for (int i = 0; i < lost.length; i++) {
			lostList.add(lost[i]);
		}
		for (int i = 0; i < reserve.length; i++) {
			reserveList.add(reserve[i]);
		}
		
		

		// 우선 여분갖고있는사람 중에 체육복 훔쳐진 사람있는지 봐야함
		// 걔는 나눠줄수가 없기때문에 여분갖고있는 사람 목록에서 빼버림
		for (int i = 0; i < lostList.size(); i++) {
			for (int j = 0; j < reserveList.size(); j++) {
				if (lostList.get(i) == reserveList.get(j)) {
					lostList.remove(i);
					reserveList.remove(j);
					answer +=1;
				}
			}
		}
		
		//중요 !! 훔쳐짐이랑 여분이랑 겹쳐지는 걸 찾아서 배열을만들자 그걸 answer에 더해줘야함 
		
		
		//그럼 여튼 이제 여분 목록에있는 사람들은 무조건 수업을 들을 수 있음 
		//answer += reserveList.size();
		
		System.out.println("여기까지 answer : " + answer );
		//여분갖고있는 애들중에서 +-1씩해서 훔쳐진 애들이 있다면 
		//여분목록에서 빼고 훔쳐진애들 목록에서도 빼고 수업을 들을수 있는 수 (answer)에다가 +1하면됨 
		
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
		
		// 테스트
        

		return answer;
	}

}
