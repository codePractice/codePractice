package baekjun.middleLevel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2644 {

	//전체인원수 
	static int n;
	
	//정답을 구해야하는 두명 
	static int x,y;
	
	//간선 갯수 
	static int edgeNumber;
	
	static int map[][];
	static boolean visit[];
	static int distance[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		edgeNumber = sc.nextInt();
		
		map = new int[n+1][n+1];
		distance = new int[n+1];
		visit = new boolean[n+1];
		
		for(int i = 1; i <= edgeNumber; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			map[a][b] = 1;
			map[b][a] = 1;
		}
		
		BFS(x,y);
		
		
		if(distance[y] == 0) {
			System.out.println(-1);
		}else {
			System.out.println(distance[y]);
		}
		
		
	}

	private static void BFS(int start, int end) {
		
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		
		visit[start] = true;
		
		while(!q.isEmpty()) {
			int v = q.poll();
			
			if(v == end) {
				break;
			}
			
			for(int i = 1; i <= n; i++) {
				if(map[v][i] == 1 && !visit[i]) {
					q.add(i);
					visit[i] = true;
					distance[i] = distance[v]+1;
					System.out.println("현재거리 : " +distance[i]);
					
				}
			}
			
		}
		
	}

}
