
/**************************************************************************************************
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

*************************************************************************************************/

public class Balanced_Binary_Tree {

	public static class TreeNode {
	      int val=0;
	      TreeNode left=null;
	      TreeNode right=null;
	      TreeNode(int x) { val = x; }

	}
	
	public static int depth(TreeNode root){
		if(root==null) return 0;
		return 1+Math.max(depth(root.left), depth(root.right));
	}

	public static boolean isBalanced(TreeNode root){ //O(nlogn)
		if(root==null) return true;
		return Math.abs(depth(root.left)-depth(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
		
	}
    public static void main(String[] args){
        /* Create following Binary Tree
         1
      /     
     3       
    /  \    
   4    4  
   */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left  = new TreeNode(4);
        root.left.right  = new TreeNode(4);


       
        System.out.println(isBalanced(root));  // output: false
    }
}
