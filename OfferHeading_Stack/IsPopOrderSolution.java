package OfferHeading_Stack;

import java.util.Stack;
/*
 * 栈的压入、弹出序列
 * 
 * 题目详述

	输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
	假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
	序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
	（注意：这两个序列的长度是相等的）
 * 
 * 思路
	一个弹出序列，一个压栈序列，弹出序列中的数，比如第一个弹出的数，
	肯定是在压栈过程中弹出来的，所以在这里新建一个栈stack,
	如果压栈序列中要压入的数和弹出序列当前的数不一样（说明没找到），
	那么压栈序列继续压，直到压栈序列中找到了和弹出序列当前下标值相等的数，
	那么弹出序列的下标值就+1,。
	结束条件就是弹出序列的下标值可以到达序列的末尾。
 */

public class IsPopOrderSolution {
	public static boolean IsPopOrder(int[] pushA, int[] popA){
		if(pushA.length != popA.length){
			return false;
		}
		int j=0;
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<pushA.length; i++){
			stack.add(pushA[i]);
			while(stack.peek() == popA[j]){
				stack.pop();
				j++;
				if(j == popA.length){
					return true;
				}
			}
		}
		return false;
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
		System.out.println("\nThe pop order is :"+IsPopOrder(pushA, popA));
	}

}
