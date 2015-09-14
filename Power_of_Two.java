/**************************************************************************************************
Given an integer, write a function to determine if it is a power of two.

*************************************************************************************************/

public class Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
    	if(n<=0) return false;
    	while(n>1){
    		if(n%2 !=0) return false;
    		n /= 2;
    	}
    	return true;
        
    }
    public static void main(String[] args){
    	System.out.println(isPowerOfTwo(1024)); // output:true
    }
}
