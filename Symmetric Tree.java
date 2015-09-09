
/**************************************************************************************************
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
**************************************************************************************************/


public class Symmetric_Tree {
	
	public static class TreeNode {
	      int val=0;
	      TreeNode left=null;
	      TreeNode right=null;
	      TreeNode(int x) { val = x; }

	}
	
	//compare whether left tree and right are symmetric tree by comparing whether
	// (left.left,right.right) and (left.right,right.left) are symmetric tree
	
	public static boolean Symmetric(TreeNode root1, TreeNode root2){ 
		if(root1==null && root2==null) return true;
		if((root1==null && root2!=null)||(root2==null && root1!=null)) return false;
		else if(root1.val == root2.val && Symmetric(root1.left,root2.right)&&Symmetric(root1.right,root2.left))
			return true;
		return false;
	}
	
    public static boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return Symmetric(root.left, root.right);
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
        
        System.out.println(isSymmetric(root));  // output: true
    }
    

}






