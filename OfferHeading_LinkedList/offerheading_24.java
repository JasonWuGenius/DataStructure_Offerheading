package OfferHeading_LinkedList;

public class offerheading_24 {
	/*
	 * ��ת����
	 * 
	 * ��Ŀ��
����		����һ������������һ�������ͷ��㣬��ת�����������ת�������ͷ��㡣

		˼·
	��������һ��ʹ������ָ�루pre,p,next������ʵ�֡���pָ��pre��
		next�������ڷ�ֹ������ѣ��ܼ򵥣�������룩��
	�������������ݹ飩���ҵ����һ�������Ϊ����ֵ���ݹ麯���У�
		�ҵ�����ͷ���󣬿�ʼ����ÿ�����nextֵ��ת������
	 */
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
	//������
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
        ListNode newHead = reverseList1(ListNode1);
        System.out.println("The reversed List:");
        PrintList.printFromHeadToTail(newHead);
	}

}
