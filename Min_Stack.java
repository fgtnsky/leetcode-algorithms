import java.util.ArrayList;
import java.util.LinkedList;

/**************************************************************************************************

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
*************************************************************************************************/


public class Min_Stack {
	ArrayList<Integer> stack = new ArrayList<Integer>();
    public void push(int x) {
        stack.add(x);
    }

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<stack.size();i++)
        	if(stack.get(i)<min)
        		min = stack.get(i);
        return min;
    }
}
