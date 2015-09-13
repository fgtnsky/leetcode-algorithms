
/**************************************************************************************************
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
**************************************************************************************************/

public class Remove_Linked_List_Elements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
    	ListNode hd = temp;
    	temp.next = head;
    	while(head!=null){
    		if(head.val==val) {
    		    head = head.next;
    		    hd.next = hd.next.next;
    		}
    		else {
    		    head = head.next;
    		    hd = hd.next;
    		}
    	}
    	
    	return temp.next;
    }
    
	public static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int x) {val = x;}
	}
	
	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(4);
		l1.next.next.next = new ListNode(3);
		// l1: 2->3->4->3
		ListNode res = removeElements(l1,3);
		while(res!=null){
			System.out.println(res.val); // output: 2,4
			res = res.next;
		}
	}

}
