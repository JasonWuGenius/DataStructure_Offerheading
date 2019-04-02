package OfferHeading_LinkedList;

import java.util.Stack;

public class offerheading_22 {
	/*
	 * 题目
	　　输入一个链表，输出该链表中倒数第k个结点。为了符合大多数人的习惯，
		本题从1开始计数，即链表的尾结点是倒数第1个结点。
		例如一个链表有6个结点，从头结点开始它们的值依次是1、2、3、4、5、6。
		这个链表的倒数第3个结点是值为4的结点。
		
	        思路：
		书中的方法则是：设置两个指针，第一个指针先遍历k-1步；从第k步开始，
		第二个指针指向头结点，两个结点同时往后遍历，当第一个指针到达最后一个结点时，
		第二个指针指向的正好是倒数第k个结点。（其实感觉还是近似遍历了两次啊。。）
	 */
	//快慢指针
	public static ListNode findKthToTail1(ListNode head, int k){
		if(head == null || k <= 0){
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		for(int i=1; i<k; i++){
			fast = fast.next;
			if(fast == null)
				return null;
		}
		while(fast.next != null){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	//使用栈方法
	public static ListNode findKthToTail2(ListNode head, int k){
		if(head == null || k <= 0){
			return null;
		}
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode node = head;
		int lengthOfList = 0;
		while(node!=null){
			stack.push(node);
			lengthOfList++;
			node = node.next;
		}
		if(k>lengthOfList)
			return null;
		else{
			for(int i=1; i<=k; i++){
				node = stack.pop();
			}
			return node;
		}
	}
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
        
        System.out.println("The List:");
        PrintList.printFromHeadToTail(ListNode1);
        int k = 1;
//        System.out.println("The back "+k+" Node is :"+findKthToTail1(ListNode1, k).val);
        System.out.println("The back "+k+" Node is :"+findKthToTail2(ListNode1, k).val);
	}

}
