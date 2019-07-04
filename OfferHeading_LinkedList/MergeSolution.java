package OfferHeading_LinkedList;

/*
 * 合并两个排序的链表
 * 
 * 题目　
　　输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的。

	思路
　　递归实现：合并过程中，每次都是从两个链表中找出较小的一个来链接，
	因此可以采用递归来实现：当任意一个链表为null时，直接链接另一个链表即可；
	其余情况只需要在两个链表中找出较小的一个结点进行链接，该结点的next值继续通过递归函数来链接。

　　非递归实现：非递归实现比较容易想到，直接进行分情况讨论即可，
	注意下后面代码中头结点的赋值过程。
 */
public class MergeSolution {
	//递归--递归需要好好理解
	public static ListNode merge1(ListNode node1, ListNode node2){
		if(node1 == null)
			return node2;
		if(node2 == null)
			return node1;
		if(node1.val < node2.val){
			node1.next = merge1(node1.next, node2);
			return node1;
		}
		else{
			node2.next = merge1(node2.next, node1);
			return node2;
		}
	}
	//非递归
	public static ListNode merge2(ListNode node1, ListNode node2){
		if(node1 == null){
			return node2;
		}
		if(node2 == null){
			return node1;
		}
		ListNode pre = new ListNode(-1);
		ListNode head = pre;
		while(node1 != null && node2 != null){
			if(node1.val < node2.val){
				head.next = node1;
				node1 = node1.next;
			}
			else{
				head.next = node2;
				node2 = node2.next;
			}
			head = head.next;
		}
		if(node1 == null){
			head.next = node2;
		}
		else{
			head.next = node1;
		}
		return pre.next;
	}
	public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        
        node1.next=node3;
        node3.next=node5;
        node5.next=node7;
        
        node2.next=node4;
        node4.next=node6;
        node6.next=node8;
        
        System.out.println("The List1:");
        PrintList.printFromHeadToTail(node1);
        System.out.println("The List2:");
        PrintList.printFromHeadToTail(node2);
        ListNode newHead = merge2(node1, node2);
        System.out.println("The Merge List:");
        PrintList.printFromHeadToTail(newHead);
	}

}
