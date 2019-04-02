package OfferHeading_BinarySearch;

public class offerheading_53_1 {
	/**
	 * 统计一个数字在排序数组中出现的次数。
	 * 
	 * int[] array = {1, 2, 3, 3, 3, 3, 4, 4, 5};
	 * int k = 3;
	 */
	public static int getNumberOfK(int[] array, int k){
		int firstIndex = -1, lastIndex = -1;
		int start = 0, end = array.length-1;
		while(start<=end){
			int mid = (start+end)/2;
			if(array[mid]<k){
				start = mid+1;
			}
			else if(array[mid]>k){
				end = mid-1;
			}
			else{
				firstIndex = mid;
				end = mid-1;
			}
		}
		start = 0;
		end = array.length-1;
		while(start<=end){
			int mid = (start+end)/2;
			if(array[mid]<k){
				start = mid+1;
			}
			else if(array[mid]>k){
				end = mid-1;
			}
			else{
				lastIndex = mid;
				start = mid+1;
			}
		}
		if(array == null || lastIndex == -1){
			return 0;
		}
		return lastIndex-firstIndex+1;
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 3, 3, 3, 4, 4, 5};
		int k = 2;
		int result = getNumberOfK(array, k);
		System.out.println("The number "+k+". Count: "+result);
		
	}

}


























