package baekjun.middleLevel;

import java.awt.Point;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P7576 {

	static int[][] map;
	static int[][] visit;
	static int[] x_move = { 1, -1, 0, 0 };
	static int[] y_move = { 0, 0, 1, -1 };
	static Queue<Point> q = new LinkedList<Point>();
	static int N;
	static int M;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
	    N = sc.nextInt();

		sc.nextLine();

		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 1)
				q.add(new Point(i, j));
			}
		}

		
		System.out.println(solve());
		
		
		
		
		
	}

	private static int solve() {

		int result = -1;
		
		while(!q.isEmpty()) {
			
			int size = q.size();

			result++;
			
			for(int i = 0; i < size; i++) {
				
				Point point = q.poll();
				
				for(int j = 0; j < 4; j++) {
					int nextX = point.x + x_move[j];
					int nextY = point.y + y_move[j];
					
					if(nextX < 0 || nextY < 0 || nextX >= N || nextY >=M) continue;
					if(map[nextX][nextY] != 0) continue;
					
					map[nextX][nextY] = 1 ;
					q.add(new Point(nextX,nextY));
					
				}
				
			}
			
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 0) return -1;
			}
		}
	
		return result; 
	}

}
