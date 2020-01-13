package baekjun.middleLevel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P11403 {
	
	
	static int graph[][];
	static int visit[];
	static int answer[][];
	static int N;
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		sc.nextLine();
		
		
		graph = new int[N][N];
		answer = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			String str[] = sc.nextLine().split(" ");
			for(int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(int i = 0; i < N; i++) {
			visit = new int[N];
			BFS(i);
			System.out.println("--------------------------");
			for(int k = 0; k < N; k++) {
				for(int j = 0; j < N; j++) {
					System.out.print(answer[k][j] + " ");
				}
				System.out.println();
			}
		}	
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}


	private static void BFS(int start) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		
		while(!q.isEmpty()) {
			int point = q.poll();
			
			for(int i = 0; i < N; i++) {
				if(graph[point][i] == 1 && visit[i] == 0) {
					visit[i] = 1;
					q.add(i);
					answer[start][i] = 1;
					
				}
			}
			
		}
		
		
	}

}
