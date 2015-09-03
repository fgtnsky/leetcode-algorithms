
/**************************************************************************************************

Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
**************************************************************************************************/

public class Palindrome_Number {
	public static boolean isPalindrome(int x) {
		if(x < 0) return false;
		else if(x < 10) return true;
		else {
			int digit = 0;
			// get the digit number of x:
			while(x/Math.pow(10, digit)>=1) digit++;
			// compare every two numbers:
			for(int idx = 1; idx <= digit/2; idx++){
				// get the value for the first kth number and the last kth number:
				int first = (int) (x/Math.pow(10,digit-idx)%10);
				int last = (int) (x/Math.pow(10,idx-1))%10;
				if( first != last) return false;
			}
			return true;
		}
		
	}
	
	public static void main(String[] args){
		System.out.println(isPalindrome(12321));  //true
		System.out.println(isPalindrome(-1));  // false
		System.out.println(isPalindrome(3));  // true
		System.out.println(isPalindrome(10001));  //true



	}

}
