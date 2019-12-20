package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/*알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로*/
public class P1181 {

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();

		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {

			String str = sc.next();
			list.add(str);

		}
		
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				if(a.length() < b.length()) {
					return -1; //첫번째 인자가 두번째 인자보다 작으면 음수 
				}else if(a.length() > b.length()) {
					return 1; //첫번쨰 인자가 두번쨰 인자보다 크면 양수 
				}else {
					return a.compareTo(b);
				}
			}


			
		});
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		for(int i = 0; i < size; i++) {
			
			if(!list2.contains(list.get(i))) {
				list2.add(list.get(i));
			}
			
		}
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

	}

}
