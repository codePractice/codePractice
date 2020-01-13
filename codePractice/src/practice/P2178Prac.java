package practice;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2178Prac {

	static int N;
	static int M;
	static int visit[][];
	static int map[][];
	static int x_move[] = {-1,1,0,0};
	static int y_move[] = {0,0,-1,1};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 String num[] = sc.nextLine().split(" ");
		 
		 N = Integer.parseInt(num[0]);
		 M= Integer.parseInt(num[1]);
		 
		 map = new int[N][M];
		 visit = new int[N][M];
		 
		 for(int i = 0; i < N; i++) {
			 String str = sc.nextLine();
			 for(int j = 0; j < M; j++) {
				 map[i][j] = str.charAt(j) - '0';
				 
			 }
		 }
		
		 for(int i = 0; i < N; i++) {
			 for(int j = 0; j < M; j++) {
				 
				 if(visit[i][j] == 0 && map[i][j] == 1) {
					 BFS(i,j);
				 }
				 
				 
			 }
		 }
		 
		 System.out.println(map[N-1][M-1]);
		 
	}

	private static void BFS(int i, int j) {

		Queue<Point> q = new LinkedList<Point>();
		
		q.add(new Point(i,j));
		
		visit[i][j] = 1;
		
		while(!q.isEmpty()) {
			int nextX,nextY;
			Point point = q.poll();
			
			
			for(int k = 0; k < 4; k++) {
				nextX = point.x + x_move[k];
				nextY = point.y + y_move[k];
				
				if(nextX >= 0 && nextX < N && nextY >=0 && nextY < M) {
					if(visit[nextX][nextY] == 0 && map[nextX][nextY] != 0 ) {
						
						q.add(new Point(nextX,nextY));
						visit[nextX][nextY] = 1;
						
						map[nextX][nextY] = map[point.x][point.y]+1;
						
					}
				}
				
				
			}
			
			
		}
		
		
	}
	
	
	

}
