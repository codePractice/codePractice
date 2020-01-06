package baekjun;

import java.util.Scanner;

public class P10809 {

	public static void main(String[] args) {

		// 97에서 122까지

		int count[] = new int[123];

		Scanner sc = new Scanner(System.in);

		String q = sc.next();

		// 1.한번씩 돌면서 영문자가 일치하는지 대조해봐야함
		// 2. 대조해서 일치하면 count 배열을 1더해주고 해당 인덱스 출력 일치하지않으면 -1 출력함

		
		int index = 0;

		for(int i = 97; i <= 122; i++) {
			
			int cnt = 0;
			
			for(int j = 0; j < q.length(); j++) {
				
				
				if((int)(q.charAt(j)) == i && count[i] == 0 ) {
					System.out.print(j +" ");
					count[i]++;
					cnt++;
				}
				
			}
			
			if(cnt == 0) {
				System.out.print(-1 +" ");
			}
			
			
		}

	}

}
