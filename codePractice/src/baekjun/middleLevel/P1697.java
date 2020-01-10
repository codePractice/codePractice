package baekjun.middleLevel;

import java.util.*;
import java.io.*;
 
// https://www.acmicpc.net/problem/1697
 
public class P1697 {
    
	
 
    public static void main(String[] args) throws Exception {
       
    	Scanner sc = new Scanner(System.in);
    	
    	
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	
    	System.out.println(bfs(N,K));
    	
    	
    }
 
    static int bfs(int N, int K) {
    
    	
    	int visit[] = new int[100001];
    	
    	Queue<Integer> q = new LinkedList<Integer>();
    	
    	
    	q.add(N);
    	
    	visit[N] = 0;
    	
    	
    	while(!q.isEmpty()) {
    		
    		int now = q.poll();
    		
    		for(int i = 0; i < 3; i++) {
    			
    			int next = 0;
    			
    			if(now == K) {
    				return visit[now];
    			}
    			
    			if(i == 0) {
    				
    				next = now - 1;
    				
    			}
    			
    			if(i ==1 ) {
    				next = now + 1;
    			}
    			
    			if(i==2) {
    				next = now * 2;
    			}
    			
    			
    			if(next >= 0 && next <= 100000 && visit[next] == 0) {
    				
    				q.add(next);
    				visit[next] = visit[now] + 1; 
    				
    			}
    			
    		}
    	
    		
    		
    		
    	}
    
    	return 0;
    	
    }
    
}