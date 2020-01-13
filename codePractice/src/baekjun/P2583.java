package baekjun;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2583 {
	
	static int K;
	static int N;
	static int M;
	static int map[][];
	static int visit[][];
	static int x_move[] = {-1,1,0,0};
	static int y_move[] = {0,0,-1,1};
	static ArrayList<Integer> result = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		K = sc.nextInt();
		
		map = new int[101][101];
		visit = new int[101][101];
		
		for(int i = 0; i < K; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d= sc.nextInt();
			
			
			squareInit(a,b,c,d);
		}
		
		for(int i = 0; i <N; i++) {
			for(int j = 0; j <M; j++) {
				if(visit[i][j] == 0 && map[i][j] == 0) {
					BFS(i,j);
				}
				
			}
		}
		
		
		
		
		Collections.sort(result);
		System.out.println(result.size());
		
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
		
	}

	private static void BFS(int i, int j) {
		
		
		Queue<Point> q = new LinkedList<Point>();
		
		q.add(new Point(i,j));
		visit[i][j] = 1;
		int count = 1;
		
		while(!q.isEmpty()) {
			Point point = q.poll();
			int nextX,nextY;

			for(int k = 0; k <4; k++) {
				nextX = point.x + x_move[k];
				nextY = point.y + y_move[k];
				
				if(nextX >= 0 && nextY >=0 && nextX < N && nextY < M) {
					if(visit[nextX][nextY] == 0 && map[nextX][nextY] == 0) {
						visit[nextX][nextY] = 1;
						q.add(new Point(nextX,nextY));
						count++;
					}
				}
				
			}
			
		}
		
		result.add(count);
		
		
	}

	private static void squareInit(int a, int b, int c, int d) {
		
		for(int i = a; i < c; i++) {
			for(int j = b; j < d; j++) {
				map[i][j] = 1;
			}
		}
		
	}

}
