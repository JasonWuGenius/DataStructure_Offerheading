package OfferHeading_Tree;

public class offerheading_28 {
	/*
	 * �ԳƵĶ�����
	 * 
	 * ��Ŀ��
	������ʵ��һ�������������ж�һ�ö������ǲ��ǶԳƵġ����һ�ö����������ľ���һ����
		��ô���ǶԳƵġ�
	
	       ˼·
	�������ǻ�ͼ���������÷�������㣬ֻ��Ҫ�����������������Կ�����
		���������պ��ǳʾ�������Ŷ����������ԣ������������ã���-��-�ң���ǰ�������
		���������ã���-��-�󣩵�ǰ�����������ʱ�ж��������λ�õ�ֵ�Ƿ���ȼ��ɡ�
		��Ҳ����������⣺������������������������������
		��������������������������������Ӧλ�øպ��෴���ж��������෴λ���ϵ�ֵ�Ƿ���ȼ��ɣ�
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
