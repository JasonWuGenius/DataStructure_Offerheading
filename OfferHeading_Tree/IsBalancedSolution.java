package OfferHeading_Tree;

public class IsBalancedSolution {
	/*
		二叉树的下一个结点

		题目描述
		给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
		注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
	 */

	public static boolean IsBalanced(TreeNode root){
		if(root == null){
			return true;
		}
		if(Math.abs(checkDepth(root.left) - checkDepth(root.right)) <= 1){
			return IsBalanced(root.left) && IsBalanced(root.right);
		}
		return false;
	}
	public static int checkDepth(TreeNode node){
		if(node == null){
			return 0;
		}
		return Math.max(checkDepth(node.left), checkDepth(node.right))+1;
	}
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node7.left = node8;
		node8.left = node9;

		boolean res = IsBalanced(node1);
		System.out.println("The Tree is Balanced: "+IsBalanced(node1));
	}
}
