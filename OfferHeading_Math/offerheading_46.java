package OfferHeading_Math;

public class offerheading_46 {
	/*
	 * ��Ŀ����
		��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ���
		�������ж���䣨A?B:C����
		������Բ��ö�·��&&������ֻ��ǰһ����������ſ���ȥ�жϵڶ���������
		�ݹ�ĳ��ھ���n=0ʱ����n>0��ÿ�ζ���ִ��&&֮��ı��ʽsum += Sum_Solution(n-1)��
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
