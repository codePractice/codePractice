package baekjun.middleLevel;

import java.awt.Point;
import java.util.*;

public class P2667 {

	static int[][] visit;
	static int[][] map;
	static int[] x_move = { -1, 0, 1, 0 };
	static int[] y_move = { 0, -1, 0, 1 };
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		map = new int[num + 3][num + 3];
		visit = new int[num + 3][num + 3];

		int call_num = 0;
		
		for (int i = 1; i <= num; i++) {
			String str = sc.next();
			for (int j = 1; j <= num; j++) {
				map[i][j] = str.charAt(j - 1) - '0';
			}
		}

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {

				if (map[i][j] != 0 && visit[i][j] == 0) {

					BFS(i, j);
					call_num++;

				}

			}
		}
		
		System.out.println(call_num);
		
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	private static void BFS(int i, int j) {

		Queue<Point> q = new LinkedList<Point>();
		
		int nextX, nextY; 
		int local_cnt = 1; 
		
		
		q.add(new Point(i,j));
		
		visit[i][j] = 1;
		
		while(!q.isEmpty()) {
			Point now = q.poll();
			
			for(int t = 0; t < 4; t++) {
				nextX = now.x + x_move[t];
				nextY = now.y + y_move[t];
				
				if(map[nextX][nextY] == 1 && visit[nextX][nextY] == 0) {
					q.add(new Point(nextX,nextY));
					visit[nextX][nextY] = 1;
					
					local_cnt++;
				}
				
			}
			
			
		}
		
		list.add(local_cnt);
		
	}

	
	
	
	
	
	
}
