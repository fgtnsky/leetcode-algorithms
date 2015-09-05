
/**************************************************************************************************

Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
**************************************************************************************************/

public class Remove_Nth_Node_From_End_of_List {

	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		// list: 2->4->3
		ListNode res = removeNthFromEnd(l1,3);
		while(res.next != null){
			System.out.print(res.val + " -> ");
			res = res.next;
		}
		System.out.println(res.val);
		// output: 4 -> 3
		
	}
	
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	// create sentinel node dummy, the next of it is head
    	ListNode dummy = new ListNode(0);
    	ListNode pre = dummy, last = dummy;
    	dummy.next = head;
    	// the nodes between pre and next is n
    	for(int i=1; i<=n+1 ; i++) 
    		last = last.next;
    	// move ahead together
    	while(last != null){
    		pre = pre.next;
    		last = last.next;
    	}
    	// delete the nth node
    	pre.next = pre.next.next;
    	return dummy.next;
    	
    }
    
	public static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int x) {val = x;}
	}


}


