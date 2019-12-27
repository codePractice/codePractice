package dataSturcture;

public class BinaryTreeTarversal {
	

	

	static class Node {

		int data;
		Node leftchild;
		Node rightchild;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLeftchild() {
			return leftchild;
		}

		public void setLeftchild(Node leftchild) {
			this.leftchild = leftchild;
		}

		public Node getRightchild() {
			return rightchild;
		}

		public void setRightchild(Node rightchild) {
			this.rightchild = rightchild;
		}

	}

	static class Tree {

		Node root;

		public Node getRoot() {
			return root;
		}

		public void setRoot(Node root) {
			this.root = root;
		}

		public Node makeNode(Node left, int data, Node right) {
			Node node = new Node();
			node.data = data;
			node.leftchild = left;
			node.rightchild = right;

			return node;

		}

		public void inorder(Node node) {
			if (node != null) {
				inorder(node.leftchild);
				System.out.print(node.data + " ");
				inorder(node.rightchild);
			}
		}

		public void postorder(Node node) {
			if (node != null) {
				postorder(node.leftchild);
				postorder(node.rightchild);
				System.out.print(node.data + " ");
			}
		}

		public void preorder(Node node) {
			if (node != null) {
				System.out.print(node.data + " ");
				preorder(node.leftchild);
				preorder(node.rightchild);
			}
		}

	}
	
	public static void main(String[] args) {

		Tree tree = new Tree();
		
		Node n4 = tree.makeNode(null, 4, null);
		Node n5 = tree.makeNode(null, 5, null);
		Node n2 = tree.makeNode(n4, 2, n5);
		Node n3 = tree.makeNode(null, 3, null);
		Node n1 = tree.makeNode(n2, 1, n3);
		
		
		tree.preorder(n1);
		

	}
	

}
