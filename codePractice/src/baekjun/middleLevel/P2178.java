package baekjun.middleLevel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2178 {

	
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1 , 1, 0, 0};
	static int[] dy = {0 , 0, -1, 1} ;
	static int N;
	static int M;
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 M = sc.nextInt();
		 
		 arr = new int[N][M];
		 visited = new boolean[N][M];
		 
		 
		 //����� �����͵� �ʱ�ȭ���� 
		 for(int i = 0; i < N; i++) {
			 
			 String str = sc.next();
			 
			 for(int j = 0; j < M; j++) {
				 
				 arr[i][j] = str.charAt(j) - '0';
				 visited[i][j] = false;
				 
			 }
			 
		 }
		 
		 visited[0][0] = true;
		 bfs(0,0);
		 System.out.println(arr[N-1][M-1]);
		
		
	}
	
	
	public static void bfs(int x , int y) {
		
		//ť �ʱ�ȭ 
		Queue<Dot> Q = new LinkedList<Dot>();
		
		//������� ť�� �־��� 
		Q.add(new Dot(x,y));
		
		
		while(!Q.isEmpty()) {
			
			//ť���� �ϳ� ���� 
			
			Dot dot = Q.poll();
			
			//���� �湮�� ��带 ���� (������ ��带 ����) 
			for(int i = 0;  i  < 4; i++) {
				
				int nextX = dot.x + dx[i];
				int nextY = dot.y + dy[i];
				
				
				//��ǥ�� ������ �ʰ��ϴ��� Ȯ�� 
				//�ʰ��ϸ� �� ���̽��� ������ 
				if(nextX < 0 || nextY < 0 || nextX >=N || nextY >= M)
				continue;
				
				//�湮�����ʾҰ� �ش� ��尡 0(�����ִ�)�� �ƴ϶�� �湮ó�����ְ� ť�� ���� 
				if(visited[nextX][nextY] == false && arr[nextX][nextY] != 0) {
				
					visited[nextX][nextY] = true;
					Q.add(new Dot(nextX,nextY));
					
					//������ �湮�� ����� �Ÿ��� ���ݱ����� �Ÿ� + 1�� ���� 
					arr[nextX][nextY] = arr[dot.x][dot.y] + 1 ;
				}
				
			}
			
		}
		
		
	}
	
	
	static class Dot {
		int x;
		int y; 
		
		public Dot(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	
	
	
}
