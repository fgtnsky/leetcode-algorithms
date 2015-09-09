

/**************************************************************************************************
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
**************************************************************************************************/


public class Same_Tree {
	
	 public static class TreeNode {
		      int val=0;
		      TreeNode left=null;
		      TreeNode right=null;
		      TreeNode(int x) { val = x; }

	 }
	 
	    public static boolean isSameTree(TreeNode p, TreeNode q) { // use depth first search
	    	if(p==null && q!= null) return false;
	    	else if(p!=null && q==null) return false;
	    	else if(p==null && q==null) return true;
	    	else if(p.val!=q.val) return false;
	        else if(! isSameTree(p.left,q.left)) return false;
	        else if(! isSameTree(p.right,q.right)) return false; 
	        else
	        	return true;
	    }
	    

	    
	    public static void main(String[] args){
	        /* Create following Binary Tree
            1
          /  \
         2    3
          \
           4
            \
             5
              \
               6*/
	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.right = new TreeNode(4);
	        root.left.right.right = new TreeNode(5);
	        root.left.right.right.right = new TreeNode(6);
	        /* Create following Binary Tree
            1
          /  \
         2    3
          \
           4
            \
             5
              \
               9*/
	        
	        TreeNode root2 = new TreeNode(1);
	        root2.left = new TreeNode(2);
	        root2.right = new TreeNode(3);
	        root2.left.right = new TreeNode(4);
	        root2.left.right.right = new TreeNode(5);
	        root2.left.right.right.right = new TreeNode(9);
	        
	        System.out.println(isSameTree(root,root2));  // output: false
	    }

}





