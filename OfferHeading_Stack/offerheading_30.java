package OfferHeading_Stack;

import java.util.Stack;

public class offerheading_30 {
	/*
	 * ����min������ջ
	 * 
	 * ��Ŀ��
	��������ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ����СԪ�ص�min������
		�ڸ�ջ�У�����min��push��pop��ʱ�临�Ӷȶ���O(1)��
		
                  ˼·
	��������뷨�Ƕ���һ����Ա����min�������СԪ�أ����ǵ���СԪ�ص�����min����Ҫ��Ӧ�ı䣬���Ա����ÿ�ε���Сֵ���洢���������ǲ���һ������ջ�������Сֵ��
	��������ջ  3��4��2��5��1
	��    ����ջ 3�� 3��2��2��1
	������ѹ��ʱ����ÿ�ε���СԪ�أ�֮ǰ��СԪ��������ջԪ�صĽ�Сֵ�����������ŵ�����ջ�У�
	 */
	public static Stack<Integer> stack_data = new Stack<Integer>();
	public static Stack<Integer> stack_min = new Stack<Integer>();
	
	public static void push(int node){
		stack_data.push(node);
		if(stack_min.empty() || stack_min.peek()>node){
			stack_min.push(node);
		}
		else{
			stack_min.push(stack_min.peek());
		}
	}
	public static void pop(){
		if(!stack_data.empty()){
			stack_data.pop();
			stack_min.pop();
		}
	}
	public static int min(){
		return stack_min.peek();
	}
	public static void testPush(int num){
		push(num);
		System.out.println("\nThe Stack:");
		for(int item: stack_data){
			System.out.print(item+" ");
		}
		System.out.println("\nThe Min:"+min());
	}
	public static void testPop(){
		pop();
		System.out.println("\nThe Stack:");
		for(int item: stack_data){
			System.out.print(item+" ");
		}
		System.out.println("\nThe Min:"+min());
	}
	public static void main(String[] args) {
		testPush(3);
		testPush(4);
		testPush(2);
		testPush(5);
		testPush(1);
		testPop();
		testPop();
		testPop();
		testPop();
		testPop();
		
	}
}
