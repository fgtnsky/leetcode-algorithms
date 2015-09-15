
/**************************************************************************************************
Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
*************************************************************************************************/

import java.util.*;
public class Implement_Queue_using_Stacks {
Stack<Integer> stack = new Stack<Integer>();
	
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!stack.isEmpty())
        	temp.push(stack.pop());
        temp.push(x);
        while(!temp.isEmpty())
            stack.push(temp.pop());

    }

    // Removes the element from in front of queue.
    public int pop() {
    	return stack.pop();
    }

    // Get the front element.
    public int peek() {
        return stack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
