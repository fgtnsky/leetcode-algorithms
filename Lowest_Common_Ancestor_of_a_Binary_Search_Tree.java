
/**************************************************************************************************
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
*************************************************************************************************/
// the algorithm still works even the tree is just binary tree;
public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {  
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) { //O(n*log(n))
    	if(isAncestor(p,q)) return p;
    	else if(isAncestor(q,p)) return q;
    	else if(isAncestor(root.left,p) != isAncestor(root.left,q))
        	return root;
        else if(isAncestor(root.left,p))
        	return lowestCommonAncestor(root.left,p,q);
        else
        	return lowestCommonAncestor(root.right,p,q);

    }
    
    public static boolean isAncestor(TreeNode root, TreeNode p){ //O(n)
    	if(root==null) return false;
    	if(root==p) return true;
    	return isAncestor(root.left,p) || isAncestor(root.right,p);
    	
    }
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
    	TreeNode t1 = new TreeNode(1);
    	TreeNode t2 = new TreeNode(2);
    	TreeNode t3 = new TreeNode(2);
    	TreeNode t4 = new TreeNode(6);
    	TreeNode t7 = new TreeNode(6);
    	TreeNode t5 = new TreeNode(4);
    	TreeNode t6 = new TreeNode(4);

        TreeNode root = t1;
        root.left = t2;
        root.right = t3;
        root.left.left  = t4;
        root.left.right  = t5;
        root.right.left  = t6;
        root.right.right  = t7;
        
        System.out.println(lowestCommonAncestor(root,t3,t7).val);  // output: 2
    }
}
