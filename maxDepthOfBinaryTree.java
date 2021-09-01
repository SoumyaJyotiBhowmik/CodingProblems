package programs;

public class maxDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int maxDepth(TreeNode1 root) {
	       if(root == null){
	           return 0;
	       }
	        if(root.left == null && root.right== null){
	            return 1;
	        }
	        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
	       
	        
	    }

}

 class TreeNode1 {
     int val;
    TreeNode1 left;
     TreeNode1 right;
     TreeNode1() {}
     TreeNode1(int val) { this.val = val; }
     TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
