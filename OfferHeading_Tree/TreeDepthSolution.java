package OfferHeading_Tree;

import OfferHeading.BinaryTreeNode;

public class TreeDepthSolution {
	/**
	 * 求解二叉树的深度
	 */
	public static int treeDepth(BinaryTreeNode root){
		if(root == null){
			return 0;
		}
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		return (left>right)? left+1:right+1;
	}
	public static void main(String[] args) {
		BinaryTreeNode node1 = new BinaryTreeNode();
		BinaryTreeNode node2 = new BinaryTreeNode();
		BinaryTreeNode node3 = new BinaryTreeNode();
		BinaryTreeNode node4 = new BinaryTreeNode();
		BinaryTreeNode node5 = new BinaryTreeNode();
		BinaryTreeNode node6 = new BinaryTreeNode();
		BinaryTreeNode node7 = new BinaryTreeNode();
		BinaryTreeNode node8 = new BinaryTreeNode();
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;
		
		System.out.println("二叉树的深度是："+treeDepth(node1));
	}

}
