package sort;

import java.util.Scanner;

public class curious {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = 0;
		int min = 9999;
		for (int i = 0; i < num; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < num; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.printf("%d %d", min, max);

	}

}
