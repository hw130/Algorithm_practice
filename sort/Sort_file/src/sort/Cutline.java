package sort;

import java.util.Scanner;

public class Cutline {

	public static void main(String[] args) {
		int i, j, num,a, temp;
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		a = scan.nextInt();
		
		int[] arr = new int[num];
		
		for(i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(i = 0; i < num; i++) {
			for(j = 0; j < num - i - 1; j++) {
				if(arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(arr[a - 1]);
	}

}
