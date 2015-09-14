import java.util.*;

/**************************************************************************************************
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
*************************************************************************************************/

public class Invert_Binary_Tree {
	
    public static TreeNode invertTree(TreeNode root) {
    	if(root==null) return null;
    	TreeNode left = root.left;
    	TreeNode right = root.right;
    	root.left = invertTree(right);
    	root.right = invertTree(left);
    	return root;
    }
       
	 public static class TreeNode {
	      int val=0;
	      TreeNode left=null;
	      TreeNode right=null;
	      TreeNode(int x) { val = x; }

	 }
	 
	 public static void printTree(TreeNode root){
		 if(root==null) return;
	     Queue<TreeNode> L = new LinkedList();
	     L.add(root);
	     while(!L.isEmpty()){
		     int len = L.size();
	    	 for(int i=0;i<len;i++){
	    		 TreeNode temp = L.poll();
	    		 System.out.print(temp.val+" ");
	    		 if(temp.left!=null)
	    			 L.add(temp.left);
	    		 if(temp.right!=null)
	    			 L.add(temp.right);
	    	 }
	    	 System.out.println();	     
	     }

	 }
	 public static void main(String[] args){
	        /* Create following Binary Tree
	         1
	      /     \
	     2       5
	    /  \    / \
	   6    3  2   6
	   */
	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(5);
	        root.left.left  = new TreeNode(6);
	        root.left.right  = new TreeNode(3);
	        root.right.left  = new TreeNode(2);
	        root.right.right  = new TreeNode(6);
	        invertTree(root);
	       printTree(root);  
	       /*
	          1 
	          5 2 
			  6 2 3 6 
	        */
	    }


}
