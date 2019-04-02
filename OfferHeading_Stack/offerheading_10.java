package OfferHeading_Stack;

import java.util.Stack;

import javax.management.RuntimeErrorException;

public class offerheading_10 {
	/*
	 * 用两个栈实现队列
	 * 
	 * 题目
		用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail和deleteHead，
		分别完成在队列尾部插入结点和在队列头部删除结点的功能。
		
		思路
		剑指offer的思路，用两个栈来实现队列，栈1的话用来入队，队列每进入一个元素就入栈1，
		栈2的话用来出队，队列如果要出队，首先判断栈2是不是空，是空，
		就把栈1弹出来进入栈2（因为栈是先入后出，两次先入后出就是先入先出了，
		负负得正嘛~），然后从栈2开始弹，如果栈2不为空，直接从栈2开始弹
	 */
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	public void push(int node){
		stack1.push(node);
	}
	public int pop(){
		if(stack2.empty()){
			if(stack1.empty()){
				throw new RuntimeException("队列为空！");
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
