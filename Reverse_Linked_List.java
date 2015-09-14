
/**************************************************************************************************

Reverse a singly linked list.
**************************************************************************************************/

public class Reverse_Linked_List {
    public static ListNode reverseList(ListNode head) {
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
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(4);
		l1.next.next.next = new ListNode(3);
		// l1: 2->3->4->3
		ListNode res = reverseList(l1);
		while(res!=null){
			System.out.println(res.val); // output: 3,4,3,2
			res = res.next;
		}
	}
}
