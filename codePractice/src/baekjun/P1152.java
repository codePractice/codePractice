package baekjun;

import java.util.ArrayList;
import java.util.Scanner;

public class P1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.nextLine();
		
		
		String arr[] = str.split(" ");
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].compareTo("") != 0)
			cnt++;
			
		}
		
		System.out.println(cnt);

	}

}
