package OfferHeading_Iteration;

public class offerheading_09_1 {
	/*
	 * ��Ŀ����
		һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
		�����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
		
		��ϸ˼·�������μ�����ָoffer����9�⡣
		
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
