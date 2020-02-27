package programmers;

import java.util.ArrayList;

public class HateSameNumber {

	public static void main(String[] args) {
		int print[] = solution(new int[] {1,1,3,3,0,1,1});
	}
	
	
	public static int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        
        //list에 추가시킴 
        for(int i=0;i<arr.length;i++) {
        	list.add(arr[i]);
        }
        
        for(int i =0; i < list.size(); i++) {
        	if(i+1 == list.size()) {
        		answerList.add(list.get(i));
        		break;
        	}
        	
        	int now = list.get(i);
        	int next = list.get(i+1);
        	
        	System.out.println("now : " + now);
        	
        	if(now == next) {
        		continue;
        	}else {
        		System.out.println("추가하는것 : " + now);
        		answerList.add(now);
        	}
        }
        
        int[] answer = new int[answerList.size()];

        
        //테스트 
        for(int i =0; i < answerList.size();i++) {
        	answer[i] = answerList.get(i);
        }
        
        
        return answer;
	}

}
