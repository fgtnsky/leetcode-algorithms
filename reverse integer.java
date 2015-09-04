/**************************************************************************************************
https://leetcode.com/problems/reverse-integer/
Reverse Integer 
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
**************************************************************************************************/

		
public class reverse_integer {   //O(n) as s.reverse() costs O(n)
	public static int reverse(int x){
		boolean neg = (x<0)? true:false;
		x = Math.abs(x);
		StringBuilder s = new StringBuilder();
		s.append(Integer.toString(x));
		s.reverse();
		int res;
		// in case of overflow:
		try{
			res = Integer.parseInt(s.toString());
			if(neg) res = -res;
		} catch(Exception e){
			res = 0;}
		return res;
	}
	
	public static void main(String[] args){
		System.out.println(reverse(1000000003)); // output: 0
		System.out.println(reverse(-123)); // output: -321

	}
}





