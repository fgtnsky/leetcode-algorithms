//  https://leetcode.com/problems/multiply-strings/
public class Multiply_Strings {
    public static String multiply(String num1, String num2) {
     	char[] n1 = num1.toCharArray(), n2 = num2.toCharArray();
    if(num1==""||num2=="") return "";
    int len1 = num1.length(), len2 = num2.length();
    int[] res = new int[len1+len2];
    for(int i=len1-1;i>=0;i--){
    	if(n1[i]=='0') continue;
    	int carry = 0;
    	for(int j = len2-1;j>=0;j--){
    		int temp = (n1[i] - '0')*(n2[j] - '0') + carry;
    		carry = (temp+res[i+j+1])/10;
    		res[i+j+1] = (temp+res[i+j+1])%10;
    	}
    	res[i] += carry;
    }
    String s="";
    int i = 0;
    for(i=0;i<res.length;i++){
        if(res[i]==0) continue;
        break;
    }
    for(int j=i; j<res.length;j++)
    	s = s + res[j];
    if(s=="") return "0";
    return s;
    }
    
    public static void main(String[] args){
    	System.out.println(multiply("2","3"));
    }
}
