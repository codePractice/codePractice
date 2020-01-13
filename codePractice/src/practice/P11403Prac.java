package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P11403Prac {

	
	static int visit[];
	static int graph[][];
	static int result[][];
	static int N; 
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		graph = new int[N][N];
		result = new int[N][N];
		
		for(int i =0; i < N; i++) {
			for(int j = 0; j < N; j++) {
			graph[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i = 0; i < N; i++) {
			visit = new int[N];
			BFS(i);
		}
		
		for(int i =0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
	}


	private static void BFS(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		
		while(!q.isEmpty()) {
			
			int now = q.poll();
			
			for(int i = 0; i < N; i++) {
				
				if(graph[now][i] == 1 && visit[i] == 0) {
					visit[i] = 1; 
					result[start][i] = 1;
					q.add(i);
				}
				
			}
			
		}
		
		
	}

}
