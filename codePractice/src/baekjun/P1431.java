package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*다솜이는 기타를 많이 가지고 있다. 그리고 각각의 기타는 모두 다른 시리얼 번호를 가지고 있다. 다솜이는 기타를 빨리 찾아서 빨리 사람들에게 연주해주기 위해서 기타를 시리얼 번호 순서대로 정렬하고자 한다.

모든 시리얼 번호는 알파벳 대문자 (A-Z)와 숫자 (0-9)로 이루어져 있다.

시리얼번호 A가 시리얼번호 B의 앞에 오는 경우는 다음과 같다.

1.A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
2.만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
3.만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
시리얼이 주어졌을 때, 정렬해서 출력하는 프로그램을 작성하시오.

*첫째 줄에 기타의 개수 N이 주어진다. N은 1,000보다 작거나 같다. 
*둘째 줄부터 N개의 줄에 시리얼 번호가 하나씩 주어진다. 시리얼 번호의 길이는 최대 50이고,
*알파벳 대문자 또는 숫자로만 이루어져 있다. 시리얼 번호는 중복되지 않는다.
*
*/



public class P1431 {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt(); //기타갯수 
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 1; i <= count; i++) {
			
			String serial = sc.next();
			list.add(serial);
			
		}
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				
				char[] carr1 = a.toCharArray();  //문자 하나하나가 숫자인지 문자인지 확인하기위해 문자열 배열로 변환함 
				char[] carr2 = b.toCharArray();
				int sum1 = 0;
				int sum2 = 0;
				
				for(int i = 0; i < carr1.length; i++) {
					
					if(Character.isDigit(carr1[i])) {  //Character.isDigit(char) 함수는 해당 문자가 숫자일경우 true 문자일경우 false를 리턴함 
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
