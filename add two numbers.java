

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//2. Add Two Numbers: https://leetcode.com/problems/add-two-numbers/
//You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8

public class AddTwoNumbers {
	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode res = null;
		res = addTwoNumbers(l1,l2);
		while(res.next != null){
			System.out.print(res.val + " -> ");
			res = res.next;
		}
		System.out.println(res.val);
		// output: 7 -> 0 -> 8
		
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){   //O(max(n1,n2))
		ListNode start = new ListNode(0);
		ListNode pre = start;
		ListNode lastNode = null;
		while (l1 != null && l2 != null){
			int sum = l1.val + l2.val + pre.val;
			pre.val = sum%10 ;
			pre.next = new ListNode(sum/10);
			lastNode = pre;
			pre = pre.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		
		ListNode rest = null;
		
		if (l1 != null)
			rest = l1;
		if (l2 != null)
			rest = l2;
		while (rest != null){
			int sum = rest.val + pre.val;
			pre.val = sum%10 ;
			pre.next = new ListNode(sum/10);
			lastNode = pre;
			pre = pre.next;
			rest = rest.next;
		}
		
		if (lastNode.next != null && lastNode.next.val == 0) {
			lastNode.next = null;
		}
		return start;
	}

	public static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int x) {val = x;}
	}
}
