
/**************************************************************************************************
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
*************************************************************************************************/

public class Minimum_Depth_of_Binary_Tree {

	public static class TreeNode {
	      int val=0;
	      TreeNode left=null;
	      TreeNode right=null;
	      TreeNode(int x) { val = x; }

	}

    public static int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        if(root.left==null || root.right==null)
        	return root.left==null? 1+minDepth(root.right):1+minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
	
    public static void main(String[] args){
        /* Create following Binary Tree
         1
      /     \
     2       2
    /       / \
   6       4   6
   */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left  = new TreeNode(6);
  
        root.right.left  = new TreeNode(4);
        root.right.right  = new TreeNode(6);
        
        System.out.println(minDepth(root));  // output: 2
    }
}
