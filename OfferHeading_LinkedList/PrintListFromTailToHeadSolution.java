package OfferHeading_LinkedList;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 从尾到头打印链表
 * 
 * 思路
　　结点遍历顺序只能从头到尾，但是输出的顺序却为从尾到头，是典型的“后进先出”问题，
	这就要联想到使用栈，从而也可以联想到使用递归。
 */
public class PrintListFromTailToHeadSolution {
    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }
	//使用栈
	// public static void printListReversingly_Iteratively(ListNode node){
	// 	Stack<ListNode> stack = new Stack<ListNode>();
	// 	while(node!=null){
	// 		stack.push(node);
	// 		node = node.next;
	// 	}
	// 	while(!stack.empty()){
	// 		System.out.println(stack.pop().key);
	// 	}
	// }
	//使用递归
	// public static void printListReversingly_Recursively(ListNode node){
	// 	if(node != null){
	// 		printListReversingly_Recursively(node.next);
	// 		System.out.println(node.key);
	// 	}
	// 	else{
	// 		return;
	// 	}
	// }
    public static void main(String[] args) {
        ListNode ListNode1 = new ListNode(1);
        ListNode ListNode2 = new ListNode(2);
        ListNode ListNode3 = new ListNode(3);
        ListNode ListNode4 = new ListNode(4);
        ListNode ListNode5 = new ListNode(5);
        ListNode1.next=ListNode2;
        ListNode2.next=ListNode3;
        ListNode3.next=ListNode4;
        ListNode4.next=ListNode5;

		System.out.println("The List: ");
		PrintList.printFromHeadToTail(ListNode1);
		System.out.println("Print From Tail to Head: "+new PrintListFromTailToHeadSolution().printListFromTailToHead(ListNode1));
		
    }
}
