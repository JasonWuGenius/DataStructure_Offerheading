package OfferHeading_Tree;

public class TreeSerialize {
	/*
	 * 序列化二叉树
	 * 
	 * 思路
		　一般情况下，需要采用前/后序遍历和中序遍历才能确定一个二叉树，
		但是其实可以只采用前序遍历（从根结点开始），将空结点(null)输出为一个特殊符号（如“$”），
		就可以确定一个二叉树了。
		
		 　将二叉树序列化为字符串，就是前序遍历的过程，遇见空结点时，
		 序列化为“$”，每个结点间使用逗号分隔开。
		
		　将字符串反序列化为二叉树，也使用前序遍历，遇见一个新数字(或者$)就建立一个新结点，
		不过需要注意的是，数字可能不只是个位数字，因此创建了一个全局Int变量index（在字符串上的移动的指针），
		以便于截取字符串中当前的结点值。（详见代码）
	 */
	public static String serialize(TreeNode node){
		StringBuffer sb = new StringBuffer();
		if(node == null){
			sb.append("$,");
		}
		else{
			sb.append(node.val+",");
			sb.append(serialize(node.left));
			sb.append(serialize(node.right));
		}
		return sb.toString();
	}
	public static int index = -1;
	public static TreeNode deserialize(String str){
		index++;
		if(str == null || str.length() == 0){
			return null;
		}
		if(index >= str.length()){
			return null;
		}
		TreeNode node = null;
		String[] newstr = str.split(",");
		if(!newstr[index].equals("$")){
			node = new TreeNode(Integer.valueOf(newstr[index]));
			node.left = deserialize(str);
			node.right = deserialize(str);
		}
		return node;
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
//		node6.right = node8;
		
		System.out.println("The Tree:");
		System.out.println(PrintTree.levelOrder(node1));
		System.out.println("The serialize:");
		System.out.println(serialize(node1));
		String str = serialize(node1);
		TreeNode newHead = deserialize(str);
		System.out.println("The deserialize:");
		System.out.println(PrintTree.levelOrder(node1));
	}

}
