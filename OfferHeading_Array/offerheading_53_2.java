package OfferHeading_Array;

public class offerheading_53_2 {
	/*
	 * 0到n-1中缺失的数字
	 * 
	 * 题目
	　　一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0到n-1之内。
		在范围0到n-1的n个数字中有且只有一个数字不在该数组中，请找出这个数字。

		思路：
		如果从头到尾依次比较值与小标是否相等，时间复杂度为O(n)，效率低。
	　　	由于是排序数组，我们继续考虑使用二分查找算法，结合上图可知：
	　　　　当中间数字等于其下标时，我们在后半部分查找；
	　　　　当中间数字不等于其下标时，
	　　　　1）如果中间数字的前一个数字也不等于其下标，则在前半部分查找；
	　　　　2）如果中间数字的前一个数字等于其下标，则说明中间数字的下标即为我们所要找的数字。
	 */
	public static int getMissingNumber(int[] array){
		if(array == null || array.length == 0){
			return -1;
		}
		int low = 0;
		int high = array.length-1;
		while(low<=high){
			int mid = (low+high)/2;
//			相当于位右移一位，等于处以2
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
