package OfferHeading_Array;

public class offerheading_53_3 {
	/*
	 * ������������±���ȵ�Ԫ��
	 * 
	 * ��Ŀ
	��������һ�������������������ÿ��Ԫ�ض�������������Ψһ�ġ�
		����ʵ��һ�������ҳ�����������һ����ֵ�������±��Ԫ�ء�
		���磬������{-3, -1,1, 3, 5}�У�����3�������±���ȡ�
		
		˼·
	����ͬ53-1��53-2һ�������ٴ�ͷ��β�������������������飬���Ǽ�������ʹ�ö��ֲ����㷨��
	����  1�����м����ֵ������±�ʱ���м����ּ�Ϊ�������֣�
	����  2�����м����ִ������±�ʱ������벿������Ѱ�ң�
	����  3�����м�����С�����±�ʱ�����Ұ벿������Ѱ�ң�
	 */
	public static int getNumberSameAsIndex(int[] array){
		if(array == null || array.length == 0){
			return -1;
		}
		int low = 0;
		int high = array.length-1;
		while(low<=high){
			int mid = (low+high)>>1;
			if(array[mid] > mid){
				high = mid-1;
			}
			else if(array[mid] < mid){
				low = mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {-1,1,3,5,7};
//		int[] array = {0};
		System.out.print("The Array : ");
		for(int item:array){
			System.out.print(item+" ");
		}
		System.out.println("\nThe Index of Same-Index-Num : "+getNumberSameAsIndex(array));
	}

}
