package dataSturcture;

import java.util.LinkedList;
import java.util.Queue;

//은행창구처럼 먼저 들어온 데이터가 먼저 나감 
public class QueImpl {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>(); 
		
		
		q.add(7); //데이터 추가 
		q.add(5);
		q.add(4);
		q.poll(); //데이터 삭제 
		q.add(6);
		q.poll();
		
		while(!q.isEmpty()) {
			
			System.out.println(q.poll() + " ");
			
		}
		
		

	}

}
