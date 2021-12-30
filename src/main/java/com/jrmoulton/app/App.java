package com.jrmoulton.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args) {
		TreeNode root = new TreeNode(2);
        System.out.println(countNodes(root));
    }

    public static int countNodes(TreeNode root) {
		int temp_val = 0;
		if (root.left != null) {
			 temp_val += countNodes(root.left);
		} 
		if (root.right != null) {
			 temp_val += countNodes(root.right);
		}
		return temp_val + root.val;
    }
}
