import java.util.*;


/**************************************************************************************************
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
**************************************************************************************************/
public class Binary_Tree_Paths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
    	if(root==null) return res;
    	if(root.left==null && root.right==null) {
    		res.add(Integer.toString(root.val));
    		return res;
    	}
    	List<String> leftRes = binaryTreePaths(root.left);
    	List<String> rightRes = binaryTreePaths(root.right);
    	for(int i=0;i<leftRes.size();i++)
    		res.add(Integer.toString(root.val)+"->"+leftRes.get(i));
    	for(int i=0;i<rightRes.size();i++)
    		res.add(Integer.toString(root.val)+"->"+rightRes.get(i));
    	return res;
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
    /  \    / 
   6    4  4   
   */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left  = new TreeNode(6);
        root.left.right  = new TreeNode(4);
        root.right.left  = new TreeNode(4);
        
        System.out.println(binaryTreePaths(root));  
        // output: [1->2->6, 1->2->4, 1->2->4]
    }
}
