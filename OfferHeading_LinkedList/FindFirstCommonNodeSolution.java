package OfferHeading_LinkedList;

/*
    ????????????

    ????
    ????????????????????
*/
public class FindFirstCommonNodeSolution {
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        ListNode pre1 = pHead1;
        ListNode pre2 = pHead2;
        int len1 = 0;
        int len2 = 0;
        while(pre1 != null){
            pre1 = pre1.next;
            len1++;
        }
        while(pre2 != null){
            pre2 = pre2.next;
            len2++;
        }
        if(len1 - len2 > 0){
            int span = len1 - len2;
            while(span > 0){
                pHead1 = pHead1.next;
                span--;
            }
        }
        else{
            int span = len2 - len1;
            while(span > 0){
                pHead2 = pHead2.next;
                span--;
            }
        }
        while(pHead1 != null){
            if(pHead1 == pHead2){
                return pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }
}
