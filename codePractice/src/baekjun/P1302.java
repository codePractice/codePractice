package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class P1302 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++) {
			
			list.add(sc.next());
			
		}
		
		
		Collections.sort(list);
		
		
		for(int i =0; i < list.size(); i++) {
			
			
			//중복된 값이 있는지 확인하고 map에 추가함 
			if(!map.containsKey(list.get(i))) {
				
				map.put((String) list.get(i), 1);
				
			}else {
				map.put((String) list.get(i), map.get(list.get(i))+1);
			}
			
		}
		
		int max = 0;
		String maxBook = "";
		
		for(String key : map.keySet()) {
			
			int value = map.get(key);
			
			
			//팔린 값은 같은데 책이름이 다를때  
			if(max == value && maxBook.compareTo(key) > 0) {
				maxBook = key;
				max = value;
			// 현재 max보다 현재 value가 더 클떄 
			}else if(max < value) {
				maxBook = key; 
				max = value;
			}
			
		}
	
		
		System.out.println(maxBook);
		
		
		
	}

}
