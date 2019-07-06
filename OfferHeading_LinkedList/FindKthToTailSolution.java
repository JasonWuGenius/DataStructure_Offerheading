package OfferHeading_LinkedList;

/*
	链表中倒数第k个结点

	题目描述
	输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTailSolution {
    public static ListNode FindKthToTail(ListNode head,int k) {
		if(head == null || k < 0){
			return null;
		}
		ListNode pre = new ListNode(-1);
		pre.next = head;
		ListNode res = pre;
		while(k>0){
			pre = pre.next;
			k--;
			if(pre == null){
				return null;
			}
		}
		while(pre != null){
			pre = pre.next;
			res = res.next;
		}
		return res;
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
		int k = 2;
		ListNode resNode = FindKthToTail(ListNode1, k);
        System.out.println("K : "+k);
        System.out.println("The kth to tail node: "+resNode.val);
	}

}
