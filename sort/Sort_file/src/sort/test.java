package sort;

public class test {
	class Solution {
	    public int[] solution(int[] numbers) {
	        int[] answer = new int[numbers.length];
	        try{
	            for(int i = 0; i < numbers.length; i++){
	            answer[i] = numbers[i] * 2;
	        }
	        } catch(IndexOutOfBoundsException e) {

				System.out.println(e);

	        }
	        
	            
	        return answer;
	    }
	}

	public static void main(String[] args) {
		

	}

}
