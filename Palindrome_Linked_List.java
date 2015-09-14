
/**************************************************************************************************
Given a singly linked list, determine if it is a palindrome.
*************************************************************************************************/

public class Palindrome_Linked_List { //O(n)
    public static  boolean isPalindrome(ListNode head) {
    	if(head==null || head.next==null) return true;
    	ListNode p3 = new ListNode(0);
    	p3.next = head;
    	// p2 is used to record the start node of the second half
    	// p3 is used to record the end node of the first half
    	// p1 runs as twice speed as p2,when p1 points the end, p2 points the half node
        ListNode p1 = head, p2 = head;
        while(p1!=null && p1.next != null){
        	p1 = p1.next.next;
        	p2 = p2.next;
        	p3 = p3.next;
        }
        
        // even number of nodes,p2 the first node of the second half, p1 is the end of the
        // first half.
         if(p1==null){
         	p3.next = null;
         }
      //odd number of nodes,p2 is the middle node, p3 is the end node of the first half
      // so p2=p2.next, it becomes the start node of the second half
         else if(p1.next==null){  
        	p3.next = null;
        	p2 = p2.next;
        }
 
        // reverse the first half
        head = reverseList(head);
        // compare them:
        while(head!=null){
        	if(head.val != p2.val)
        		return false;
        	head = head.next;
        	p2 = p2.next;
        }
        return true;
        
    }
    
    public static ListNode reverseList(ListNode head) { //reverse LinkedList, O(n)
        if(head==null|| head.next ==null) return head;
        ListNode temp = head.next;
        ListNode rev = reverseList(head.next);
        temp.next = head;
        head.next =null;
        return rev;
    }
    
	    
	public static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int x) {val = x;}
	}
    
	
    public static void main(String[] args){
    	ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(1);
	//	l1.next.next.next.next = new ListNode(2);

		// l1: 2->3->3->3->2
    	System.out.println(isPalindrome(l1)); // output: true
    }
	
}
