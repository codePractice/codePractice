package baekjun.middleLevel;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2589 {
	
	static int x_move[] = {-1,1,0,0};
	static int y_move[] = {0,0,1,-1};
	static char map[][];
	static int N;
	static int M;
	static boolean visit[][];
	static int distance[][];
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new char[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			for(int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 'L') {
					BFS(i,j);
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		
		
	}

	private static void BFS(int i, int j) {
		

		distance = new int[N][M];
		visit = new boolean[N][M];
		
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(i,j));
		visit[i][j] = true;
		
		
		while(!q.isEmpty()) {
			Point now = q.poll();
			int nextX,nextY;
			
			for(int k = 0; k < 4; k++) {
				nextX = now.x + x_move[k];
				nextY = now.y + y_move[k];
				
				if(nextX>=0 && nextY >=0 && nextX < N && nextY < M) {
					if(!visit[nextX][nextY] && map[nextX][nextY] == 'L') {
						q.add(new Point(nextX,nextY));
						visit[nextX][nextY] = true;
						distance[nextX][nextY] = distance[now.x][now.y] + 1;
					}
				}
				
			}
		}
		int max = 0;
		
		for(int x = 0; x< N; x++) {
			for(int y = 0; y < M; y++) {
				if(distance[x][y] > max)
					max = distance[x][y];
			}
		}
		list.add(max);
		
	}

}
