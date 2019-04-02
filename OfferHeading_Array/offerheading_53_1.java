package OfferHeading_Array;

public class offerheading_53_1 {
	/*
	 * 数字在排序数组中出现的次数
	 * 思路
		有序和数组这个两个字眼结合起来，肯定是要用到二分查找这一类；
		首先就是找最左侧的下标，利用二分查找首先是找到有一个值是与目标值target是相等的，然后因为是找最左侧的下标，所以把right=mid-1来一直往左边去逼近最左侧的值；
		至于找最右侧的下标就是，将left=mid+1,来去逼近最右侧的下标；
		如果没有找到则说明不存在返回-1；
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
