package OfferHeading_Tree;

/*
	树的子结构

	题目描述
	输入两棵二叉树A，B，判断B是不是A的子结构。
	（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubTreeSolution {
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root2 == null){
			return false;
		}
		if(root1 == null && root2 != null){
			return false;
		}
		boolean flag = false;
		if(root1.val == root2.val){
			flag = isSubtree(root1, root2);
		}
		if(!flag){
			flag = HasSubtree(root1.left, root2);
			if(!flag){
				flag = HasSubtree(root1.right, root2);
			}
		}
		return flag;
	}
	public static boolean isSubtree(TreeNode root1, TreeNode root2){
		if(root2 == null){
			return true;
		}
		if(root1 == null && root2 != null){
			return false;
		}
		if(root1.val == root2.val){
			return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		n1.right = n2;

		System.out.println("The root1 is the subtree of The root2: "+HasSubtree(node1, n1));
	}
}