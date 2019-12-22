package dataSturcture;

import java.util.Stack;


//택배 상하차랑 비슷함 마지막에 들어온게 제일 먼저 나감 
public class StackImpl {

	public static void main(String[] args) {
		
		Stack stack = new Stack();

		stack.push(7); //데이터 추가 
		stack.push(5);
		stack.push(4);
		stack.pop(); //데이터 삭제 
		stack.push(6);
		stack.pop();
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}
