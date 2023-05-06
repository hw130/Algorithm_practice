package sort;

import java.util.LinkedList;
import java.util.Scanner;

public class bfs {
	Scanner scan  = new Scanner(System.in);
	
	int n = scan.nextInt(); //정점의 개수
	int m = scan.nextInt(); //간선의 개
	int v = scan.nextInt(); //탐색을 위한 정점의 번호 
	
	boolean visited[] = new boolean[n+1];
	
	LinkedList<Integer> adjList = new LinkedList[n+1];
	
	for(int i = 0; i <=n ; i++) {
		adjList[i] = new LinkedList<Integer>();
	}
	
	for (int i = 0; i < m; i++) {
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		adjList[v1].add(v2);
		adjList[v2].add(v1);
	}

	for (int i = 1; i <= n; i++) { 
		Collections.sort(adjList[i]); // 방문 순서를 위해 오름차순 정렬 
	}

	System.out.println("BFS - 인접리스트");
	bfs_list(v, adjList, visited);
}
}
