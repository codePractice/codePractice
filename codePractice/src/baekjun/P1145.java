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

/*		�ټ� ���� �ڿ����� �ִ�.
 * 		 �� ���� ��� ��κ��� ����� ���� �� �� ��� �� ���� ������ ���� ���� ���� �ڿ����̴�.
		���� �ٸ� �ټ� ���� �ڿ����� �־��� ��, ��� ��κ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		ù° �ٿ� �ټ� ���� �ڿ����� �־�����. 100���� �۰ų� ���� �ڿ����̰�, ���� �ٸ� ���̴�.
		*/
		
		int data[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//�迭 �ʱ�ȭ 
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
