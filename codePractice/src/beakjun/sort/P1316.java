package beakjun.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class P1316 {

	public static void main(String[] args) {

		int sum = 0;
		
		Scanner sc = new Scanner(System.in);

		ArrayList<String> list = new ArrayList();

		for (int i = 0; i <= 7; i++) {

			list.add(sc.nextLine());

		}

		int array[][] = new int[8][8];

		// 체스판 색칠하기
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {

				if(i % 2 == 0) {
					if(j % 2 == 0) {
						array[i][j] = 0;
					}else {
						array[i][j] = 1;
					}
				}
				
				if(i % 2 == 1) {
					if(j % 2 == 1) {
					 array[i][j] = 0;
					}else {
					 array[i][j] = 1;
					}
				}
				
				
			}
		
		}
		
		
		
		//갯수 구하기 
		for(int i = 0; i <= 7; i++) {
			for(int j = 0; j <=7; j++) {
				if(array[i][j] == 0 && list.get(i).substring(j, j+1).compareTo("F") == 0) {
					sum++;
				}
				
				
			}
		}
		
		
		System.out.println(sum);
		
		

	}

}
