package OfferHeading_LinkedList;

/*
    ????????????

    ????
    ????????????????????
*/
public class FindFirstCommonNodeSolution {
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        
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
