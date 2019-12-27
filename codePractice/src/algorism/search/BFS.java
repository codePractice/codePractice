package algorism.search;

import java.util.LinkedList;
import java.util.Stack;

//�ʺ� �켱 Ž��(Breadth First Search, BFS)�� Ž���� �Ҷ� �ʺ� �켱���� �Ͽ� Ž���� �����ϴ� Ž�� �˰����� 
//Ư�� �ſ����� Ž���� �ϰ��� �ҋ� ����� �� �ִ� Ž���� 
//BFS�� �ִ� ��θ� ã���شٴ� ������ �ִܱ��̸� �����ؾ��Ҷ� ���� �����  EX) �̷�ã�� 
//Ž������ ť�� �ʿ��� 

//1. ���� ��ܿ��ִ� ��带 ť�� �־��� , �־��� ���� �湮 ó���� 
//2. ť���� �ϳ��� ��带 ���� 
//3. �ش� ��忡 ����� ����� �湮���� ���� ��带 �湮�ϰ� ���ʴ�� ť�� ������
public class BFS {

	public class Graph {

		class Node {
			int data;
			LinkedList<Node> adj; // ����
			boolean marekd; //�湮Ȯ�� 
			
			Node(int data){
				this.data = data;
				this.marekd = false;
				adj = new LinkedList<Node>();
			}
			
		}
		
		Node[] nodes;
		Graph(int size){
			nodes = new Node[size];
			for(int i =0; i < size; i++) {
				nodes[i] = new Node(i);
			}
		}
		
		void addEdge(int i1, int i2) {
			Node n1 = nodes[i1];
			Node n2 = nodes[i2];
			
			if(!n1.adj.contains(n2)) {
				n1.adj.add(n2);
			}
			
			if(!n2.adj.contains(n1)) {
				n2.adj.add(n1);
			}
		}
		
		void dfs() {
			dfs(0);
		}
		
		void dfs(int index) {
			Node root = nodes[index];
			Stack<Node> stack = new Stack<Node>();
			stack.push(root);
			root.marekd = true;
			
			while(!stack.isEmpty()) {
				Node r = stack.pop();
				for(Node n : r.adj) {
					if(n.marekd == false) {
						n.marekd = true;
						stack.push(n);
					}
				}
				
			}
		}
	}//Class Graph

	
	
	
	
	
}
