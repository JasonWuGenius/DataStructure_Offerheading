package OfferHeading_Tree;

/*
	??????

	????
	??????????????????????
	????:
	????????????? 
				8
			/  \
			6   10
			/ \  / \
			5  7 9 11
			?????
				8
			/  \
			10   6
			/ \  / \
			11 9 7  5
*/
public class MirrorSolution {
	public static void Mirror(TreeNode root){
		if(root == null){
			return;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
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
		node3.left = node6;
		node3.right = node7;
		node6.right = node8;
		
		System.out.println("Before Mirror -- The levelorder:");
		System.out.println(PrintFromTopToBottomSolution.PrintFromTopToBottom(node1));
		Mirror(node1);
		System.out.println("After Mirror -- The levelorder:");
		System.out.println(PrintFromTopToBottomSolution.PrintFromTopToBottom(node1));
	}
}
