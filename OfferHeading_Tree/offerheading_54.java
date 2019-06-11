package OfferHeading_Tree;

public class offerheading_54 {
	/*
	 * 二叉搜索树
	 * 
	 * 题目
	　　给定一棵二叉搜索树，请找出其中的第k小的结点。
		回到顶部
	        思路
		设置全局变量index=0，对BST进行中序遍历，每遍历一个结点，
		index+1，当index=k时，该结点即为所求结点。
	 */
//	public class TreeNode{
//		int val=0;
//		TreeNode left = null;
//		TreeNode right = null;
//		public TreeNode(int val){
//			this.val = val;
//		}
//	}
	int index = 0;
	
	public TreeNode KthNode(TreeNode root, int k){
		TreeNode node = null;
		if(root == null || k<=0){
			return node;
		}
		node = getKthNode(root, k);
		return node;
	}
	private TreeNode getKthNode(TreeNode root, int k){
		TreeNode kthNode = null;
		if(root.left!=null){
			kthNode = getKthNode(root.left, k);
			if(kthNode != null){
				System.out.println("kthNode--1:"+kthNode.val);
			}
		}
		if(kthNode==null){
			index++;
			System.out.println("index:"+index);
			if(k==index){
				kthNode = root;
			}
		}
		if(kthNode==null && root.right!=null){
			kthNode = getKthNode(root.right, k);
			if(kthNode != null){
				System.out.println("kthNode--3:"+kthNode.val);
			}
		}
		return kthNode;
	}
	//中序遍历
	public static void inorder(TreeNode root){
		if(root!=null){
			inorder(root.left);
			System.out.print(root.val+" ");
			inorder(root.right);
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
		
		System.out.println("The inorder:");
		inorder(node1);
		offerheading_54 o54 = new offerheading_54();
		int k = 6;
		System.out.println("\nThe k:"+k);
		TreeNode node = o54.getKthNode(node1, k);
		System.out.println("The k num:"+node.val);
	}

}
