package dataSturcture;

import java.util.Stack;


//�ù� �������� ����� �������� ���°� ���� ���� ���� 
public class StackImpl {

	public static void main(String[] args) {
		
		Stack stack = new Stack();

		stack.push(7); //������ �߰� 
		stack.push(5);
		stack.push(4);
		stack.pop(); //������ ���� 
		stack.push(6);
		stack.pop();
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}
