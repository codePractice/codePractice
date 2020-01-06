package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1260 {

	static boolean visited[];
	static ArrayList<Integer>[] adj;
	static Queue<Integer> queue;
	
	public static void dfs(int x) {
		
		visited[x] = true; 
		System.out.print(x + " ");
		
		for(int y : adj[x]) {
			if(visited[y] == false) {
				dfs(y);
			}
		}
		
		
	}
	
	
	public static void bfs(int x ) {
		
		queue.add(x);
		visited[x] = true;
		
		while(!queue.isEmpty()) {
			int data = queue.poll();
			System.out.print(data + " ");
			for(int y : adj[data]) {
				if(visited[y] == false) {
					visited[y] = true;
					queue.add(y);
				}
			}
			
		}
		
	}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정점 
		int N = sc.nextInt();
		//간선개수 
		int M = sc.nextInt();
		//시작점 
		int V = sc.nextInt();
		
		
		adj = new ArrayList[N+1];
		
		
		for(int i = 1; i <= N ; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			adj[a].add(b);
			adj[b].add(a);
			
		}
		
		for(int i=1 ; i<=N; i++) {
			Collections.sort(adj[i]);
		}
		
		visited = new boolean[N+1];
		queue = new LinkedList<Integer>();
		
		dfs(V);
		System.out.println();
		
		visited = new boolean[N+1];
		
		bfs(V);
		
		
	}

}
