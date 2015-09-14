/**************************************************************************************************
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.
*************************************************************************************************/

import java.util.*;
public class Valid_Anagram { //O(n)
	
    public static boolean isAnagram(String s, String t) {
    	if(s.length()!=t.length()) return false;
    	if(s.length()==0) return true;
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        for(int i=0;i<S.length;i++)
        {
        	if(hs.containsKey(S[i]))
        		hs.replace(S[i], hs.get(S[i])+1);
        	else
        		hs.put(S[i], 1);
        }
        for(int i=0;i<T.length;i++){
        	if(hs.containsKey(T[i]) && hs.get(T[i])!=0)
        		hs.replace(T[i], hs.get(T[i])-1);
        	else
        		return false;
        }
        return true;
    }

    public static void main(String[] args){
    	System.out.println(isAnagram("anagram","nagaram") ); // output: true
    	System.out.println(isAnagram("anagram","nagaran") ); // output: false

    }
}
