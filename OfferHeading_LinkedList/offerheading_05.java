package OfferHeading_LinkedList;

import java.util.Stack;

public class offerheading_05 {
	/*
	 * 从尾到头打印链表
	 * 
	 * 思路
	　　结点遍历顺序只能从头到尾，但是输出的顺序却为从尾到头，是典型的“后进先出”问题，
		这就要联想到使用栈，从而也可以联想到使用递归。
	 */
	class ListNode{
		int key;
		ListNode next;
		public ListNode(int key){
			this.key = key;
			this.next = null;
		}
	}
	//使用栈
	public static void printListReversingly_Iteratively(ListNode node){
		Stack<ListNode> stack = new Stack<ListNode>();
		while(node!=null){
			stack.push(node);
			node = node.next;
		}
		while(!stack.empty()){
			System.out.println(stack.pop().key);
		}
	}
	//使用递归
	public static void printListReversingly_Recursively(ListNode node){
		if(node != null){
			printListReversingly_Recursively(node.next);
			System.out.println(node.key);
		}
		else{
			return;
		}
	}
	//空链表
	public void test1(){
		ListNode node = null;
		System.out.println("采用栈：");
		printListReversingly_Iteratively(node);
		System.out.println("采用递归：");
		printListReversingly_Recursively(node);
	}
	//多个结点链表
    public void test2() {
        ListNode ListNode1 = new ListNode(1);
        ListNode ListNode2 = new ListNode(2);
        ListNode ListNode3 = new ListNode(3);
        ListNode ListNode4 = new ListNode(4);
        ListNode ListNode5 = new ListNode(5);
        ListNode1.next=ListNode2;
        ListNode2.next=ListNode3;
        ListNode3.next=ListNode4;
        ListNode4.next=ListNode5;
        System.out.println("采用栈：");
        printListReversingly_Iteratively(ListNode1);
        System.out.println("采用递归：");
        printListReversingly_Recursively(ListNode1);
    }
    //单个结点
    public void test3() {
        ListNode ListNode1 = new ListNode(1);
        System.out.println("采用栈：");
        printListReversingly_Iteratively(ListNode1);
        System.out.println("采用递归：");
        printListReversingly_Recursively(ListNode1);
    }
    public static void main(String[] args) {
        offerheading_05 demo = new offerheading_05();
        System.out.println("test1:");
        demo.test1();
        System.out.println("test2:");
        demo.test2();
        System.out.println("test3:");
        demo.test3();
    }
}
