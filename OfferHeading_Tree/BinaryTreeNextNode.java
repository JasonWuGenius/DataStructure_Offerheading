package OfferHeading_Tree;

public class binaryTreeNextNode {
	/*
		二叉树的下一个结点

		题目描述
		给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
		注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
	 */
	public static class TreeLinkNode {
		int val;
		TreeLinkNode left = null;
		TreeLinkNode right = null;
		TreeLinkNode next = null;
	
		TreeLinkNode(int val) {
			this.val = val;
	}

	public static TreeLinkNode getNext(TreeLinkNode node){
		if(node == null){
			return null;
		}
		if(node.right != null){
			node = node.right;
			while(node.left != null){
				node = node.left;
			}
			return node;
		}
		while(node.next != null){
			if(node.next.left == node){
				return node.next;
			}
			node = node.next;
		}
		return null;
	}
	public static void main(String[] args) {
		TreeLinkNode node1 = new TreeLinkNode(1);
		TreeLinkNode node2 = new TreeLinkNode(2);
		TreeLinkNode node3 = new TreeLinkNode(3);
		TreeLinkNode node4 = new TreeLinkNode(4);
		TreeLinkNode node5 = new TreeLinkNode(5);
		TreeLinkNode node6 = new TreeLinkNode(6);
		TreeLinkNode node7 = new TreeLinkNode(7);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node2.next = node1;
		node3.next = node1;
		node4.next = node2;
		node5.next = node2;
		node6.next = node3;
		node7.next = node4;

		TreeLinkNode res = getNext(node1);
		if(res != null){
			System.out.println(res.val);
		}
		
	}
}
