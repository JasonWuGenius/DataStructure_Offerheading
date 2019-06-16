package OfferHeading_LinkedList;

public class LinkedListCircleEntryNode {
	/*
		链表中环的入口结点

		题目描述
		给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
	 */
	public static ListNode EntryNodeOfLoop(ListNode pHead){
		if(pHead==null || pHead.next==null){
			return null;
		}
		ListNode fast = pHead;
		ListNode slow = pHead;
		while(fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast.next==null || fast.next.next==null){
				return null;
			}
			if(slow==fast){
				break;
			}
		}
		slow = pHead;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node3;

		System.out.println("List:");
		// PrintList.printFromHeadToTail(node1);
		System.out.println((EntryNodeOfLoop(node1).val));
		
	}
}
