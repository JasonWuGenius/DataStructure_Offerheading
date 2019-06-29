package OfferHeading_Tree;

import java.util.*;
/*
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 思路
	使用一个队列，实现二叉树的层次遍历
 */

public class PrintFromTopToBottomSolution {
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
		ArrayList<Integer> res = new ArrayList<>();
		if(root == null){
			return res;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode temp = queue.poll();
			res.add(temp.val);
			if(temp.left != null){
				queue.add(temp.left);
			}
			if(temp.right != null){
				queue.add(temp.right);
			}
		}
		return res;
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
		node3.left = node6;
		node3.right = node7;
		node6.right = node8;
		
		System.out.println("The Tree is : "+PrintFromTopToBottom(node1));
	}

}
