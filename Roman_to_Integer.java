
/**************************************************************************************************
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
*************************************************************************************************/

public class Roman_to_Integer {
    public static int romanToInt(String s) {
    	char[] S = s.toCharArray();
        int res = 0;
        for(int i=0;i<s.length();i++){
        	if(i==s.length()-1 || r2i(S[i])>=r2i(S[i+1]))
        		res += r2i(S[i]);
        	else
        		res -= r2i(S[i]);
        }
        return res;
    }
    
    public static int r2i(char c){
    	      switch(c) {  
    	        case 'I': return 1;  
    	        case 'V': return 5;  
    	        case 'X': return 10;  
    	        case 'L': return 50;  
    	        case 'C': return 100;  
    	        case 'D': return 500;  
    	        case 'M': return 1000;  
    	        default: return 0;  
    	      } 
    }
    
    public static void main(String[] args){
    	System.out.println(romanToInt("MCMXCVI") ); // output: 1996

    }
}
