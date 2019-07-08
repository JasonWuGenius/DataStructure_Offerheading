package OfferHeading_Tree;

import java.util.Arrays;

import javax.swing.event.SwingPropertyChangeSupport;

/*
	重建二叉树

	题目描述
	输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
	假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
	例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列
	{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*/

public class ReConstructBinaryTreeSolution {
    public static TreeNode ReConstructBinaryTree(int [] pre,int [] in) {
		if(pre == null || in == null || pre.length == 0 || in.length == 0 || pre.length != in.length){
			return null;
		}
		TreeNode root = new TreeNode(pre[0]);
		for(int i=0; i<in.length; i++){
			if(pre[0] == in[i]){
				root.left = ReConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
				root.right = ReConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
			}
		}
		return root;
	}

	public static void main(String[] args) {
		int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
		int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
		System.out.println("The List preorder:");
		for(int item: pre){
			System.out.print(item+" ");
		}
		System.out.println("\nThe List inorder:");
		for(int item: in){
			System.out.print(item+" ");
		}
		TreeNode root = ReConstructBinaryTree(pre, in);
		System.out.println("\nThe Tree is: "+TreeLevelPrint.levelOrder(root));

	}
}
