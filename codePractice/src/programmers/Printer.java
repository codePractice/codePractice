package programmers;

import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {2,2,2,1,3,4},3));
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        
        Queue<Point> q = new LinkedList<Point>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        
        
        for(int i = 0; i < priorities.length; i++) {
        	q.add(new Point(i, priorities[i]));
        	list.add(priorities[i]);
        }
        
       
        while(true) {
        	
        	Point current = q.poll();
        	boolean flag = true;
        	
        	
        	for(int i = 0; i < list.size(); i++) {
            	if(current.y < list.get(i)) {
            		System.out.println("뒤로보냄 x : " + current.x + ", 우선순위 : " + current.y);
            		q.add(current);
            		flag = false;
            		break;
            	}
            }
            
            if(flag) {
            	System.out.println("인쇄  x : " + current.x + ", 우선순위 : " + current.y);
            	list.remove(list.indexOf(current.y));
            	answer++;
            	if(current.x == location) {
            		return answer;
            	}
            }
        
        }
        
       
    }

}
