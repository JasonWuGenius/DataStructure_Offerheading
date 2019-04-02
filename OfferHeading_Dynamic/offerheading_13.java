package OfferHeading_Dynamic;

public class offerheading_13 {
	/*
	 * 箭绳子
	 * 
	 * 题目
	　　给你一根长度为n绳子，请把绳子剪成m段（m、n都是整数，n>1并且m≥1）。
		每段的绳子的长度记为k[0]、k[1]、……、k[m]。k[0]*k[1]*…*k[m]可能的最大乘积是多少？
		例如当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到最大的乘积18。
		
	 */
	//动态规划
	public static int maxProductAfterVCutting1(int length){
		if(length <= 1)
			return 0;
		if(length == 2)
			return 1;
		if(length == 3)
			return 2;
		int[] product = new int[length+1];
		
	}

}
