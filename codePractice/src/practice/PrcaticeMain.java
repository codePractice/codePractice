package practice;

import java.util.ArrayList;

public class PrcaticeMain {

	//중복된 문자열 중복제거해서 List 리턴하기 
		public static void p72() {
			int[] iarr = { 11, 11, 12, 1, 2, 3, 3, 4, 4, 5 };

			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();

			for (int i = 0; i < iarr.length; i++) {

				list.add(iarr[i]);

			}

			for (int i = 0; i < list.size(); i++) {

				if (list2.contains(list.get(i)) == false) {
					list2.add(list.get(i));
				}

			}

			for (int i = 0; i < list2.size(); i++) {

				System.out.println(list2.get(i));
			}
		}
		
		//괄호 문자열 괄호가 올바르게 닫혀있는지 푸는문제 
		public static String p74(String question) {
			
			int count = 0 ;
			
			String answer = "올바릅니다";
			
			
			for(int i = 0; i < question.length(); i++) {
				
				char ch = question.charAt(i);
				
				if(ch == '(') {
					count++;
				}else {
					count--;
					
					if(count <0) {
						return "잘못되었습니다.";
					}
				}
				
				
			}
			
			if(count != 0) {
				answer = "잘못되었습니다";
			}
			
			return answer;
			
			
		 //
			
		}

		public static void main(String[] args) {
			System.out.println(p74(")("));
			
		}

}
