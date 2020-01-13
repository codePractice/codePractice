package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P11724Prac {

	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static boolean visit[];
	static int N;
	static int M;
	static ArrayList<Integer> count = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		N = sc.nextInt();
		M= sc.nextInt();
		
		visit = new boolean[N+1];
		
		for(int i = 0; i < N+1; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		for(int i = 1; i <= N; i++) {
			if(!visit[i]) {
				BFS(i);
				
			}
		}
		
		System.out.println(count.size());
	
	}

	private static void BFS(int i) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(i);
		visit[i] = true;
		int result = 1;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			for(int k = 0; k < list.get(now).size(); k++) {
				int x = list.get(now).get(k);
				
				if(!visit[x]) {
					visit[x] = true;
					q.add(x);
				}
				
			}
			
		}
		
		count.add(result);
		
	}

}
