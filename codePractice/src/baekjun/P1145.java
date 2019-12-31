package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1145 {

	
	
	public static int gcd(int x, int y) {
		
		while(y>0) {
			
			int temp = y;
			y = x % y; 
			x = temp;
			
		}
		
		return x; 
	}
	
	
	public static int lcm(int x, int y) {
		
		return (x*y) / gcd(x, y);
		
	}
	
	
	public static void main(String[] args) {

/*		다섯 개의 자연수가 있다.
 * 		 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.
		서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.
		
		첫째 줄에 다섯 개의 자연수가 주어진다. 100보다 작거나 같은 자연수이고, 서로 다른 수이다.
		*/
		
		int data[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//배열 초기화 
		for(int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		
		
		list.add(lcm(lcm(data[0],data[1]),data[2]));
		list.add(lcm(lcm(data[0],data[1]),data[3]));
		list.add(lcm(lcm(data[0],data[1]),data[4]));
		
		list.add(lcm(lcm(data[1],data[2]),data[3]));
		list.add(lcm(lcm(data[1],data[2]),data[4]));
		
		list.add(lcm(lcm(data[2],data[3]),data[4]));
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
		
	}

}
