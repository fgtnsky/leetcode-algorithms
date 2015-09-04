/**************************************************************************************************

Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
**************************************************************************************************/


public class LongestPalindromicSubstring {   //O(n)
    public static String longestPalindrome(String s) {   	
        int lp = 1;  // lp is the longest Palindromic substring length     
        int left = 0;  // the most left index for the substring now
        int len = s.length(); 
    	int idx = 0;  // the most left index for the longest Palindromic Substring 
        if(len == 1) return s.substring(0);
        else if(len ==2) return (s.charAt(0)==s.charAt(1))? s.substring(0):s;
        for(int i=1; i< len; i++){
        	// first to find the even type like: abba, abccba, etc
        	int pre = left = i -1;  //pre is the left char to be compared
        	int next = i; // next is the right char to be compared
        	int temp = 0; // the temp length now is 0
        	while(pre>=0 && next<len && s.charAt(pre) == s.charAt(next)){
        		temp += 2; left = pre; pre--; next++;
        	}
        	if(temp > lp) {
        		lp = temp; idx = left;
        	}
        	
        	// repeat the work above to find the odd type like: aba, abcba
        	pre = i - 1; next = i + 1;
        	temp = 1;
        	while(pre>=0 && next<len && s.charAt(pre) == s.charAt(next)){
        		temp += 2; left = pre; pre--; next++;
        	}
        	if(temp > lp) {
        		lp = temp; idx = left;
        	}
        	
        }
        return s.substring(idx, idx+lp);
    }
    
    public static void main(String[] args){
    	System.out.println(longestPalindrome("abcbaaa"));
    	System.out.println(longestPalindrome("abcabccbac"));
    	System.out.println(longestPalindrome("acdcdcdabbca"));
  /**************************************************************************************************
   	 	output: 
    	abcba
    	cabccbac
    	cdcdc
 **************************************************************************************************/
	
    }
}
