package OfferHeading_LinkedList;

import java.util.Stack;

public class offerheading_05 {
	/*
	 * ��β��ͷ��ӡ����
	 * 
	 * ˼·
	����������˳��ֻ�ܴ�ͷ��β�����������˳��ȴΪ��β��ͷ���ǵ��͵ġ�����ȳ������⣬
		���Ҫ���뵽ʹ��ջ���Ӷ�Ҳ�������뵽ʹ�õݹ顣
	 */
	class ListNode{
		int key;
		ListNode next;
		public ListNode(int key){
			this.key = key;
			this.next = null;
		}
	}
	//ʹ��ջ
	public static void printListReversingly_Iteratively(ListNode node){
		Stack<ListNode> stack = new Stack<ListNode>();
		while(node!=null){
			stack.push(node);
			node = node.next;
		}
		while(!stack.empty()){
			System.out.println(stack.pop().key);
		}
	}
	//ʹ�õݹ�
	public static void printListReversingly_Recursively(ListNode node){
		if(node != null){
			printListReversingly_Recursively(node.next);
			System.out.println(node.key);
		}
		else{
			return;
		}
	}
	//������
	public void test1(){
		ListNode node = null;
		System.out.println("����ջ��");
		printListReversingly_Iteratively(node);
		System.out.println("���õݹ飺");
		printListReversingly_Recursively(node);
	}
	//����������
    public void test2() {
        ListNode ListNode1 = new ListNode(1);
        ListNode ListNode2 = new ListNode(2);
        ListNode ListNode3 = new ListNode(3);
        ListNode ListNode4 = new ListNode(4);
        ListNode ListNode5 = new ListNode(5);
        ListNode1.next=ListNode2;
        ListNode2.next=ListNode3;
        ListNode3.next=ListNode4;
        ListNode4.next=ListNode5;
        System.out.println("����ջ��");
        printListReversingly_Iteratively(ListNode1);
        System.out.println("���õݹ飺");
        printListReversingly_Recursively(ListNode1);
    }
    //�������
    public void test3() {
        ListNode ListNode1 = new ListNode(1);
        System.out.println("����ջ��");
        printListReversingly_Iteratively(ListNode1);
        System.out.println("���õݹ飺");
        printListReversingly_Recursively(ListNode1);
    }
    public static void main(String[] args) {
        offerheading_05 demo = new offerheading_05();
        System.out.println("test1:");
        demo.test1();
        System.out.println("test2:");
        demo.test2();
        System.out.println("test3:");
        demo.test3();
    }
}
