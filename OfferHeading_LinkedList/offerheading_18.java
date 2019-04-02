package OfferHeading_LinkedList;

public class offerheading_18 {
	/*
	 * 题目
　　		在一个排序的链表中，如何删除重复的结点？例如，在图3.4（a）中重复结点被删除之后，链表如图3.4（b）所示。
	        题目描述
		在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，
		返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
		
		
	 */
	public static ListNode deleteDuplication(ListNode pHead){
		ListNode preNode = null;
		ListNode curNode = pHead;
		while(curNode != null){
			boolean needDelete = false;
			if(curNode.next != null && curNode.val == curNode.next.val)
				needDelete = true;
			if(!needDelete){
				preNode = curNode;
				curNode = curNode.next;
			}
			else{
				int dupValue
			}
		}
	}

}
