
// https://leetcode.com/problems/swap-nodes-in-pairs/
public class Swap_Nodes_in_Pairs {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		else {
			ListNode temp = new ListNode(0);
			temp = head.next;
			head.next = swapPairs(temp.next);
			temp.next = head;
			return temp;
		}
	}
}
