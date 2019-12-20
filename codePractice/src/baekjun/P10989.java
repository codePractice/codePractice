package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.*/

public class P10989 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] count = new int[10000];
		
		//syso나 Scanner 사용하면 2초이상걸림 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 
		int size = Integer.valueOf(br.readLine());
		
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.valueOf(br.readLine());
			
			count[array[i] - 1]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			
			if(count[i] != 0) {
				
				for(int j = 1; j <= count[i]; j++ ) {
					bw.write(i + 1 + " \n");
				}
				
			}
		}
		
		br.close();
		bw.close();
		
		
	}

}
