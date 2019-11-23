package practice;

import java.util.ArrayList;

public class PrcaticeMain {
		
		//FIZBUZZ문제 1~100까지 출력하고 3으로 나누어떨어지면 Fizz 5로 나누어 떨어지면 Buzz 3과 5로 모두 나누어 떨어지면 FizzBuzz를 출력 
		public static void FizzBuzz() {
			
			for(int i =1; i <= 100; i++) {
				
				
				if(i%3 == 0 && i%5 == 0) {
					System.out.println("FizzBuzz");
				}else if(i % 3 == 0) {
					System.out.println("Fizz");
				}else if(i % 5 == 0) {
					System.out.println("Buzz");
				}else {
					System.out.println(i);
				}
				
				
				
			}
			
			
		}
		
		
		//중복된 문자열 중복제거해서 List 리턴하기 
		public static void p72() {
			int[] iarr = { 11, 11, 12, 1, 2, 3, 3, 4, 4, 5 };

			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();

			for (int i = 0; i < iarr.length; i++) {

				list.add(iarr[i]);
				
				if(!list2.contains(iarr[i])) {
					list2.add(iarr[i]);
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

		//라이브러리를 사용하지않고 문자를 뒤집는 문제 
		public static String p71(String question) {
			
			String answer = "";
			
			
			
		
			for(int i = question.length()-1 ; i >= 0; i--) {
				
				answer += question.charAt(i);
			}
			
			
			
			return answer;
		}

		
		
		
		
		
		
		
		public static void main(String[] args) {
			p72();
		
		}

}
