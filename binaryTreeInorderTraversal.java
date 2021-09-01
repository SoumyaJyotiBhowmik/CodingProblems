package programs;

import java.util.ArrayList;
import java.util.List;

public class binaryTreeInorderTraversal {

	
	public static void main(String[] args) {
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(5);
		TreeNode root = new TreeNode(3,left,right);
		List<Integer> result = inorderTraversal(root);
		result.forEach(System.out::println);
	
	}
	
	 public static List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> result = new ArrayList<Integer>();
	        if(root == null){
	            return result;
	        }
	        if(root.left == null && root.right == null){
	            result.add(root.val);
	            return result;
	        }
	       
	        if(root.left != null){
	            result.addAll(inorderTraversal(root.left));
	        }
	         result.add(root.val);
	        if(root.right != null){
	        result.addAll(inorderTraversal(root.right));
	        }
	        return result;
	    }

}

 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	         this.right = right;
	     }
	  }
