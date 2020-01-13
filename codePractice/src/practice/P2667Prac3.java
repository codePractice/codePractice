package practice;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2667Prac3 {

	static int x_move[] = { -1, 1, 0, 0 };
	static int y_move[] = { 0, 0, -1, 1 };
	static int map[][];
	static int visit[][];
	static int N;
	static int M;

	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		 N = sc.nextInt();
		
		map = new int[N][N];
		visit = new int[N][N];

		for (int i = 0; i < N; i++) {

			String str = sc.next();

			for (int j = 0; j < N; j++) {

				map[i][j] = str.charAt(j) - '0';
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j] == 1 && visit[i][j] == 0) {
					BFS(i,j);
				}
				
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	private static void BFS(int i, int j) {
		Queue<Point> q = new LinkedList<Point>();
		
		q.add(new Point(i,j));
		visit[i][j] = 1;
		
		int count = 1;
		
		while(!q.isEmpty()) {
			Point point = q.poll();
			
			int nextX, nextY;
			
			for(int k = 0; k < 4; k++) {
				
				
				nextX = point.x + x_move[k];
				nextY = point.y + y_move[k];
				
				if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < N) {
					if(map[nextX][nextY] == 1 && visit[nextX][nextY] == 0) {
						
						visit[nextX][nextY] = 1;
						q.add(new Point(nextX,nextY));
						count++;
						
					}
					
				}
				
			}
			
		}
		
		list.add(count);
	}

}


