package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*�ټ��̴� ��Ÿ�� ���� ������ �ִ�. �׸��� ������ ��Ÿ�� ��� �ٸ� �ø��� ��ȣ�� ������ �ִ�. �ټ��̴� ��Ÿ�� ���� ã�Ƽ� ���� ����鿡�� �������ֱ� ���ؼ� ��Ÿ�� �ø��� ��ȣ ������� �����ϰ��� �Ѵ�.

��� �ø��� ��ȣ�� ���ĺ� �빮�� (A-Z)�� ���� (0-9)�� �̷���� �ִ�.

�ø����ȣ A�� �ø����ȣ B�� �տ� ���� ���� ������ ����.

1.A�� B�� ���̰� �ٸ���, ª�� ���� ���� �´�.
2.���� ���� ���̰� ���ٸ�, A�� ��� �ڸ����� �հ� B�� ��� �ڸ����� ���� ���ؼ� ���� ���� ������ ���� �����´�. (������ �͸� ���Ѵ�)
3.���� 1,2�� �� �������ε� ���� �� ������, ���������� ���Ѵ�. ���ڰ� ���ĺ����� ���������� �۴�.
�ø����� �־����� ��, �����ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

*ù° �ٿ� ��Ÿ�� ���� N�� �־�����. N�� 1,000���� �۰ų� ����. 
*��° �ٺ��� N���� �ٿ� �ø��� ��ȣ�� �ϳ��� �־�����. �ø��� ��ȣ�� ���̴� �ִ� 50�̰�,
*���ĺ� �빮�� �Ǵ� ���ڷθ� �̷���� �ִ�. �ø��� ��ȣ�� �ߺ����� �ʴ´�.
*
*/



public class P1431 {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt(); //��Ÿ���� 
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 1; i <= count; i++) {
			
			String serial = sc.next();
			list.add(serial);
			
		}
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				
				char[] carr1 = a.toCharArray();  //���� �ϳ��ϳ��� �������� �������� Ȯ���ϱ����� ���ڿ� �迭�� ��ȯ�� 
				char[] carr2 = b.toCharArray();
				int sum1 = 0;
				int sum2 = 0;
				
				for(int i = 0; i < carr1.length; i++) {
					
					if(Character.isDigit(carr1[i])) {  //Character.isDigit(char) �Լ��� �ش� ���ڰ� �����ϰ�� true �����ϰ�� false�� ������ 
						sum1 += Integer.valueOf(String.valueOf(carr1[i]));
					}
					
				}
				
				for(int i = 0; i < carr2.length; i++) {
					if(Character.isDigit(carr2[i])) {
						sum2 += Integer.valueOf(String.valueOf(carr2[i]));
					}
					
				}
				
				if(a.length() != b.length() && a.length() < b.length()) {
					return -1;
				}else if(a.length() != b.length() && a.length() > b.length()) {
					return 1;
				}else if(a.length() == b.length() && sum1 > sum2) {
					return 1;
				}else if(a.length() == b.length() && sum1 < sum2){
					return -1;
				}else {
					return a.compareTo(b);
				}
				
				
				
		
			}
		
		});
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	
	}
	
}
