package OfferHeading_Stack;

import java.util.Stack;

import javax.management.RuntimeErrorException;

public class offerheading_10 {
	/*
	 * ������ջʵ�ֶ���
	 * 
	 * ��Ŀ
		������ջʵ��һ�����С����е��������£���ʵ��������������appendTail��deleteHead��
		�ֱ�����ڶ���β����������ڶ���ͷ��ɾ�����Ĺ��ܡ�
		
		˼·
		��ָoffer��˼·��������ջ��ʵ�ֶ��У�ջ1�Ļ�������ӣ�����ÿ����һ��Ԫ�ؾ���ջ1��
		ջ2�Ļ��������ӣ��������Ҫ���ӣ������ж�ջ2�ǲ��ǿգ��ǿգ�
		�Ͱ�ջ1����������ջ2����Ϊջ�����������������������������ȳ��ˣ�
		����������~����Ȼ���ջ2��ʼ�������ջ2��Ϊ�գ�ֱ�Ӵ�ջ2��ʼ��
	 */
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	public void push(int node){
		stack1.push(node);
	}
	public int pop(){
		if(stack2.empty()){
			if(stack1.empty()){
				throw new RuntimeException("����Ϊ�գ�");
			}
			else{
				while(!stack1.empty()){
					stack2.push(stack1.pop());
				}
			}
		}
		return stack2.pop();
	}
	public static void main(String[] args) {
		offerheading_10 o10 = new offerheading_10();
		o10.push(2);
		o10.push(3);
		System.out.println("pop:"+o10.pop());
		o10.push(4);
		System.out.println("pop:"+o10.pop());
		System.out.println("pop:"+o10.pop());
		
	}

}
