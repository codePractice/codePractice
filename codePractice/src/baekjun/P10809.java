package baekjun;

import java.util.Scanner;

public class P10809 {

	public static void main(String[] args) {

		// 97���� 122����

		int count[] = new int[123];

		Scanner sc = new Scanner(System.in);

		String q = sc.next();

		// 1.�ѹ��� ���鼭 �����ڰ� ��ġ�ϴ��� �����غ�����
		// 2. �����ؼ� ��ġ�ϸ� count �迭�� 1�����ְ� �ش� �ε��� ��� ��ġ���������� -1 �����

		
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
