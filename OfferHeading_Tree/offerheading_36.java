package OfferHeading_Tree;

import java.util.ArrayList;

import OfferHeading.BinaryTreeNode;

public class offerheading_36 {
	/*
	 * ������������˫������
	 * 
	 * ����һ�ö��������������ö���������ת����һ�������˫������
	 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
	 * 
	 * ˼·
		������������������������������������Ͱ���valֵ�Ĵ�С��С�����ź����ˣ������������
		Ȼ��Ҫת��Ϊ˫���������������еĴ�ŵ����Ľڵ��Ѿ����ռ�ֵ��С�����ź����ˣ�
		��ô�Ͷ���ÿ���ڵ��������ָ���������һ���ڵ㣬������ָ���������һ���ڵ㣬
		����������˱��˫������
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
	//��ӡ����
	public static void printListFromHeadToTail(TreeNode head){
		if(head == null){
			return;
		}
		while(head!=null){
			System.out.print(head.val+" ");
			head = head.right;
		}
	}
	//���������
	public static void inorder(TreeNode root){
		if(root != null){
			inorder(root.left);
			System.out.print(root.val+" ");
			inorder(root.right);
		}
	}
	//ǰ�����
	public static void preorder(TreeNode root){
		if(root != null){
			System.out.print(root.val+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	//�������
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
