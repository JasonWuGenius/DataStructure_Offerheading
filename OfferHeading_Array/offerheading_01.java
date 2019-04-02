package OfferHeading_Array;

public class offerheading_01 {
	/*
	 * 找出数组中重复的数字
	 * 
	 * 题目
	　　在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，
		但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
		例如，如果输入长度为7的数组{2, 3, 1, 0, 2, 5, 3}，那么对应的输出是重复的数字2或者3。
		
		思路
	　　从哈希表的思路拓展，重排数组：把扫描的每个数字（如数字m）放到其对应下标（m下标）的位置上，
		若同一位置有重复，则说明该数字重复。（在动手写代码前应该先想好测试用例）
	 */
	public static int getDuplicate(int[] arr){
		if(arr == null || arr.length <= 0){
			System.out.println("The array is not available");
			return -1;
		}
		for(int a:arr){
			if(a<0 || a>arr.length-1){
				System.out.println("The num is out of bound!");
				return -1;
			}
		}
		for(int i=0; i<arr.length; i++){
			int temp;
			while(arr[i] != i){
				if(arr[arr[i]] == arr[i])
					return arr[i];
				temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
			}
		}
		System.out.println("There is no Duplicate Nums!");
		return -1;
	}
	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 2, 4 };
		int[] arr = {2, 3, 1, 0, 2, 5, 3};
		System.out.println("The Duplicate Number:"+getDuplicate(arr));
	}
}
