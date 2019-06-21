package OfferHeading_LinkedList;

public class DeleteDuplicateNode {
    /*
        删除链表中重复的节点

        题目描述
        在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，
        返回链表头指针?? 例如，1->2->3->3->4->4->5 处理后为 1->2->5
     */
    public static ListNode deleteDuplication(ListNode pHead){
        ListNode index = new ListNode(-1);
        ListNode result = index;
        index.next = pHead;
        ListNode temp = pHead;
        while(temp!=null){
            if(temp.next!=null && temp.next.val == temp.val){
                while(temp.next!=null && temp.next.val==temp.val){
                    temp = temp.next;
                }
                temp = temp.next;
                index.next = temp;
            }
            else{
                index = index.next;
                temp = temp.next;
            }
        }
        return result.next;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        System.out.println("Before:");
        PrintList.printFromHeadToTail(node1);
        System.out.println("After:");
        PrintList.printFromHeadToTail(deleteDuplication(node1));
        
    }
}
