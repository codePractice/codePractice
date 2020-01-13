package baekjun.middleLevel;

import java.util.Scanner;

public class P1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int line = 0; 
		int N = sc.nextInt();
		int sum = 0;
		while(sum < N) {
			line++;
			sum += line;
		}
		
		int bunja = 0;
		int bunmo = line+1;
		
		for(int i = sum-line+1; i <= N; i++) {
			bunja++;
			bunmo--;
		}
		if(line % 2 ==0)
			System.out.println(bunja +"/"+ bunmo);
		if(line % 2 != 0) {
			System.out.println(bunmo +"/" + bunja);
			
		}
		
	}

}
