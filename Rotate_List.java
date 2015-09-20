//   https://leetcode.com/problems/rotate-list/

import java.util.*;

public class Rotate_List {
	
	public static class ListNode {
		    int val;
		     ListNode next;
		     ListNode(int x) { val = x; }
	}
	 
    public static ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null) return head;
      ListNode end = head;
      int idx = 1;
      while(end.next != null){
      	end = end.next;
      	idx ++;
      }
      if(k>=idx)
    	  k = k%idx;
      idx -= k;
      if(k == 0) return head;
      end.next = head;  
      while(--idx>0)
      	head = head.next;
      ListNode res = head.next;
      head.next = null;
      return res;         
    }
    
    public static void main(String[] args){
    	ListNode n1 = new ListNode(1);
    	ListNode n2 = new ListNode(2);
    	ListNode n3 = new ListNode(3);
    	ListNode head = n1; // List: 1 -> 2 -> 3
    	head.next = n2;
    	head.next.next = n3;
    	head = rotateRight(head,20);
    	while(head != null){  // output 2 3 1
    		System.out.println(head.val);
    		head = head.next;
    	}

    }
}
