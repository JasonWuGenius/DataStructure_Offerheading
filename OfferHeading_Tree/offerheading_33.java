package OfferHeading_Tree;

public class offerheading_33 {
	/*
	 * �����������ĺ�����������
	 * 
	 * ��Ŀ��
	��������һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
		������򷵻�true�����򷵻�false���������������������������ֶ�������ͬ��
		
		˼·
	�������������������������һ����Ϊ����㣬ʣ�������У�
		С�ڸ��������֣������������֣�������ǰ�棬���ڸ��������֣������������֣������ں��档
		���ݱ��������������ԣ����Ա�д��һ���ݹ麯��������ʵ����Ŀ��Ҫ����жϹ��ܡ�
	 */
	public static boolean verifySquenceOfBST(int[] sequence){
		if(sequence == null || sequence.length <= 0)
			return false;
		return verifyCore(sequence, 0, sequence.length-1);
	}
	public static boolean verifyCore(int[] sequence, int start, int end){
		//Ӧ����Ϊ���������
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
