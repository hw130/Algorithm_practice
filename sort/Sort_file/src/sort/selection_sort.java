package sort;

import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		int i, j, min, index = 0, temp;
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int [] array = new int[a];
		for(i = 0; i < a; i++) {
			array[i] = scan.nextInt();
		}
		for(i = 0; i < a; i++) {
			min = 9999;
			for(j = i; j < a; j++) {
				if(min > array[i]) {
					min = array[i];
					index = j;
				}
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		for(i = 0; i < a; i++) {
			System.out.println(array[i]);
		}

	}

}
