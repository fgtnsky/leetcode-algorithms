/**************************************************************************************************
https://leetcode.com/problems/reverse-integer/
Reverse Integer 
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
**************************************************************************************************/

		
public class reverse_integer {  //O(n)
    public static int myAtoi(String x){
		if(x.length()<1 | x== null) return 0;
		x = x.trim(); // delete white space
		int idx = 0;
		boolean neg = false; // catch the first char
		if(x.charAt(0) =='+') idx++;
		if(x.charAt(0) =='-') {idx++; neg = true;}
		StringBuilder s = new StringBuilder();
		//return 0 if the char after +/- is not numeric
		if(x.substring(idx,idx+1).matches("[0-9]*")==false) return 0; 
		for(;idx<x.length();idx++){
		// get all the numeric char 
			if(x.substring(idx,idx+1).matches("[0-9]*")==false) break;
			s.append(x.charAt(idx));
		}
		double res;
		// if overflow, then result = MAX OR MIN Integer
		try{
			res = Long.parseLong(s.toString());
			if(neg) res = -res;
		} catch(Exception e){ res = (neg)? Integer.MIN_VALUE:Integer.MAX_VALUE;}	
		return (int)res;
	}
	
	public static void main(String[] args){
		System.out.println(myAtoi("1000000003")); // output: 1000000003
		System.out.println(myAtoi("1000000003232323")); // output: 2147483647
		System.out.println(myAtoi("+12a233")); // output: 12
		System.out.println(myAtoi("+-23")); // output: 0
		System.out.println(myAtoi("-123")); // output: -123

	}
}





