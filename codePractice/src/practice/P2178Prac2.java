package practice;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2178Prac2 {

	
	static int x_move[] = {-1,1,0,0};
	static int y_move[] = {0,0,1,-1};
	static int map[][];
	static boolean visit[][];
	
	//-----------------------------------------------
	
	
	static int N;
	static int M;
	static int distance[][];
	
 	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M= sc.nextInt();
		
		map = new int[N][M];
		visit = new boolean[N][M];
		distance = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			for(int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}


		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(!visit[i][j] && map[i][j] != 0) {
					BFS(i,j);
				}
			
			}
		}
		
		System.out.println(distance[N-1][M-1]+1);
		
		
	}


	private static void BFS(int x, int y) {
		
		Queue<Point> q = new LinkedList<Point>();
		
		q.add(new Point(x,y));
		visit[x][y] = true;
		
		while(!q.isEmpty()) {
			
			//point -> 지금 시작점임
			Point now = q.poll();
			int nextX,nextY; 
			
			for(int k=0; k < 4; k++) {
				nextX = now.x + x_move[k];
				nextY = now.y + y_move[k];
				
				if(nextX >= 0 && nextY >=0 && nextX < N && nextY < M) {
					if(!visit[nextX][nextY] && map[nextX][nextY] != 0) {
						q.add(new Point(nextX,nextY));
						visit[nextX][nextY] = true;
						distance[nextX][nextY] = distance[now.x][now.y] + 1;
					}
				}
			}
			
			
		}
		
		
		
	}

}
