package algorism.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs_BfsImpl {

	//인접리스트
	static ArrayList<Integer>[] adj;
	//BFS에서 사용할 Q 
	static Queue<Integer> Q = new LinkedList();
	//방문처리할 배열 
	static boolean[] visited;
	
	
	
	public static void dfs(int n) {
		
		visited[n] = true;
		System.out.print(n + " ");
		
		for(int x  : adj[n]) {
			
			if(visited[x] == false) {
				visited[x] = true;
				dfs(x);
			}
			
			
		}
		
	}
	
	public static void bfs(int n) {
		
		visited[n] = true;
		
		Q.add(n);
		
		while(!Q.isEmpty()) {
			int x = Q.poll();
			System.out.print(x + " ");
			
			for(int y : adj[x]) {
				if(visited[y] ==false) {
					visited[y] = true;
					Q.add(y);
				}
			}
			
		}
		
		
	}
	
	
	

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		
		
		adj = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i = 1; i<= n; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		
		for(int i = 1; i <= m; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			adj[a].add(b);
			adj[b].add(a);
			
		}
		
		
		for(int i = 1; i <= n; i++) {
			Collections.sort(adj[i]);
		}
		
		
		dfs(v);
		System.out.println();
		visited = new boolean[n+1];
		bfs(v);
		
		
	}

}
