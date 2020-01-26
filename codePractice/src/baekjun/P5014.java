package baekjun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P5014 {

	static int totalFloor;
	static int gangho;
	static int startLink;
	static int up;
	static int down;
	static int count = 0;
	static int distance[];
	static boolean[] visit;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		totalFloor = sc.nextInt();
		gangho = sc.nextInt();
		startLink = sc.nextInt();
		up = sc.nextInt();
		down = sc.nextInt();
		
		BFS(gangho);
		
		if(!visit[startLink]) {
			System.out.println("use the stairs");
		}else {
			System.out.println(distance[startLink]);
		}
	}

	private static void BFS(int gangho) {
		
		visit = new boolean[totalFloor+1];
		distance = new int[totalFloor+1];
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(gangho);
		visit[gangho] = true;
		
		
		
		while(!q.isEmpty()) {
			
			int now = q.poll();
			int next;
			
			if(now == startLink) break;
			
			for(int i = 0; i < 2; i++) {
				//내려갈때 
				if(i == 0) {
					next = now - down;
					if(next <= totalFloor && next >= 1 && !visit[next]) {
						q.add(next);
						visit[next] = true;
						distance[next] = distance[now] + 1;
					}
				}
				//올라갈때 
				if(i == 1) {
					next = now + up;
					if(next >= 1 && next <= totalFloor && !visit[next]) {
						q.add(next);
						visit[next] =true;
						distance[next] = distance[now] + 1;
					}
				}
			}
			
		}
		
		
	}

}
