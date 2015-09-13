

/**************************************************************************************************
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
**************************************************************************************************/

public class Excel_Sheet_Column_Number {  // base-26 numeral system
	public static int titleToNumber(String s) {
		if(s=="") return 0;
		int res = 0;
		char[] S = s.toCharArray();
		for(int i=0;i<S.length;i++){
			res = res*26 + (int)(S[i] - 'A'+1);
			
		}
	    return res;
    }
    
	public static void main(String[] args){
		System.out.println(titleToNumber("AA"));
	}
}
