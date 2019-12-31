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
			
			
			//�ߺ��� ���� �ִ��� Ȯ���ϰ� map�� �߰��� 
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
			
			
			//�ȸ� ���� ������ å�̸��� �ٸ���  
			if(max == value && maxBook.compareTo(key) > 0) {
				maxBook = key;
				max = value;
			// ���� max���� ���� value�� �� Ŭ�� 
			}else if(max < value) {
				maxBook = key; 
				max = value;
			}
			
		}
	
		
		System.out.println(maxBook);
		
		
		
	}

}
