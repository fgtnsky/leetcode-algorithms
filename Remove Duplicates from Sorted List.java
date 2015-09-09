


/**************************************************************************************************
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
**************************************************************************************************/

import java.util.HashSet;

public class Remove_Duplicates_from_Sorted_List { // the algorithm below can deal with unsorted linked list
    public static ListNode deleteDuplicates(ListNode head) {
    	if(head == null) return null;
        ListNode nd = head;
        HashSet hs = new HashSet();
        hs.add(nd.val);
        while(nd.next!=null){
        	if(! hs.add(nd.next.val)){
        		nd.next = nd.next.next;
        	}
        	else
        		nd = nd.next;
        }
        return head;
        
    }
	public static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int x) {val = x;}
	}
	
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(1);
		l1.next.next.next = new ListNode(5);

		// l1: 1->1->1->5
			
		ListNode res = deleteDuplicates(l1);
		while(res.next != null){
			System.out.print(res.val + " -> ");
			res = res.next;
		}
		System.out.println(res.val);
		// output: 1 -> 5
		
	}
}




