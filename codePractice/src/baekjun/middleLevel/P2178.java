package baekjun.middleLevel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2178 {

	
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1 , 1, 0, 0};
	static int[] dy = {0 , 0, -1, 1} ;
	static int N;
	static int M;
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 M = sc.nextInt();
		 
		 arr = new int[N][M];
		 visited = new boolean[N][M];
		 
		 
		 //사용할 데이터들 초기화해줌 
		 for(int i = 0; i < N; i++) {
			 
			 String str = sc.next();
			 
			 for(int j = 0; j < M; j++) {
				 
				 arr[i][j] = str.charAt(j) - '0';
				 visited[i][j] = false;
				 
			 }
			 
		 }
		 
		 visited[0][0] = true;
		 bfs(0,0);
		 System.out.println(arr[N-1][M-1]);
		
		
	}
	
	
	public static void bfs(int x , int y) {
		
		//큐 초기화 
		Queue<Dot> Q = new LinkedList<Dot>();
		
		//출발점을 큐에 넣어줌 
		Q.add(new Dot(x,y));
		
		
		while(!Q.isEmpty()) {
			
			//큐에서 하나 꺼냄 
			
			Dot dot = Q.poll();
			
			//다음 방문할 노드를 구함 (인접한 노드를 구함) 
			for(int i = 0;  i  < 4; i++) {
				
				int nextX = dot.x + dx[i];
				int nextY = dot.y + dy[i];
				
				
				//좌표가 범위를 초과하는지 확인 
				//초과하면 그 케이스는 무시함 
				if(nextX < 0 || nextY < 0 || nextX >=N || nextY >= M)
				continue;
				
				//방문하지않았고 해당 노드가 0(막혀있는)이 아니라면 방문처리해주고 큐에 넣음 
				if(visited[nextX][nextY] == false && arr[nextX][nextY] != 0) {
				
					visited[nextX][nextY] = true;
					Q.add(new Dot(nextX,nextY));
					
					//다음에 방문할 노드의 거리는 지금까지의 거리 + 1을 해줌 
					arr[nextX][nextY] = arr[dot.x][dot.y] + 1 ;
				}
				
			}
			
		}
		
		
	}
	
	
	static class Dot {
		int x;
		int y; 
		
		public Dot(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	
	
	
}
