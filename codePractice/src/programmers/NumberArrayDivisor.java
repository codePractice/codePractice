package programmers;

import java.util.ArrayList;
import java.util.Comparator;

public class NumberArrayDivisor {

	public static void main(String[] args) {
		solution(new int[] {5,9,7,10}, 5);
	}
	
	 public static int[] solution(int[] arr, int divisor) {
	      
	      ArrayList<Integer> answerList = new ArrayList<Integer>();
	      
	      
	      for(int i =0; i < arr.length; i++) {
	    	  if(arr[i] % divisor == 0) {
	    		  answerList.add(arr[i]);
	    	  }
	      }
	      
	      if(answerList.size()==0) {
	    	  return new int[] {-1};
	      }
	      
	      answerList.sort(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				return (Integer)o1 - (Integer)o2;
			}
		});
	      
	      int[] answer = new int[answerList.size()];
	      
	      for(int i =0; i < answerList.size(); i++) {
	    	  answer[i] = answerList.get(i);
	      }
	      
	      return answer;
	  }

}
