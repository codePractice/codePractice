package practice;

import java.util.ArrayList;

public class PrcaticeMain {

	//�ߺ��� ���ڿ� �ߺ������ؼ� List �����ϱ� 
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

		public static void main(String[] args) {
			System.out.println(p74(")("));
			
		}

}
