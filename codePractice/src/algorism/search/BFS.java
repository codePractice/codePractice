package algorism.search;

import java.util.LinkedList;
import java.util.Stack;

//너비 우선 탐색(Breadth First Search, BFS)는 탐색을 할때 너비를 우선으로 하여 탐색을 수행하는 탐색 알고리즘임 
//특히 매옥적인 탐색을 하고자 할떄 사용할 수 있는 탐색임 
//BFS는 최단 경로를 찾아준다는 점에서 최단길이를 보장해야할때 많이 사용함  EX) 미로찾기 
//탐색에는 큐가 필요함 

//1. 제일 상단에있는 노드를 큐에 넣어줌 , 넣어준 노드는 방문 처리함 
//2. 큐에서 하나의 노드를 꺼냄 
//3. 해당 노드에 연결된 노드중 방문하지 않은 노드를 방문하고 차례대로 큐에 삽임함
public class BFS {

	public class Graph {

		class Node {
			int data;
			LinkedList<Node> adj; // 인접
			boolean marekd; //방문확인 
			
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
