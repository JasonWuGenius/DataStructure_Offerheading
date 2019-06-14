package OfferHeading_Tree;

public class offerheading_68 {
	/*
	 * 树中两个结点的最低公共结点
	 * 
	 * 题目
　　		输入两个树结点，求它们的最低公共祖先。

	        思路
	　　该题首先要和面试官确定是否为二叉树，得到肯定答复后，还要确定是否为二叉搜索树，
	  	是否有父指针，或者仅仅是普通二叉树。
	　　1.树为二叉搜索树时，最低公共祖先结点的大小在两个树结点大小的中间。
	　　2.树为普通树时，使用遍历将子结点的信息往上传递。在左右子树中进行查找是否存在两个树结点，
		如果两个树结点分别在左右子树上，说明该根结点就是它们的最低公共祖先。
	 */
	//二叉搜索树
	public static TreeNode getLowestCommonParentBST(TreeNode root, TreeNode node1, TreeNode node2){
		System.out.println("The first node val:"+node1.val);
		System.out.println("The second node val:"+node2.val);
		while(true){
			if(root == null)
				return null;
			if(root.val<node1.val && root.val<node2.val)
				root = root.right;
			else if(root.val>node1.val && root.val>node2.val)
				root = root.left;
			else
				return root;
		}
	}
	//普通二叉树
	public static TreeNode getLowestCommonParent(TreeNode root, TreeNode node1, TreeNode node2){
		if(root == null || root == node1 || root == node2)
			return root;
		TreeNode left = getLowestCommonParent(root.left, node1, node2);
		TreeNode right = getLowestCommonParent(root.right, node1, node2);
		try{
			System.out.println(left.val+" "+right.val);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		return left == null? right:right == null? left:root;
	}
	//链表存储从根结点到树结点的路径
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(10);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(8);
		TreeNode node6 = new TreeNode(15);
		TreeNode node7 = new TreeNode(30);
		TreeNode node8 = new TreeNode(6);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(12);
		TreeNode node11 = new TreeNode(18);
		TreeNode node12 = new TreeNode(25);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node5.left = node8;
		node5.right = node9;
		node6.left = node10;
		node6.right = node11;
		node7.left = node12;
		
		System.out.println("The Tree:");
		System.out.println(TreeLevelPrint.levelOrder(node1));
//		System.out.println("The Lowest Common Parent:"+getLowestCommonParentBST(node1, node8, node9).val);
		System.out.println("The Lowest Common Parent:"+getLowestCommonParent(node1, node10, node11).val);
	}

}
