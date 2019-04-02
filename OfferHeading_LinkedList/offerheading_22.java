package OfferHeading_LinkedList;

import java.util.Stack;

public class offerheading_22 {
	/*
	 * ��Ŀ
	��������һ����������������е�����k����㡣Ϊ�˷��ϴ�����˵�ϰ�ߣ�
		�����1��ʼ�������������β����ǵ�����1����㡣
		����һ��������6����㣬��ͷ��㿪ʼ���ǵ�ֵ������1��2��3��4��5��6��
		�������ĵ�����3�������ֵΪ4�Ľ�㡣
		
	        ˼·��
		���еķ������ǣ���������ָ�룬��һ��ָ���ȱ���k-1�����ӵ�k����ʼ��
		�ڶ���ָ��ָ��ͷ��㣬�������ͬʱ�������������һ��ָ�뵽�����һ�����ʱ��
		�ڶ���ָ��ָ��������ǵ�����k����㡣����ʵ�о����ǽ��Ʊ��������ΰ�������
	 */
	//����ָ��
	public static ListNode findKthToTail1(ListNode head, int k){
		if(head == null || k <= 0){
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		for(int i=1; i<k; i++){
			fast = fast.next;
			if(fast == null)
				return null;
		}
		while(fast.next != null){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	//ʹ��ջ����
	public static ListNode findKthToTail2(ListNode head, int k){
		if(head == null || k <= 0){
			return null;
		}
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode node = head;
		int lengthOfList = 0;
		while(node!=null){
			stack.push(node);
			lengthOfList++;
			node = node.next;
		}
		if(k>lengthOfList)
			return null;
		else{
			for(int i=1; i<=k; i++){
				node = stack.pop();
			}
			return node;
		}
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
        int k = 1;
//        System.out.println("The back "+k+" Node is :"+findKthToTail1(ListNode1, k).val);
        System.out.println("The back "+k+" Node is :"+findKthToTail2(ListNode1, k).val);
	}

}
