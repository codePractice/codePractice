package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P13022 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> resultList = new ArrayList<String>();
		
		int count[] = new int[1001];
		int max = 0;
		
		for(int i =0; i < n; i++) {
			
			String title = sc.next();
			
			
			if(!list.contains(title)) {
				list.add(title);
			}
			
			int index = list.indexOf(title);
			
			count[index]++;
			
			if(count[index] > max)
				max = count[index];
			
		}
		
		
		for(int i = 0; i < n; i++) {
			if(count[i] == max)
				resultList.add(list.get(i));
			
		}
		
		Collections.sort(resultList);
		
		System.out.println(resultList.get(0));
		
		
	}

}
