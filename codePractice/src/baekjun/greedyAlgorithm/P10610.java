package baekjun.greedyAlgorithm;

import java.util.Scanner;

public class P10610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[10];
		int sum = 0;
		
		String str = sc.next();
		
		
		for(int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - '0';
			numArr[num]++;
			sum += num;
		}
		
		if(!str.contains("0") || sum % 3 != 0) {
			System.out.println(-1);
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = 9; i >=0; i--) {
			for(int j = 1; j <= numArr[i]; j++) {
				sb.append(i);
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
