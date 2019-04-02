package OfferHeading_LinkedList;

public class offerheading_17 {
	/*
	 * 在O(1)时间删除链表结点
	 * 
	 * 题目
　　			给定单向链表的头指针和一个结点指针，定义一个函数在O(1)时间删除该结点。
		
		思路
		　　通常那样从头开始查找删除需要的时间为O(n)，要在O(1)时间删除某结点，可以这样实现：设待删除结点i的下一个结点为j，
			把j的值复制到i，再把i的指针指向j的下一个结点，最后删除j，效果就相当于删除j。
		　　注意特殊情况：1.当待删除结点i为尾结点时，无下一个结点，则只能从头到尾顺序遍历；
			2.当链表中只有一个结点时（即是头结点，又是尾结点），必须把头结点也设置为null。
		　　
			本题有个缺陷：要求O(1)时间删除，相当于隐藏了一个假设：待删除的结点的确在表中
		测试算例
		　　1.功能测试（多个结点链表，删除头结点、中间结点和尾结点；单个结点链表）
		　　2.特殊测试（头结点或删除结点为null）
	 */
	public static ListNode deleteNode(ListNode head, ListNode pToBeDeleted){
		if(head == null || pToBeDeleted == null)
			return head;
		//待删除结点不是尾结点
		if(pToBeDeleted.next != null){
			ListNode nextNode = pToBeDeleted.next;
			pToBeDeleted.val = nextNode.val;
			pToBeDeleted.next = nextNode.next;
			nextNode = null;
		}
		//待删除结点是头结点，也是尾结点
		else if(head == pToBeDeleted){
			head = null;
			pToBeDeleted = null;
		}
		//待删除结点是尾结点
		else{
			ListNode preNode = head;
			while(preNode.next != pToBeDeleted && preNode != null){
				preNode = preNode.next;
			}
			if(preNode == null){
				System.out.println("无法找到待删结点");
				return head;
			}
			preNode.next = null;
			pToBeDeleted = null;
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		System.out.println("Before Delete:");
		PrintList.printFromHeadToTail(node1);
		System.out.println("After Delete:");
		ListNode newHead = deleteNode(node1, node5);
		PrintList.printFromHeadToTail(newHead);
	}

}
