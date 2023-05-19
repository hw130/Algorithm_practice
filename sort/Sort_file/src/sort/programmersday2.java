package sort;

public class programmersday2 {
	class Solution {
	    public int solution(int num1, int num2) {
	        double answer = (double)num1 / num2;
	        double result = answer * 1000;
	        return (int)result;
	    }
	    
	    public static void main(String[] args){
	        Solution sol = new Solution();
	        System.out.println(sol.solution(3,2));
	    }
	}

}
