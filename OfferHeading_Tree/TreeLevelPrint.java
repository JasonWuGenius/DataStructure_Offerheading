package OfferHeading_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelPrint {
	/*
	 * 从上到下打印树，即树的层次遍历
	 * 
	 */
	public static List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> tempList = new ArrayList<>();
		if(root == null){
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int toBePrint = 1;
		int nextLevelCount = 0;
		while(!queue.isEmpty()){
			TreeNode tempNode = queue.poll();
			toBePrint--;
			tempList.add(tempNode.val);
			if(tempNode.left != null){
				queue.add(tempNode.left);
				nextLevelCount++;
			}
			if(tempNode.right != null){
				queue.add(tempNode.right);
				nextLevelCount++;
			}
			if(toBePrint == 0){
				result.add(new ArrayList<>(tempList));
				tempList.clear();
				toBePrint = nextLevelCount;
				nextLevelCount = 0;
			}
		}
		return result;
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
		
		System.out.println(levelOrder(node1));
	}

}
