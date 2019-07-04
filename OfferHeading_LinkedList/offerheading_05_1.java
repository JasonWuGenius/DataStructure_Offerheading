package OfferHeading_LinkedList;

import java.util.ArrayList;
import java.util.Stack;

import OfferHeading.ListNode;
/*
 *  ��β��ͷ��ӡ����
 * 
 *  �������һ�����ȱ�������Ľڵ���ӡ�����͵ġ�����ȳ���������ʹ��ջ��ʵ������˳��
	�����������ջ�ı��ʾ��ǵݹ飬ֱ��ʹ�õݹ�ķ�ʽ����ӡһ���ڵ��ʱ���ȴ�ӡ������Ľڵ㣬
		�ٴ�ӡ�ýڵ�����ʵ�ַ����ӡ
	��������������������������е�Ԫ�ظ��Ƶ�ArrayList�У�Ȼ�������ӡArrayList�е�Ԫ�أ�
		����ArrayList�ײ�ʹ������ʵ�֣�����������Ҳ��ͬ����ԭ��
	��������ģ�ǰ���ֽ���������������ڴ�ӡ�����ʱ���޸�������ṹ��
		�������޸�����ṹ������¿��԰������еĽڵ�ָ�뷴ת�������ı�������
		Ȼ�����±�����ӡ�ı䷽��������
 */
//����һ��ʹ��stack����ӡ����

public class offerheading_05_1 {
	public static void printListFromTailToHeadByStack(ListNode node){
		Stack<Integer> stack = new Stack<Integer>();
		while(node != null){
			stack.push(node.val);
			node = node.next;
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+",");
		}
		System.out.println();
	}
	//���������ݹ鷨�����ӡ����
	public static void printListFromTailToHead(ListNode node){
		if(node != null){
			if(node.next != null){
				printListFromTailToHead(node.next);
			}
			System.out.println(node.val+" ");
		}
		else{
			System.out.println("���������Ϊ�գ�");
		}
	}
	//��������ArrayList�����ӡ����
	public static void printListFromTailToHeadByArrayList(ListNode node){
		if(node == null){
			System.out.println("���������Ϊ�գ�");
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while(node!=null){
			arrayList.add(node.val);
			node = node.next;
		}
		for(int i=arrayList.size()-1; i>=0; i--){
			System.out.print(arrayList.get(i)+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = null;
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode();
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		System.out.println("����һ��");
		printListFromTailToHead(node1);
		printListFromTailToHead(node5);
		printListFromTailToHead(node6);
		printListFromTailToHead(node7);
		
		System.out.println("��������");
		printListFromTailToHeadByStack(node1);
		
		System.out.println("��������");
		printListFromTailToHeadByArrayList(node1);
		
	}

}
