package OfferHeading_Math;

public class offerheading_29 {
	/**
	 * ��Ŀ�����ǰ�ֻ��������2��3��5��������������Ugly Number�����󰴴�С�����˳��ĵ�1500��������
	 * ����6��8���ǳ�������14���ǣ���Ϊ����������7��ϰ�������ǰ�1������һ��������
	 * 
	 * ˼·�� 
	 * ʹ��һ�����齫֮ǰ�Ѿ�������ĳ�������������Ȼ��������2��3��5�����������Ѿ�������ĳ�����ѡ��������С��һ�����浽�����С�
	 * ���������д����������Max����ôֻҪ���2��3��5���������е�ĳһ�����պñ�Max��Ȼ��ѡ�����߼���С�ľͿ��ԡ�
	 * ���磺��ǰ�����еĳ����ǣ�1����ʱ2*1��3*1��5*1������С����2����2�浽�����У���ʱ�����е���Ϊ1��2��
	 * Max=2������Ϊ2*1==Max�����2�˵ĳ���Ӧ��Ϊ2*2��3*1>2,5*1>2,���µ�4��3��5����С��Ϊ3��3�浽�����У�����ѭ����
	 */
	//�㷨Ч����Ҫ��һ�£���Ҫ�ÿռ�ȥ��ʱ�䣬
	public static int getUglyNumber(int index){
		if(index == 0) return 0;
		int[] ugly = new int[index];
		ugly[0] = 1;
		int uglyIndex = 1, min;
		int nextIndex2 = 0, nextIndex3 = 0, nextIndex5 = 0;
		while(uglyIndex < index){
			//min���Ա������ɵĴ��ڵ�ǰ��������ֵ����С����
			min = ugly[nextIndex2]*2<ugly[nextIndex3]*3? ugly[nextIndex2]*2:ugly[nextIndex3]*3;
			min = min<ugly[nextIndex5]*5? min:ugly[nextIndex5]*5;
			System.out.println("min:"+min);
			ugly[uglyIndex] = min;
			while(ugly[nextIndex2]*2<=min){
				//���ugly[nextIndex2]С�ڵ�ǰ��������ֵ��nextIndex2++
				nextIndex2++;
			}
			while(ugly[nextIndex3]*3<=min){
				//���ugly[nextIndex3]С�ڵ�ǰ��������ֵ��nextIndex3++
				nextIndex3++;
			}
			while(ugly[nextIndex5]*5<=min){
				//���ugly[nextIndex5]С�ڵ�ǰ��������ֵ��nextIndex5++
				nextIndex5++;
			}
			uglyIndex++;
		}
		return ugly[index-1];
	}
	
	public static void main(String[] args) {
		int index = 1500;
		System.out.println("The index "+index+" of ugly number list: "+getUglyNumber(index));
	}
}
