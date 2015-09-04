
/**************************************************************************************************
Write a function to find the longest common prefix string amongst an array of strings.
**************************************************************************************************/


public class Longest_Common_Prefix {    //O(n*digit_length)
	 public static String longestCommonPrefix(String[] strs) {
	        if(strs.length==0|strs==null) return "";
	    	if(strs.length==1) return strs[0];
	        for(int i=1; i<strs.length;i++){
	        	strs[0] = longestTwoCommon(strs[0],strs[i]);
	        }
	        return strs[0];
	    }
	    
	 public static String longestTwoCommon(String s1,String s2){
	        if(s1.length()==0 || s2.length()==0 || s1.charAt(0)!=s2.charAt(0)) return "";
	    	int idx = s1.length();
	    	while(s2.indexOf(s1.substring(0,idx))!=0)
	    		idx--;
	    	return s1.substring(0,idx);
	    		
	    }
    
    public static void main(String[] args){
    	System.out.println(longestCommonPrefix(new String[] {"abc","abd","abe"}));    //"ab" 	
    	System.out.println(longestCommonPrefix(new String[] {"ab","c"}));    	// ""

    }
}
