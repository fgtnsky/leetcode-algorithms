
/**************************************************************************************************
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
*************************************************************************************************/

public class Path_Sum {

	public static class TreeNode {
	      int val=0;
	      TreeNode left=null;
	      TreeNode right=null;
	      TreeNode(int x) { val = x; }

	}
	
	public static boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        if(root.left==null && root.right==null) return sum==root.val;
        if(root.left==null && root.right!=null) return hasPathSum(root.right,sum-root.val);
        if(root.left!=null && root.right==null) return hasPathSum(root.left,sum-root.val);
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
        		
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
        
        System.out.println(hasPathSum(root,7));  // output: true
    }
}
