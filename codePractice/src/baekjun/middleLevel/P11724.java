package baekjun.middleLevel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class P11724 {

	static int N;
	static int M;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static boolean visit[];
	static ArrayList<Integer> result = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		visit = new boolean[N+1];
	
		for(int i = 0; i < N+1; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		
		
		for(int i = 1; i <= N; i++) {
			if(!visit[i]) {
				BFS(i);
			}
			
		}
		
		System.out.println(result.size());
		
	}

	private static void BFS(int start) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		visit[start] = true;
		q.add(start);
		
		int count = 1;
		
		while(!q.isEmpty()) {
			
			int x = q.poll();
			
			for(int i = 0; i < list.get(x).size(); i++) {
				int y = list.get(x).get(i);
				
				if(!visit[y]) {
					visit[y] = true;
					q.add(y);
					
					count++;
				}
			}
			
		}
		result.add(count);
		
	}
}
