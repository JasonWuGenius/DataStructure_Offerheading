package OfferHeading_Math;

/*
 * ���üӼ��˳����ӷ�
 * 
 * ��Ŀ
����дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ�ã�����������������������š�

	˼·
	���������������㣬�������������⣬ֻʣ��λ�����ˡ�����һ������µļӷ����裬������£�
	����1�������ǽ�λ��ÿһλ��ӣ�1��0��0��1������1����0��0��1��1����0������ʹ�����^������
	����2�������λ��ֻ��1��1������λ�����Բ���λ��&������������1λ��
	����3���������λ��ӣ����ظ�ǰ���������������ж�Ϊ��λΪ0��
 */
public class AddTwoNum {
	public static int add(int num1, int num2){
		while(num2 != 0){
			int sum = num1^num2;//û��λ�ĺ�
			int carry = (num1&num2)<<1;//��λ
			num1 = sum;
			num2 = carry;
			System.out.println(sum+" "+carry);
		}
		return num1;
	}
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 4;
		System.out.println("The num1:"+num1);
		System.out.println("The num2:"+num2);
		System.out.println("The Add of two nums:"+add(num1, num2));
	}

}
