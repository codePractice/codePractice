package baekjun.middleLevel;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2468 {

	static int x_move[] = { -1, 1, 0, 0 };
	static int y_move[] = { 0, 0, -1, 1 };
	static int map[][] = new int[101][101];
	static int N;
	static int visit[][];
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		int max = -1;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
				max = Math.max(max, map[i][j]);
			}
		}
		
		int answer = 1;
		
		for (int k = 1; k <= 100; k++) {
			visit = new int[101][101];
			int count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (visit[i][j] == 0 && map[i][j] > k) {
						BFS(i, j, k);
						count++;
					}
				}
			}
			answer = Math.max(answer, count);
		}

		System.out.println(answer);

	}

	private static void BFS(int i, int j, int rain) {
		Queue<Point> q = new LinkedList<Point>();

		q.add(new Point(i, j));
		visit[i][j] = 1;

		while (!q.isEmpty()) {

			Point point = q.poll();
			int nextX, nextY;

			for (int k = 0; k < 4; k++) {

				nextX = point.x + x_move[k];
				nextY = point.y + y_move[k];

				if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < N) {
					if (map[nextX][nextY] > rain && visit[nextX][nextY] == 0) {
						visit[nextX][nextY] = 1;
						q.add(new Point(nextX, nextY));

					}
				}

			}
		}

	}

}
