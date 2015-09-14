import java.util.*;

/**************************************************************************************************
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
**************************************************************************************************/

public class Isomorphic_Strings {
	
    public static boolean isIsomorphic(String s, String t) {
        char[] S  = s.toCharArray();
        char[] T = t.toCharArray();
        if(S.length!=T.length) return false;
        HashMap<Character,Character> hs = new HashMap<Character,Character>();
        HashMap<Character,Character> hs1 = new HashMap<Character,Character>();

        for(int i=0;i<S.length;i++){
        	if(hs.containsKey(S[i])){
        		if(T[i]!=hs.get(S[i]))
        			return false;}
        	else
        		hs.put(S[i], T[i]);
        }
        
        for(int i=0;i<S.length;i++){
        	if(hs1.containsKey(T[i])){
        		if(S[i]!=hs1.get(T[i]))
        			return false;}
        	else
        		hs1.put(T[i], S[i]);
        }
        return true;
        
    }
	
    
    public static void main(String[] args){
    	System.out.println(isIsomorphic("egg","add")); //output:true
    	System.out.println(isIsomorphic("foo","bar")); //output: false

    	System.out.println(isIsomorphic("paper","title")); //output: true

    }

}
