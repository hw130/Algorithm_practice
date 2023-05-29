package sort;

public class modeSort {
	public class void quickSort(int[] arr, int start, int end) {
		if(start >= end) return;
		int pivot = start;
		int left = start + 1;
		int right = end;
		while(left <= right) {
			while(left <= right && arr[left] <= arr[pivot]) left ++;
			while(right > start && arr[right] >= arr[pivot]) right --;
			if(left >= right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			} else {
				int temp = arr[pivot];
				arr[pivot] = arr[left];
				arr[left] = temp;
			}
		}
		quickSort(arr, left, right - 1);
		quickSort(arr, right + 1, end);
	}

}
