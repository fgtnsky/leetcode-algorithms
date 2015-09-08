/**************************************************************************************************
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
**************************************************************************************************/

public class Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
    	if(s.length()==0) return 0;
        char[] S = s.toCharArray();
     // use i to denote the index of last non-space char
     // and j to denote the index of first space after chars
        int i,j; 
        for(i = S.length-1;i>=0;i--){
        	if(S[i]!=' ') break; 
        }
        for(j=i;j>=0;j--)
       		if(S[j]==' ')
       			break;

        return i-j;
        
    }
    public static void main(String[] args){
    	System.out.println(lengthOfLastWord("hello world ")); //output: 5
    }
}



