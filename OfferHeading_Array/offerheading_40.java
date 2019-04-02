package OfferHeading_Array;

public class offerheading_40 {
	/*
	 * 数组中只出现一次的数字
	 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
	 * 
	 * 用异或"^"来解决
	 */
	public static void findNumsAppearOnce(int[] array, int num1, int num2){
		int temp = 0;
		for(int i=0; i<array.length; i++){
			temp ^=array[i];
		}
		int index = findOne(temp);//找到第一个不为0的位置
		num1 = 0;
		num2 = 0;
		for(int i=0; i<array.length; i++){
			if(isBit1(array[i], index)){
				num1 ^= array[i];
			}
			else{
				num2 ^= array[i];
			}
		}
	}
	private static int findOne(int number){
		int index = 0;
		while((number & 1) == 0){
			index++;
			number = number >> 1;
		}
		return index;
	}
	private static boolean isBit1(int number, int index){
		number = number >> index;
		if((number & 1) == 0){
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] array = {2,2,3,3,4,5,5,6,6,7};
		int num1 = -1;
		int num2 = -1;
		System.out.println("The Array:");
		for(int item:array){
			System.out.print(item+" ");
		}
		findNumsAppearOnce(array, num1, num2);
		System.out.println("The num1:"+num1);
		System.out.println("The num2:"+num2);
	}

}
