package OfferHeading_Tree;

public class offerheading_24 {
	/*
	 * �����������ĺ�����������---��û�����
	 * 
	 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
	 * ����������Yes,�������No���������������������������ֶ�������ͬ��
	 */
	public static boolean verifySequenceOfBST(int[] sequence){
		if(sequence.length == 0){
			return false;
		}
		return verify(sequence, 0, sequence.length-1);
	}
	public static boolean verify(int[] sequence, int begin, int end){
		if(begin == end){
			return true;
		}
		int rootValue = sequence[end];
		int leftBegin = -1;
		int leftEnd = -1;
		int rightBegin = -1;
		int rightEnd = -1;
		
		if(sequence[begin]<rootValue){
			leftBegin = begin;
		}	
		for(int i=begin; i<end; i++){
			if(sequence[i]<rootValue){
				leftEnd = i;
			}
			else{
				if(rightBegin == -1){
					rightBegin = i;
				}
				rightBegin = i;
			}
		}
		if(rightBegin < leftEnd && rightBegin != -1){
			return false;
		}
		return verify(sequence, leftBegin, leftEnd) && verify(sequence, rightBegin, rightEnd);
	}
}