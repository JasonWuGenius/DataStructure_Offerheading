package OfferHeading_Tree;

public class TreeSerialize {
	/*
	 * ���л�������
	 * 
	 * ˼·
		��һ������£���Ҫ����ǰ/��������������������ȷ��һ����������
		������ʵ����ֻ����ǰ��������Ӹ���㿪ʼ�������ս��(null)���Ϊһ��������ţ��硰$������
		�Ϳ���ȷ��һ���������ˡ�
		
		 �������������л�Ϊ�ַ���������ǰ������Ĺ��̣������ս��ʱ��
		 ���л�Ϊ��$����ÿ������ʹ�ö��ŷָ�����
		
		�����ַ��������л�Ϊ��������Ҳʹ��ǰ�����������һ��������(����$)�ͽ���һ���½�㣬
		������Ҫע����ǣ����ֿ��ܲ�ֻ�Ǹ�λ���֣���˴�����һ��ȫ��Int����index�����ַ����ϵ��ƶ���ָ�룩��
		�Ա��ڽ�ȡ�ַ����е�ǰ�Ľ��ֵ����������룩
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
