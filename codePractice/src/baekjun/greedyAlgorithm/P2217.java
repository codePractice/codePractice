package baekjun.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int i  = 0; i < num; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		int max = list.get(0);
		if(num == 1) {
			System.out.println(max);
		}else {
			for(int i = 1; i < list.size(); i++) {
				if( max < list.get(i) * (i+1)) {
					max = list.get(i) * (i+1);
				}
			}
			System.out.println(max);
		}
		
		
		
		
		
	}

}
