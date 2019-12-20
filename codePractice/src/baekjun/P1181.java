package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/*���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

���̰� ª�� �ͺ���
���̰� ������ ���� ������*/
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
					return -1; //ù��° ���ڰ� �ι�° ���ں��� ������ ���� 
				}else if(a.length() > b.length()) {
					return 1; //ù���� ���ڰ� �ι��� ���ں��� ũ�� ��� 
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
