package OfferHeading_Tree;

/*
�����������ĺ����������

��Ŀ����
����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
����������Yes,�������No���������������������������ֶ�������ͬ��
*/

public class VerifySquenceOfBSTSolution {
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence == null || sequence.length == 0){
			return false;
		}
		return IsTreeBST(sequence, 0, sequence.length-1);
	}
	public static boolean IsTreeBST(int[] sequence, int start, int end){
		if(start >= end){
			return true;
		}
		int i = start;
		for(; i<end; i++){
			if(sequence[i]>sequence[end]){
				break;
			}
		}
		for(int j=i; j<end; j++){
			if(sequence[j]<sequence[end]){
				return false;
			}
		}
		return IsTreeBST(sequence, start, i-1) && IsTreeBST(sequence, i, end-1);
	}

	public static void main(String[] args) {
		// int[] sequence = {3,6,5,8,9,7,10};
		int[] sequence = {7,5,6,3};
		for(int item: sequence){
			System.out.print(item+" ");
		}
		System.out.println("\nThe Tree is BST: "+VerifySquenceOfBST(sequence));
	}
}
