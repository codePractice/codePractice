package practice;

import java.util.ArrayList;

public class PrcaticeMain {
		
		//FIZBUZZ���� 1~100���� ����ϰ� 3���� ����������� Fizz 5�� ������ �������� Buzz 3�� 5�� ��� ������ �������� FizzBuzz�� ��� 
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
		
		
		//�ߺ��� ���ڿ� �ߺ������ؼ� List �����ϱ� 
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
		
		//��ȣ ���ڿ� ��ȣ�� �ùٸ��� �����ִ��� Ǫ�¹��� 
		public static String p74(String question) {
			
			int count = 0 ;
			
			String answer = "�ùٸ��ϴ�";
			
			
			for(int i = 0; i < question.length(); i++) {
				
				char ch = question.charAt(i);
				
				if(ch == '(') {
					count++;
				}else {
					count--;
					
					if(count <0) {
						return "�߸��Ǿ����ϴ�.";
					}
				}
				
				
			}
			
			if(count != 0) {
				answer = "�߸��Ǿ����ϴ�";
			}
			
			return answer;
			
			
		 //
			
		}

		//���̺귯���� ��������ʰ� ���ڸ� ������ ���� 
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
