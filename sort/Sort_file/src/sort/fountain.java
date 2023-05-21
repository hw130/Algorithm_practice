package sort;

public class fountain {
	class Solution {
	    public int gcd(int p, int q){
	        if(q == 0) return p;
	        else return gcd(q, p % q);
	    }
	    
	    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        int[] data = {numer1 * denom2, numer2 * denom1, denom1 * denom2};
	        
	        int[] result = {data[0] + data[1], data[2]};
	        

	        
	        int a = gcd(result[0], result[1]);
	        
	        int[] answer = {result[0] / a, result[1] / a};
	        
	        
	        return answer;
	    }
	    
	}

}
