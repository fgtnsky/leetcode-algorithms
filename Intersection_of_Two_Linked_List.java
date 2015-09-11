

/**************************************************************************************************
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
*************************************************************************************************/

public class Intersection_of_Two_Linked_List {
	
	public static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int x) {val = x;}
	}
	
	public static int lengthofNode(ListNode node){ //O(n)
		if(node==null) return 0;
		int len = 0;
		ListNode st = node;
		while(st!=null){
			len++;
			st = st.next;
		}
		return len;
	}
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {  //O(m+n)
    	if(headA==null || headB==null) return null;
    	ListNode p1 = headA, p2 = headB;
    	int lenA = lengthofNode(headA), lenB = lengthofNode(headB);
    	if(lenA >= lenB) //move to the same length node from the back.
    		for(int i=0;i<lenA-lenB;i++)
    			p1 = p1.next;
    	else
    		for(int i=0;i<lenB-lenA;i++)
    			p2 = p2.next;
    	ListNode res = null;
    	while(p1!=null && p2!=null){
    		if(p1!=p2) res = null;
    		else
    			if(res==null) res=p1;
    		p1 = p1.next; p2=p2.next;
    	}
    	return res;
        
    }
    
    public static void main(String[] args){
    	ListNode n1 = new ListNode(1);
    	ListNode n2 = new ListNode(3);
    	ListNode n3 = new ListNode(4);
    	ListNode n4 = new ListNode(6);
    	//t1: 1 ->  3 \>
    	//t2:			4 ->6
    	ListNode t1 = n1;
    	t1.next =  n2;
    	t1.next.next =  n3;
    	t1.next.next.next = n4;
    	
    	ListNode t2 = n3;
    	t2.next = n4;
    	System.out.println(getIntersectionNode(t1,t2).val); // output:[1, 4, 6, 4, 1]
    }
}
