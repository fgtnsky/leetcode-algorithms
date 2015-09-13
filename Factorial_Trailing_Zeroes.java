/**************************************************************************************************
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

**************************************************************************************************/

public class Factorial_Trailing_Zeroes { //O(log(n))
	   public static int trailingZeroes(int n) {
	        int res = 0; int i=0;
	        while(n>= Math.pow(5, ++i)){
	        	res += n/Math.pow(5, i);
	        }
	        return res;
	    }
	
    
	public static void main(String[] args){
		System.out.println(trailingZeroes(21)); // output: 4
	}
}
