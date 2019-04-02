package OfferHeading_Array;

public class offerheading_53_2 {
	/*
	 * 0��n-1��ȱʧ������
	 * 
	 * ��Ŀ
	����һ������Ϊn-1�ĵ������������е��������ֶ���Ψһ�ģ�����ÿ�����ֶ��ڷ�Χ0��n-1֮�ڡ�
		�ڷ�Χ0��n-1��n������������ֻ��һ�����ֲ��ڸ������У����ҳ�������֡�

		˼·��
		�����ͷ��β���αȽ�ֵ��С���Ƿ���ȣ�ʱ�临�Ӷ�ΪO(n)��Ч�ʵ͡�
	����	�������������飬���Ǽ�������ʹ�ö��ֲ����㷨�������ͼ��֪��
	�����������м����ֵ������±�ʱ�������ں�벿�ֲ��ң�
	�����������м����ֲ��������±�ʱ��
	��������1������м����ֵ�ǰһ������Ҳ���������±꣬����ǰ�벿�ֲ��ң�
	��������2������м����ֵ�ǰһ�����ֵ������±꣬��˵���м����ֵ��±꼴Ϊ������Ҫ�ҵ����֡�
	 */
	public static int getMissingNumber(int[] array){
		if(array == null || array.length == 0){
			return -1;
		}
		int low = 0;
		int high = array.length-1;
		while(low<=high){
			int mid = (low+high)/2;
//			�൱��λ����һλ�����ڴ���2
//			int mid = (low+high)>>1;
			if(array[mid] == mid){
				low = mid+1;
			}
			else{
				if(mid == 0 || array[mid-1] == mid-1){
					return mid;
				}
				high = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5,6,7};
//		int[] array = {0};
		System.out.print("The Array : ");
		for(int item:array){
			System.out.print(item+" ");
		}
		System.out.println("\nThe Missing num : "+getMissingNumber(array));
	}

}
