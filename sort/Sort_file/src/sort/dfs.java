package sort;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class Queue<T> {
	
}
class Graph {
	class Node {
		int data;
		LinkedList<Node> adjacent;
		boolean marked;
		Node(int data){
			this.data = data;
			this.marked = marked;
			adjacent = new LinkedList<Node>();
		}
	}
	Node[] nodes;
	Graph(int size){
		nodes = new Node[size];
		for(int i = 0; i < size; i++) {
			nodes[i] = new Node(i);
		}
		
	}
	void addEdge(int i1, int i2) {
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
	}
	void dfs() {
		dfs(0);
	}
	void dfs(int index) {
		Node root = nodes[index];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		root.marked = true; //stack에 push 됐다고 표
		while(!stack.isEmpty()) {
			Node r = stack.pop();
			for(Node n : r.adjacent) {
				if(n.marked == false) {
					n.marked = true;
					stack.push(n);
				}
			}
			visit(r);
		}
	}
	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue = new Queue<Node>();
		queue.enqueue(root);
		root.marked = true;
		while(!queue.isEmpty()) {
			Node r = queue.dequeue();
			for(Node n: r.adjacent) {
				if(n.marked = false) {
					n.marked = true;
					queue.enqueue(n);
				}
			}
		}
	}
	
}

public class dfs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int temp = 0;
		int num = scan.nextInt();
		
		Queue<Int>;

	}

}
