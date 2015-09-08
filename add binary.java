
/**************************************************************************************************
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
**************************************************************************************************/

//code below is easy to understand, but it may be better to use bitwise operator
public class Add_Binary {
    public static String addBinary(String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        boolean flog = false;
        int i = A.length-1, j = B.length-1;
        String sb="";
        while(i>=0 && j>=0){
        	if(flog==false){
        		if((A[i]=='1' && B[j]=='0')||(A[i]=='0' && B[j]=='1')) sb = "1" + sb;
        		else if((A[i]=='0' && B[j]=='0')) sb = "0" + sb;
        		else {sb = "0"+sb; flog=true;}
        	}
        	else{
        		if((A[i]=='1' && B[j]=='0')||(A[i]=='0' && B[j]=='1')) sb = "0" + sb;
        		else if((A[i]=='0' && B[j]=='0')) {sb = "1" + sb;flog=false;}
        		else sb = "1"+sb;
        	} 
        	i--;j--;
        }
        while(j>=0){
        	if(flog==false) sb = B[j] + sb;
        	else{
        		if(B[j]=='0'){sb = '1'+sb; flog=false;}
        		else sb = '0' +sb;
        	}
        	j--;
        }
        
        while(i>=0){
        	if(flog==false) sb = A[i] + sb;
        	else{
        		if(A[i]=='0'){sb = '1'+sb; flog=false;}
        		else sb = '0' +sb;
        	}
        	i--;
        }
        if(flog==true) sb = '1'+sb;
        return sb;
        	
    }
    
    // another method to do it: use bitwise operator
    public static String addBinary2(String a, String b) {
 
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        int flog = 0;
        int i=A.length-1, j=B.length-1;
        String s = "";
        while(i>=0 || j>=0 || flog==1){
        	int A_digit = (i>=0? Character.getNumericValue(A[i--]):0);
        	int B_digit = (j>=0? Character.getNumericValue(B[j--]):0);
        	int res = A_digit^B_digit^flog;
        	s = res + s;
        	flog = (A_digit+B_digit+flog>=2? 1:0);
        }
        return s;
        	
    }
    
    public static void main(String[] args){
    	System.out.println(addBinary("10","101111")); //output: 5
    	System.out.println(addBinary2("10","101111")); //output: 5
    }
}






