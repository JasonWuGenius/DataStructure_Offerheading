package OfferHeading_Tree;

public class offerheading_33 {
	/*
	 * 二叉搜索树的后续遍历序列
	 * 
	 * 题目　
	　　输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
		如果是则返回true，否则返回false。假设输入的数组的任意两个数字都互不相同。
		
		思路
	　　二叉树后序遍历数组的最后一个数为根结点，剩余数字中，
		小于根结点的数字（即左子树部分）都排在前面，大于根结点的数字（即右子树部分）都排在后面。
		根据遍历数组的这个特性，可以编写出一个递归函数，用于实现题目所要求的判断功能。
	 */
	public static boolean verifySquenceOfBST(int[] sequence){
		if(sequence == null || sequence.length <= 0)
			return false;
		return verifyCore(sequence, 0, sequence.length-1);
	}
	public static boolean verifyCore(int[] sequence, int start, int end){
		//应该是为单结点服务的
		if(start>=end){
			System.out.println("start:"+start+" end:"+end);
			return true;
		}
		int mid = start;
		while(sequence[mid]<sequence[end])
			mid++;
		for(int i=mid; i<end; i++){
			if(sequence[i]<sequence[end])
				return false;
		}
		return verifyCore(sequence, start, mid-1) && verifyCore(sequence, mid, end-1);
	}
	public static void main(String[] args) {
//		int[] sequence = {5,7,6,9,11,10,8};
//		int[] sequence = {7,4,6,5};
//		int[] sequence = {1};
//		int[] sequence = null;
		int[] sequence = {12,18,23,25,35,30,20,9};
		System.out.println("The Tree:");
		try{
			for(int item:sequence){
				System.out.print(item+" ");
			}
		}
		catch(Exception e){
			System.out.println("Error in Printing Tree!");
		}
		System.out.println("\nThe Sequence is the BST:"+verifySquenceOfBST(sequence));
	}

}
