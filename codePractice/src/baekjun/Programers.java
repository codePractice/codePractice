package baekjun;

import java.util.*;

public class Programers {

	public static void main(String[] args) {

		
		int one[] = {1,2,3,4,5};
		int two[] = {2,1,2,3,2,4,2,5};
		int three[] = {3,3,1,1,2,2,4,4,5,5};
		
		
		int answer[] = {1,3,2,4,2};
		
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		int j = 0;
		
		for(int i = 0; i < answer.length; i++) {
			
			if(j >= one.length) {
			 j = 0;
			}
			
			if(one[j] == answer[i]) {
				cnt1++;
			}
			
			j++;
			
		}
		
		j = 0;
		
		for(int i = 0; i < answer.length; i++) {
			
			if(j >= two.length) {
			 j = 0;
			}
			
			if(two[j] == answer[i]) {
				cnt2++;
			}
			
			j++;
			
			
		}
	
		j = 0;
		
		for(int i = 0; i < answer.length; i++) {
			
			if(j >= three.length) {
			 j = 0;
			}
			
			if(three[j] == answer[i]) {
				cnt3++;
			}
			
			j++;
			
		}
		
		
		int result = Math.max(cnt1, Math.max(cnt2, cnt3));
		
		ArrayList<Integer> list = new ArrayList<Integer>();	
		
		
		if(cnt1 >= result) {
			list.add(1);
		}
		
		if(cnt2 >= result) {
			list.add(2);
		}
		
		if(cnt3 >= result) {
			list.add(3);
		}
		
		Collections.sort(list);
		
		int arr[] = new int[list.size()];
		
		
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		
		}
		
		
		
	}
	
	
	

}
