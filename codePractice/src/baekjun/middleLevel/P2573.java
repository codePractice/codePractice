package baekjun.middleLevel;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2573 {

	static int N;
	static int M;
	static int map[][];
	static boolean visit[][];
	static int x_move[] = { -1, 1, 0, 0 };
	static int y_move[] = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		map = new int[N][M];

		visit = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!visit[i][j] && map[i][j] != 0) {
					BFS(i, j);
				}

			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

	}

	private static void BFS(int i, int j) {

		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(i,j));
		visit[i][j] = true;
		
		while(!q.isEmpty()) {
			Point now = q.poll();
			int nextX, nextY; 
			
			System.out.println("now.x : " + now.x +", now.y : " + now.y);
			
			for(int k = 0; k < 4; k++) {
				nextX = x_move[k] +now.x;
				nextY = y_move[k] +now.y;
				
				//얼음 녹이기 처리 
				if(nextX >=0 && nextY >= 0 && nextX < N && nextY < M) {
					if(map[nextX][nextY] == 0 && map[now.x][now.y] -1 >= 0 &&
							!visit[nextX][nextY]) {
						map[now.x][now.y] -= 1;
					}
					
					if(map[nextX][nextY] == 0 && !visit[nextX][nextY]) {
						q.add(new Point(nextX,nextY));
						visit[nextX][nextY] = true;
					}
				}
				
				
			}
			
		}

	}

}
