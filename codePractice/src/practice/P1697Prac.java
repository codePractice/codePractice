package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1697Prac {

	static int subin[] = new int[100001];
	static int distance[] = new int[100001];
	static int N;
	static int K;
	static int count = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str[] = sc.nextLine().split(" ");

		N = Integer.parseInt(str[0]);
		K = Integer.parseInt(str[1]);
		

		if (K <= N) {
			System.out.println(N-K); return;
		}
		
		//배열 초기화 
		for(int i = 0; i <= K; i++) {
			subin[i] = i;
		}
		
		
		
		BFS(N);
		
		
	}

	private static void BFS(int n) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		
		//큐에 넣고 방문 처리 해줌 
		q.add(n);
		distance[n] = 0;
		
		while(!q.isEmpty()) {
			
			int next = 0;
			
			int now = q.poll();
			
			//도착하면 종료 
			if(now == K) {
				System.out.println(distance[now]);
				return;
			}
			
			for(int i = 0; i <3; i++) {
				
				if(i == 0) {
					next = now - 1;
				}
				
				if(i == 1) {
					next = now + 1;
				}
				
				if(i == 2) {
					next = now * 2;
				}
				
				//방문안했다면 방문처리해주고 큐에넣는다 
				if(next >= 0 && next <= 100000)
				if(distance[next] == 0) {
					distance[next] = distance[now] + 1;
					q.add(next);
				}
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}

	
	
	
}
