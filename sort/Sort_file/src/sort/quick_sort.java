package sort;

class Solution {
    public static void quickSort(int[] arr, int start, int end){
        if(start >= end) return;
        int pivot = start;
        int left = start + 1;
        int right = end;
        while(left <= right){
            while(left <= right && arr[left] <= arr[pivot])left++;
            while(right > start && arr[right] >= arr[pivot])right--;
            
            if(left >= right){
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        quickSort(arr, start, right-1);
        quickSort(arr, right+1, end);
        
    }
    public int solution(int[] array) {
        quickSort(array, 0, array.length - 1);
        int answer = array[array.length / 2];
        return answer;
    }
}
