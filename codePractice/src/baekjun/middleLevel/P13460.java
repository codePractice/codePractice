package baekjun.middleLevel;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P13460 {

	static int N;
	static int M;
	static char[][] map = new char[11][11];
	static int x_move[] = {-1,1,0,0};
	static int y_move[] = {0,0,-1,1};
	static int visit[][] = new int[11][11];
	static Point blueBall = new Point();
	static Point hole = new Point();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		sc.nextLine();
		
		
		//입력부 
		for(int i = 0; i < N; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j);
				if(map[i][j] == 'B') {
					blueBall.x = i;
					blueBall.y = j;
				}else if(map[i][j] == 'O') {
					hole.x = i;
					hole.y = j;
				}
			}
		}
		
		//방문하지않았고 R인곳부터 탐색 
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(visit[i][j] == 0 && map[i][j] == 'R') {
					BFS(i,j);
				}
				
				
			}
		}
		
		
	}

	private static void BFS(int i, int j) {
		
		Queue<Point> q = new LinkedList<Point>();
		
		q.add(new Point(i,j));
		
		visit[i][j] = 1;
		
		while(!q.isEmpty()) {
			int nextX,nextY;
			Point redBall = q.poll();
			
			for(int k = 0; k < 4; k++) {
				nextX = redBall.x + x_move[k];
				nextY = redBall.y + y_move[k];
				
				
				
				if(nextX >= 1 && nextY >= 1 && nextX < N-1 && nextY < M-1) {
					if(visit[nextX][nextY] == 0) {
						
					}
				}
			}
			
		}
		
		
		
	}

	
}
