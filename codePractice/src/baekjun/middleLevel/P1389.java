package baekjun.middleLevel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1389 {

	static int N;
	static int M;
	static boolean visit[];
	static int map[][];
	static int dis[];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N+1][N+1];
		
		
		for(int i = 1; i <= M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			map[a][b] = 1; 
			map[b][a] = 1;
		}
		
		for(int i = 1; i <= N; i++) {
			int count = 0;
			for(int j = 1; j <= N; j++) {
				BFS(i,j);
				count += dis[j];
			}
			list.add(count);
		
		}
		
		int min = 9999999;
		int index = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < min) {
				index = i;
				min = list.get(i);
			}
		}
		
		System.out.println(index + 1);
		
		
	}

	private static void BFS(int start, int end) {
		
		visit = new boolean[N+1];
		dis = new int[N+1];
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		visit[start] = true;
		
		while(!q.isEmpty()) {
			
			int now = q.poll();
			
			if(now == end) break;
			
			for(int child = 1; child <= N; child++) {
				if(map[now][child] == 1 && !visit[child]) {
					q.add(child);
					visit[child] = true;
					dis[child] = dis[now] + 1;
				}
			}
			
		}
		
	}

}
