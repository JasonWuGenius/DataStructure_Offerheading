package OfferHeading_Tree;

public class offerheading_28 {
	/*
	 * 对称的二叉树
	 * 
	 * 题目　
	　　请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，
		那么它是对称的。
	
	       思路
	　　还是画图分析，不用分析根结点，只需要分析左右子树。可以看出，
		左右子树刚好是呈镜像的两颗二叉树，所以：对左子树采用（父-左-右）的前序遍历，
		右子树采用（父-右-左）的前序遍历，遍历时判断两个结点位置的值是否相等即可。
		（也可以这样理解：左树的左子树等于右树的右子树，
		左树的右子树等于右树的左子树，对应位置刚好相反，判断两子树相反位置上的值是否相等即可）
	 */
	public static boolean isSymmetrical(TreeNode node){
		if(node == null){
			return false;
		}
		return isEqual(node.left, node.right);
	}
	private static boolean isEqual(TreeNode node1, TreeNode node2){
		if(node1 == null && node2 == null)
			return true;
		if(node1 == null || node2 == null)
			return false;
		return node1.val == node2.val && isEqual(node1.left, node2.right)
				&& isEqual(node1.right, node2.left);
	}
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(3);
		TreeNode node8 = new TreeNode(17);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node6.right = node8;
		
		System.out.println("The tree is symmetric:"+isSymmetrical(node1));
	}

}
