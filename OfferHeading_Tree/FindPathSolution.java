package OfferHeading_Tree;

public class FindPathSolution {
	/*
	二叉树中和为某一值的路径

	题目描述
	输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
	路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(
	注意: 在返回值的list中，数组长度大的数组靠前)
	 */

	public static boolean FindPath(TreeNode root){
		
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
