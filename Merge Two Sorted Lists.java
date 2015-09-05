
/**************************************************************************************************
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
**************************************************************************************************/

public class Merge_Two_Sorted_List {       //O(n1+n2), here n_i is the length of the i^th list.
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 ListNode res = new ListNode(0);
		 ListNode head = res;
		 while(l1!=null && l2!=null){
			 if(l1.val<= l2.val) {
				 head.next = l1;
				 l1 = l1.next;
				 head = head.next;
			 }
			 else if(l1.val > l2.val){
				 head.next = l2;
				 l2 = l2.next;
				 head = head.next;
			 }
		 }
		 if(l1 == null)
			 head.next = l2;
		 else if(l2 == null)
			 head.next = l1;
		 return res.next;
			 
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
			// l1: 2->3->4
			
			ListNode l2 = new ListNode(2);
			l2.next = new ListNode(9);
			l2.next.next = new ListNode(10);
			// l2: 2->9->10
			
			ListNode res = mergeTwoLists(l1,l2);
			while(res.next != null){
				System.out.print(res.val + " -> ");
				res = res.next;
			}
			System.out.println(res.val);
			// output: 2 -> 2 -> 3 -> 4 -> 9 -> 10
			
		}
}
