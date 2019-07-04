package OfferHeading_LinkedList;

import java.util.ArrayList;
import java.util.Stack;

import OfferHeading.ListNode;
/*
 *  从尾到头打印链表
 * 
 *  解决方案一：首先遍历链表的节点后打印，典型的“后进先出”，可以使用栈来实现这种顺序。
	解决方案二：栈的本质就是递归，直接使用递归的方式，打印一个节点的时候先打印它后面的节点，
		再打印该节点自身，实现反向打印
	解决方案三：遍历链表，把链表中的元素复制到ArrayList中，然后逆序打印ArrayList中的元素，
		由于ArrayList底层使用数组实现，所以用数组也是同样的原理
	解决方案四：前三种解决方案本身属于在打印链表的时候不修改链表本身结构，
		在允许修改链表结构的情况下可以把链表中的节点指针反转过来，改变链表方向，
		然后重新遍历打印改变方向后的链表。
 */
//方案一：使用stack来打印链表

public class offerheading_05_1 {
	public static void printListFromTailToHeadByStack(ListNode node){
		Stack<Integer> stack = new Stack<Integer>();
		while(node != null){
			stack.push(node.val);
			node = node.next;
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+",");
		}
		System.out.println();
	}
	//方案二：递归法逆序打印链表
	public static void printListFromTailToHead(ListNode node){
		if(node != null){
			if(node.next != null){
				printListFromTailToHead(node.next);
			}
			System.out.println(node.val+" ");
		}
		else{
			System.out.println("输入的链表为空！");
		}
	}
	//方案三：ArrayList逆序打印链表
	public static void printListFromTailToHeadByArrayList(ListNode node){
		if(node == null){
			System.out.println("输入的链表为空！");
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while(node!=null){
			arrayList.add(node.val);
			node = node.next;
		}
		for(int i=arrayList.size()-1; i>=0; i--){
			System.out.print(arrayList.get(i)+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = null;
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode();
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		System.out.println("方法一：");
		printListFromTailToHead(node1);
		printListFromTailToHead(node5);
		printListFromTailToHead(node6);
		printListFromTailToHead(node7);
		
		System.out.println("方法二：");
		printListFromTailToHeadByStack(node1);
		
		System.out.println("方法三：");
		printListFromTailToHeadByArrayList(node1);
		
	}

}
