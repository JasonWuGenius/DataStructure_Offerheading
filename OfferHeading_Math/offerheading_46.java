package OfferHeading_Math;

public class offerheading_46 {
	/*
	 * 题目详述
		求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字
		及条件判断语句（A?B:C）。
		此题可以采用短路与&&；就是只有前一个条件满足才可以去判断第二个条件。
		递归的出口就是n=0时，当n>0是每次都会执行&&之后的表达式sum += Sum_Solution(n-1)；
	 */
	public static int sumSolution(int n){
		int sum = n;
		boolean ans = (n>0) && ((sum+=sumSolution(n-1))>0);
		return sum;
	}
	public static void main(String[] args) {
		int n = 4;
		System.out.println("The sum of "+n+" is :"+sumSolution(n));
	}
}
