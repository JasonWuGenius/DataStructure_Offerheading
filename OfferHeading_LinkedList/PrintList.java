package OfferHeading_LinkedList;

public class PrintList {
	/*
	 * ��ӡ����
	 */
	public static void printFromHeadToTail(ListNode head){
		ListNode temp = head;
		while(temp != null){
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}

}
