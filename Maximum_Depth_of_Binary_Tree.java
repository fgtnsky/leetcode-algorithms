
public class Maximum_Depth_of_Binary_Tree {

	/**************************************************************************************************
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
	**************************************************************************************************/

		
		public static class TreeNode {
		      int val=0;
		      TreeNode left=null;
		      TreeNode right=null;
		      TreeNode(int x) { val = x; }

		}
		  public static int maxDepth(TreeNode root) {
		        if(root==null) return 0;
		        else
		        	return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
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
	        
	        System.out.println(maxDepth(root));  // output: 3
	    }
	    

}
