package sort;

import java.util.LinkedList;

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
}

public class dfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
