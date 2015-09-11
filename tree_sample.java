
/**************************************************************************************************



*************************************************************************************************/



public class tree_sample {
	
	public static class TreeNode {
	      int val=0;
	      TreeNode left=null;
	      TreeNode right=null;
	      TreeNode(int x) { val = x; }

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
