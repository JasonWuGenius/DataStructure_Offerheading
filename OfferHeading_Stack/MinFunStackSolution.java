package OfferHeading_Stack;

import java.util.Stack;
/*
 * 包含min函数的栈
 * 
 * 题目　
　　定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的min函数。
	在该栈中，调用min、push及pop的时间复杂度都是O(1)。
	
			  思路
　　最初想法是定义一个成员变量min来存放最小元素，但是当最小元素弹出后，min就需要相应改变，所以必须把每次的最小值都存储下来。考虑采用一个辅助栈来存放最小值：
　　　　栈  3，4，2，5，1
　    辅助栈 3， 3，2，2，1
　　（压入时，把每次的最小元素（之前最小元素与新入栈元素的较小值）保存起来放到辅助栈中）
 */

public class MinFunStackSolution {
	static Stack<Integer> stack = new Stack<>();
	static Stack<Integer> minstack = new Stack<>();

	public static void push(int node){
		stack.push(node);
		if(minstack.isEmpty()){
			minstack.push(node);
		}
		else{
			minstack.push(minstack.peek() > stack.peek() ? stack.peek() : minstack.peek()); 
		}
	}

	public static void pop(){
		stack.pop();
		minstack.pop();
	}

	public static int top(){
		return stack.peek();
	}

	public static int min(){
		return minstack.peek();
	}


	public static void testPush(int num){
		push(num);
		System.out.println("\nThe Stack:");
		for(int item: stack){
			System.out.print(item+" ");
		}
		System.out.println("\nThe Min:"+min());
	}
	public static void testPop(){
		pop();
		System.out.println("\nThe Stack:");
		for(int item: stack){
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
