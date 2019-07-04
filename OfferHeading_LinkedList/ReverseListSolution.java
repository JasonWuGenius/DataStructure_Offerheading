package OfferHeading_LinkedList;

/*
 * 反转链表
 * 
	题目　
	定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。

	思路
　　方法一：使用三个指针（pre,p,next）进行实现。令p指向pre，
	next则是用于防止链表断裂（很简单，详见代码）。
　　方法二（递归）：找到最后一个结点作为返回值，递归函数中，
	找到最后的头结点后，开始进行每个结点next值的转换。　
 */
public class ReverseListSolution {
	public static ListNode reverseList1(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode preNode = null;
		ListNode now = head;
		ListNode next = now.next;
		while(next != null){
			now.next = preNode;
			preNode = now;
			now = next;
			next = now.next;
		}
		now.next = preNode;
		return now;
	}
	//迭代法
	public static ListNode reverseList2(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode now = head;
		ListNode preNode = null;
		while(now != null){
			ListNode next = now.next;
			now.next = preNode;
			preNode = now;
			now = next;
		}
		return preNode;
	}

	public static ListNode reverseList3(ListNode head){
		ListNode pre = null;
		while(head != null){
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
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
        ListNode newHead = reverseList3(ListNode1);
        System.out.println("The reversed List:");
        PrintList.printFromHeadToTail(newHead);
	}

}
