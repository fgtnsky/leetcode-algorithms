/**************************************************************************************************
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
**************************************************************************************************/

public class Count_and_Say {
    public static String countAndSay(int n) {
    	if(n<=0) return "";
    	// initialize previous string
        StringBuilder pre = new StringBuilder("1");
        for(int i=1;i<n;i++){
            StringBuilder next = new StringBuilder();
        	int rep = 1;
        	for(int j=1;j<pre.length();j++){
        		// calculate repeat times;
        		if(pre.charAt(j)==pre.charAt(j-1))
        			rep++;
        		else{
        			next.append(Integer.toString(rep));
        			next.append(pre.charAt(j-1));
        			rep = 1;
        		}
        	}
    		next.append(Integer.toString(rep));
    		next.append(pre.charAt(pre.length()-1));
    		pre = next;
        }
        return pre.toString();
    }
    
    public static void main(String[] args){
    	System.out.println(countAndSay(10)); //output: 13211311123113112211
    }
}




