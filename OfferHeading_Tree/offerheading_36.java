package OfferHeading_Tree;

import java.util.ArrayList;

import OfferHeading.BinaryTreeNode;

public class offerheading_36 {
	/*
	 * 二叉搜索树和双向链表
	 * 
	 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
	 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
	 * 
	 * 思路
		先中序遍历二叉搜索树，这样二叉搜索树就按照val值的大小从小到大排好序了，存放在数组中
		然后要转换为双向链表，由于数组中的存放的树的节点已经按照键值从小到大排好序了，
		那么就对于每个节点的左子树指向数组的上一个节点，右子树指向数组的下一个节点，
		这样就完成了变成双向链表。
	 */
	public static TreeNode convert(TreeNode root){
		if(root == null || (root.left == null && root.right == null))
			return root; 
		ArrayList<TreeNode> nodeList = new ArrayList<>();
		buildArrayList(root, nodeList);
		for(int i=0; i<nodeList.size(); i++){
			if(i == 0){
				nodeList.get(i).right = nodeList.get(i+1);
			}
			else if(i == nodeList.size()-1){
				nodeList.get(i).left = nodeList.get(i-1);
			}
			else{
				nodeList.get(i).left = nodeList.get(i-1);
				nodeList.get(i).right = nodeList.get(i+1);
			}
		}
		return nodeList.get(0);
	}
	public static void buildArrayList(TreeNode root, ArrayList<TreeNode> nodeList){
		if(root == null)
			return;
		if(root.left != null)
			buildArrayList(root.left, nodeList);
		if(root != null)
			nodeList.add(root);
		if(root.right != null)
			buildArrayList(root.right, nodeList);
	}
	//打印链表
	public static void printListFromHeadToTail(TreeNode head){
		if(head == null){
			return;
		}
		while(head!=null){
			System.out.print(head.val+" ");
			head = head.right;
		}
	}
	//中序遍历树
	public static void inorder(TreeNode root){
		if(root != null){
			inorder(root.left);
			System.out.print(root.val+" ");
			inorder(root.right);
		}
	}
	//前序遍历
	public static void preorder(TreeNode root){
		if(root != null){
			System.out.print(root.val+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	//后序遍历
	public static void afterorder(TreeNode root){
		if(root != null){
			afterorder(root.left);
			afterorder(root.right);
			System.out.print(root.val+" ");
		}
	}
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(12);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(18);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(9);
		TreeNode node6 = new TreeNode(15);
		TreeNode node7 = new TreeNode(19);
		TreeNode node8 = new TreeNode(17);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node6.right = node8;
		
		System.out.println("The Tree is (inorder): ");
		inorder(node1);
		System.out.println("\nThe Tree is (preorder): ");
		preorder(node1);
		System.out.println("\nThe Tree is (afterorder): ");
		afterorder(node1);
		System.out.println("\nThe Convered NodeList is : ");
		TreeNode listhead = convert(node1);
		printListFromHeadToTail(listhead);
	}

}
