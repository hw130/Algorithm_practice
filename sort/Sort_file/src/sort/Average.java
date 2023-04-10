package sort;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[num];
		int temp, sum = 0, avg, center = 0;
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < num; i++) {
			sum += arr[i];
		}
		avg = sum / num;
		System.out.println("평균: %d" + avg);
		
		if(num % 2 == 0) {
			center = num / 2;
		} else {
			center = (num / 2) + 1;
		}
		
		System.out.println("중앙값: %d" + arr[center]);
		
		

	}

}
