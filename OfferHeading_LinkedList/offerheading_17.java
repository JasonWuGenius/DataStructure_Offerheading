package OfferHeading_LinkedList;

public class offerheading_17 {
	/*
	 * ��O(1)ʱ��ɾ��������
	 * 
	 * ��Ŀ
����			�������������ͷָ���һ�����ָ�룬����һ��������O(1)ʱ��ɾ���ý�㡣
		
		˼·
		����ͨ��������ͷ��ʼ����ɾ����Ҫ��ʱ��ΪO(n)��Ҫ��O(1)ʱ��ɾ��ĳ��㣬��������ʵ�֣����ɾ�����i����һ�����Ϊj��
			��j��ֵ���Ƶ�i���ٰ�i��ָ��ָ��j����һ����㣬���ɾ��j��Ч�����൱��ɾ��j��
		����ע�����������1.����ɾ�����iΪβ���ʱ������һ����㣬��ֻ�ܴ�ͷ��β˳�������
			2.��������ֻ��һ�����ʱ������ͷ��㣬����β��㣩�������ͷ���Ҳ����Ϊnull��
		����
			�����и�ȱ�ݣ�Ҫ��O(1)ʱ��ɾ�����൱��������һ�����裺��ɾ���Ľ���ȷ�ڱ���
		��������
		����1.���ܲ��ԣ�����������ɾ��ͷ��㡢�м����β��㣻�����������
		����2.������ԣ�ͷ����ɾ�����Ϊnull��
	 */
	public static ListNode deleteNode(ListNode head, ListNode pToBeDeleted){
		if(head == null || pToBeDeleted == null)
			return head;
		//��ɾ����㲻��β���
		if(pToBeDeleted.next != null){
			ListNode nextNode = pToBeDeleted.next;
			pToBeDeleted.val = nextNode.val;
			pToBeDeleted.next = nextNode.next;
			nextNode = null;
		}
		//��ɾ�������ͷ��㣬Ҳ��β���
		else if(head == pToBeDeleted){
			head = null;
			pToBeDeleted = null;
		}
		//��ɾ�������β���
		else{
			ListNode preNode = head;
			while(preNode.next != pToBeDeleted && preNode != null){
				preNode = preNode.next;
			}
			if(preNode == null){
				System.out.println("�޷��ҵ���ɾ���");
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
