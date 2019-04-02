package OfferHeading_Iteration;

public class offerheading_09_1 {
	/*
	 * 题目详述
		一只青蛙一次可以跳上1级台阶，也可以跳上2级。
		求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
		
		详细思路解析，参见《剑指offer》第9题。
		
	 */
	public static int jumpFloor(int target){
		if(target == 1)
			return 1;
		if(target == 2)
			return 2;
		int a = 1;
		int b = 2;
		int sum = a+b;
		for(int i=3; i<=target; i++){
			sum = a+b;
			a = b;
			b = sum;
		}
		return sum;
	}
	public static void main(String[] args) {
		for(int i=1; i<10; i++){
			System.out.println("The target : "+i+"    The sum of solutions : "+jumpFloor(i));
		}
	}

}
