package sort;

import java.util.LinkedList;
import java.util.Scanner;

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
		Scanner scan = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int temp = 0;
		int num = scan.nextInt();
		
		Queue<Int>;

	}

}
