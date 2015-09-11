
/**************************************************************************************************

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
*************************************************************************************************/


public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        if(s=="") return true;
        char[] S = s.toCharArray();
        int front=0,back=s.length()-1;
        while(back-front>0){
        	// can also use Character.isLetterOrDigit
        	if(!Character.toString(S[back]).matches("[0-9]*[a-z]*[A-Z]*"))
        		back--;
        	else if(!Character.toString(S[front]).matches("[0-9]*[a-z]*[A-Z]*"))
        		front++;
        	
        	else if(Character.toLowerCase(S[back])!=Character.toLowerCase(S[front])) 
        		return false;
        	
        	else{
        		back--;front++;
        	}
          	
        }
        return true;
    }
	
    public static void main(String[] args){
    	System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // output:[1, 4, 6, 4, 1]
    }

}
