package OfferHeading_Tree;

public class offerheading_27 {
	/*
	 * 二叉树的镜像
	 * 
	 * 题目　
　　		请完成一个函数，输入一个二叉树，该函数输出它的镜像。
	        思路
		画图可以很清晰地得到思路：先前序遍历，对每个结点交换左右子结点。
	 */
	public static void Mirror(TreeNode root){
		if(root == null){
			return;
		}
		TreeNode tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		Mirror(root.left);
		Mirror(root.right);
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
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
//		node3.left = node6;
//		node3.right = node7;
//		node6.right = node8;
		
		System.out.println("Before Mirror -- The levelorder:");
		System.out.println(PrintTree.levelOrder(node1));
		Mirror(node1);
		System.out.println("After Mirror -- The levelorder:");
		System.out.println(PrintTree.levelOrder(node1));
	}
}
