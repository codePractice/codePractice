package baekjun.middleLevel;

import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P10026 {

	static int x_move[] = { -1, 1, 0, 0 };
	static int y_move[] = { 0, 0, -1, 1 };
	static int visit[][];
	static char map[][];
	static char fake[][];
	static int N;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		map = new char[101][101];
		fake = new char[101][101];
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j);

				if (str.charAt(j) == 'R') {
					fake[i][j] = 'G';
				}else {
					fake[i][j] = str.charAt(j);
				}
			}
		}

		for (int k = 0; k < 3; k++) {
			visit = new int[101][101];
			int count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (k == 0) {
						if (map[i][j] == 'R' && visit[i][j] == 0) {
							BFS(i, j, 'R');
							count++;
						}
					}

					if (k == 1) {
						if (map[i][j] == 'G' && visit[i][j] == 0) {
							BFS(i, j, 'G');
							count++;
						}
					}

					if (k == 2) {
						if (map[i][j] == 'B' && visit[i][j] == 0) {
							BFS(i, j, 'B');
							count++;
						}
					}

				}
			}
			list.add(count);

		}

		for (int k = 0; k < 2; k++) {
			visit = new int[101][101];
			int count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (k == 0) {
						if (fake[i][j] == 'G' && visit[i][j] == 0) {
							BFS2(i, j, 'G');
							count++;
						}
					}

					if (k == 1) {
						if (fake[i][j] == 'B' && visit[i][j] == 0) {
							BFS2(i, j, 'B');
							count++;
						}
					}

				}
			}
			list2.add(count);

		}
		


		int sum = 0;
		int sum2 = 0;

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		for (int i = 0; i < list2.size(); i++) {
			sum2 += list2.get(i);
		}

		System.out.println(sum + " " + sum2);
	}

	private static void BFS2(int i, int j, char color) {
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
					if (fake[nextX][nextY] == color && visit[nextX][nextY] == 0) {
						visit[nextX][nextY] = 1;
						q.add(new Point(nextX, nextY));
					}
				}
			}

		}
	}

	private static void BFS(int i, int j, char color) {
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
					if (map[nextX][nextY] == color && visit[nextX][nextY] == 0) {
						visit[nextX][nextY] = 1;
						q.add(new Point(nextX, nextY));
					}
				}
			}

		}

	}

}
