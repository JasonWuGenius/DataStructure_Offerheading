package OfferHeading_LinkedList;

public class offerheading_18 {
	/*
	 * ��Ŀ
����		��һ������������У����ɾ���ظ��Ľ�㣿���磬��ͼ3.4��a�����ظ���㱻ɾ��֮��������ͼ3.4��b����ʾ��
	        ��Ŀ����
		��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻������
		��������ͷָ�롣 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
		
		
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
