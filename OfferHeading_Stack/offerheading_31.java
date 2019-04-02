package OfferHeading_Stack;

import java.util.Stack;

public class offerheading_31 {
	/*
	 * ջ��ѹ�롢��������
	 * 
	 * ��Ŀ����

		���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
		����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
		����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
		��ע�⣺���������еĳ�������ȵģ�
	 * 
	 * ˼·
		һ���������У�һ��ѹջ���У����������е����������һ������������
		�϶�����ѹջ�����е������ģ������������½�һ��ջstack,
		���ѹջ������Ҫѹ������͵������е�ǰ������һ����˵��û�ҵ�����
		��ôѹջ���м���ѹ��ֱ��ѹջ�������ҵ��˺͵������е�ǰ�±�ֵ��ȵ�����
		��ô�������е��±�ֵ��+1,��
		�����������ǵ������е��±�ֵ���Ե������е�ĩβ��
	 */
	public static boolean isPopOrder(int[] pushA, int[] popA){
		if(pushA.length != popA.length){
			return false;
		}
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(pushA[0]);
		int j = 1;
		for(int i=0; i<popA.length; i++){
			while(j<pushA.length && stack1.peek() != popA[i]){
				stack1.push(pushA[j]);
				j++;
			}
			if(j >= pushA.length && stack1.peek() != popA[i]){
				return false;
			}
			stack1.pop();
		}
		return true;
	}
	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,5,3,2,1};
//		int[] popA = {4,3,5,1,2};
		System.out.println("The pushA :");
		for(int item: pushA){
			System.out.print(item+" ");
		}
		System.out.println("\nThe popA :");
		for(int item: popA){
			System.out.print(item+" ");
		}
		System.out.println("\nThe pop order is :"+isPopOrder(pushA, popA));
	}

}
