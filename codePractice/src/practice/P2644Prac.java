package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2644Prac {

	static int n;
	static int start;
	static int end;
	static int m;
	static boolean visit[];
	static int map[][];
	static int distance[];
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		n = sc.nextInt();
		start = sc.nextInt();
		end = sc.nextInt();
		m = sc.nextInt();
		
		map = new int[n+1][n+1];
		visit = new boolean[n+1];
		distance = new int[n+1];
		
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b=  sc.nextInt();
			
			map[a][b] = 1;
			map[b][a] = 1;
		}

		
		BFS(start,end);
		
		
		if(distance[end] == 0) {
			System.out.println(-1);
		}else {
			System.out.println(distance[end]);
		}
		
		
	}


	private static void BFS(int start, int end) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		visit[start] = true;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			if(now == end) {
				break;
			}
			
			for(int child = 1; child <= n; child++) {
				if(map[now][child] == 1 && !visit[child]) {
					q.add(child);
					visit[child] = true;
					distance[child] = distance[now] + 1;
				}
			}
			
			
		}
		
		
		
	}

}
