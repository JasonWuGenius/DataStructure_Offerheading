package OfferHeading_Tree;

/*
	二叉搜索树与双向链表

	题目描述
	输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
	要求不能创建任何新的结点，只能调整树中结点指针的指向。
	*/

public class ConvertSolution {
	static TreeNode head;
	static TreeNode realHead;

	public static TreeNode Convert(TreeNode root){
		ConvertSub(root);
		return realHead;
	}
	
	public static void ConvertSub(TreeNode root){
		if(root == null){
			return;
		}
		Convert(root.left);
		if(head == null){
			head = root;
			realHead = root;
		}
		else{
			head.right = root;
			root.left = head;
			head = root;
		}
		Convert(root.right);
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

		TreeNode node = Convert(node1);
		System.out.println("The Tree converted to List is : ");
		while(node != null){
			System.out.print(node.val+" ");
			node = node.right;
		}
	}
}
