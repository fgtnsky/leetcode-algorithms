import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**************************************************************************************************
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
**************************************************************************************************/


public class Binary_Tree_Level_Order_Traversal {
	
	public static class TreeNode {
	      int val=0;
	      TreeNode left=null;
	      TreeNode right=null;
	      TreeNode(int x) { val = x; }

	}
    public static List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> L = new ArrayList<List<Integer>>();
    	if(root==null) return L;
    	Queue queue = new LinkedList();
    	queue.add(root);
    	while(!queue.isEmpty()){
    		int s = queue.size();
    		ArrayList<Integer> temp = new ArrayList<Integer>();
    		for(int i=0;i<s;i++){
        		TreeNode node = (TreeNode) queue.remove();
        		temp.add(node.val);
        		if(node.left!=null) queue.add(node.left);
        		if(node.right!=null) queue.add(node.right);
    		}
    		L.add(temp);
    	}
    	return L;
    }
    
    public static void main(String[] args){
        /* Create following Binary Tree
         1
      /     \
     2       2
    /  \    / \
   6    4  4   6
   */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left  = new TreeNode(6);
        root.left.right  = new TreeNode(4);
        root.right.left  = new TreeNode(4);
        root.right.right  = new TreeNode(6);
        
        System.out.println(levelOrder(root));  // output: [[1], [2, 2], [6, 4, 4, 6]]
    }
    
}
