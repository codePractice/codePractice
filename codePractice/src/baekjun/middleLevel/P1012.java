package baekjun.middleLevel;

import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1012 {

	
	static int map[][];
	static int visit[][];
	static int N;
	static int M;
	static int bug;
	static int x_move[] = {-1,1,0,0};
	static int y_move[] = {0,0,-1,1};
	static Scanner sc = new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {

		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			solve();
		}
		
		
		
	}
	
	public static void solve() {
		
		 ArrayList<Integer> list = new ArrayList<Integer>();
		
		String str[] = sc.nextLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		bug = Integer.parseInt(str[2]);
		
		
		map = new int[N][M];
		visit = new int[N][M];
		
		
		for(int i = 0; i < bug; i++) {
			
			String str2[] = sc.nextLine().split(" ");
			
			int x = Integer.parseInt(str2[0]);
			int y = Integer.parseInt(str2[1]);
			
			map[x][y] = 1;
			
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 1 && visit[i][j] == 0)
					BFS(i,j,list);
			}
		
		}
		
		System.out.println(list.size());
		
		
	} //solve End

	private static void BFS(int i, int j, ArrayList<Integer> list) {
		
		Queue<Point> q = new LinkedList<Point>();
		
		q.add(new Point(i,j));
		visit[i][j] = 1;
		
		int count = 0;
		
		while(!q.isEmpty()) {
			
			count++;
			
			Point point = q.poll();
			
			int nextX, nextY;
			
			for(int k = 0; k < 4; k++) {
				
				nextX = point.x + x_move[k];
				nextY = point.y + y_move[k];
				
				
				if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {
					if(map[nextX][nextY] == 1 && visit[nextX][nextY] == 0) {
						
						visit[nextX][nextY] = 1;
						q.add(new Point(nextX,nextY));
						
					}
				}
				
				
			}
		}
		
		list.add(count);
		
		
	}

}
