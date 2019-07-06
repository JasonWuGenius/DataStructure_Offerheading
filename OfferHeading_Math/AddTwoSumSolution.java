package OfferHeading_Math;

/*
	数值的整数次方

	题目描述
	给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class AddTwoSumSolution {
    public static double Power(double base, int n) {
		double res = 1, curr = base;
		int exponent;
		if(n>0){
			exponent = n;
		}
		else if(n<0){
			if(base == 0){
				throw new RuntimeException("分母不能为0！");
			}
			exponent = -n;
		}
		else{
			return 1;
		}
		while(exponent != 0){
			if((exponent&1)==1){
				res*=curr;
			}
			curr*=curr;
			exponent>>=1;
		}
		return n>=0? res: (1/res);
	}
	public static void main(String[] args) {
		double base = 1.01;
		int n = 365;
		System.out.println("The base:"+base);
		System.out.println("The exponent:"+n);
		System.out.println("The result of the power of the base:"+Power(base, n));
	}

}
