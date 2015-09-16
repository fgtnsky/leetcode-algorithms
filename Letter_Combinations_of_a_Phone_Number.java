//  https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.*;
public class Letter_Combinations_of_a_Phone_Number {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        for(int i=0;i<digits.length();i++)
        	res = combine(ntoc(digits.charAt(i)),res);
        return res;        
    }
    
    public static List<String> combine(String s1, List<String> res2){
    	List<String> res = new LinkedList<String>();
    	if(res2.size()==0) 
    		for(int i=0;i<s1.length();i++)
    			res.add(Character.toString(s1.charAt(i)));
    	else
	    	for(int i=0;i<s1.length();i++)
	    		for(int j=0;j<res2.size();j++)
	    			res.add(res2.get(j)+s1.charAt(i));
    	return res;   			
    }
    
    
    public static String ntoc(char digit){
    	switch(digit){
    	case '1': return "";
    	case '2': return "abc";
    	case '3': return "def";
    	case '4': return "ghi";
    	case '5': return "jkl";
    	case '6': return "mno";
    	case '7': return "pqrs";
    	case '8': return "tuv";
    	case '9': return "wxyz";
    	case '0': return " ";
    	}
    	return "";
    }
    
    public static void main(String[] args){
    	String test = "2";
    	System.out.println(letterCombinations(test));
    }
}
