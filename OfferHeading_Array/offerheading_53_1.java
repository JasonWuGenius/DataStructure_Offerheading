package OfferHeading_Array;

public class offerheading_53_1 {
	/*
	 * ���������������г��ֵĴ���
	 * ˼·
		�������������������۽���������϶���Ҫ�õ����ֲ�����һ�ࣻ
		���Ⱦ������������±꣬���ö��ֲ����������ҵ���һ��ֵ����Ŀ��ֵtarget����ȵģ�Ȼ����Ϊ�����������±꣬���԰�right=mid-1��һֱ�����ȥ�ƽ�������ֵ��
		���������Ҳ���±���ǣ���left=mid+1,��ȥ�ƽ����Ҳ���±ꣻ
		���û���ҵ���˵�������ڷ���-1��
	 */
	public static int getNumberOfK(int[] array, int k){
		int leftIndex = -1;
		int rightIndex = -1;
		int start = 0;
		int end = array.length-1;
		while(start <= end){
			int mid = (start+end)/2;
			if(array[mid]>k){
				end = mid-1;
			}
			else if(array[mid]<k){
				start = mid+1;
			}
			else{
				leftIndex = mid;
				end = mid-1;
			}
		}
		start = 0;
		end = array.length-1;
		while(start <= end){
			int mid = (start+end)/2;
			if(array[mid]>k){
				end = mid-1;
			}
			else if(array[mid]<k){
				start = mid+1;
			}
			else{
				rightIndex = mid;
				start = mid+1;
			}
		}
		if(array.length == 0 || rightIndex == -1){
			return 0;
		}
		return rightIndex-leftIndex+1;
	}
	public static void main(String[] args) {
		int[] array = {1,2,4,4,4,4,4,5,6};
		int k = 2;
		System.out.print("The Array:");
		for(int item:array){
			System.out.print(item+" ");
		}
		System.out.println("\nThe k:"+k);
		System.out.println("The number of appearance:"+getNumberOfK(array, k));
	}

}
