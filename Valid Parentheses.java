


/**************************************************************************************************

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
**************************************************************************************************/


// easy to solve it using stack


import java.util.Stack;
public class Valid_Parentheses {
    public static boolean isValid(String s) {
    	Stack <Character> st = new Stack <Character>();
        for(int i=0;i<s.length();i++){
        	if(st.isEmpty()) st.push(s.charAt(i));
        // pop out for Parentheses pairs: {},(),[]
        	else if((st.peek()=='{' && s.charAt(i)=='}')||(st.peek()=='[' && s.charAt(i)==']')||(st.peek()=='(' && s.charAt(i)==')'))
        		st.pop();
        	else
        		st.push(s.charAt(i));
        }
        return st.empty();
    }
    
    public static void main(String[] args){
    	System.out.println(isValid("{{{}}}")); //true
    	System.out.println(isValid("[]{()}")); //true
    	System.out.println(isValid("[]{(})")); //false

    }

}
