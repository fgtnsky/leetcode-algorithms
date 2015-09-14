import java.util.LinkedList;
import java.util.Queue;

/**************************************************************************************************
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
*************************************************************************************************/

public class Implement_Stack_using_Queues {

	Queue<Integer> queue = new LinkedList();

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        Queue temp = new LinkedList();
        int len = queue.size();
        while(--len>0){
        	temp.add(queue.poll());
        }
        queue = temp;
    }

    // Get the top element.
    public int top() {
    	if(queue.isEmpty()) return Integer.MIN_VALUE;
        Queue temp = new LinkedList();
        int len = queue.size();
        while(--len>0){
        	temp.add(queue.poll());
        }
        int res = queue.poll();
        temp.add(res);
        queue = temp;
        return res;
        
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
