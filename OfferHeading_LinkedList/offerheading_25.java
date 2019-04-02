package OfferHeading_LinkedList;

public class offerheading_25 {
	/*
	 * �ϲ��������������
	 * 
	 * ��Ŀ��
����		����������������������ϲ�����������ʹ�������еĽ����Ȼ�ǰ��յ�������ġ�

	        ˼·
	�����ݹ�ʵ�֣��ϲ������У�ÿ�ζ��Ǵ������������ҳ���С��һ�������ӣ�
		��˿��Բ��õݹ���ʵ�֣�������һ������Ϊnullʱ��ֱ��������һ�������ɣ�
		�������ֻ��Ҫ�������������ҳ���С��һ�����������ӣ��ý���nextֵ����ͨ���ݹ麯�������ӡ�
	�����ǵݹ�ʵ�֣��ǵݹ�ʵ�ֱȽ������뵽��ֱ�ӽ��з�������ۼ��ɣ�
		ע���º��������ͷ���ĸ�ֵ���̡�
	 */
	//�ݹ�--�ݹ���Ҫ�ú����
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
	//�ǵݹ�
	public static ListNode merge2(ListNode node1, ListNode node2){
		if(node1 == null)
			return node2;
		if(node2 == null)
			return node1;
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
        ListNode newHead = merge1(node1, node2);
        System.out.println("The Merge List:");
        PrintList.printFromHeadToTail(newHead);
	}

}
