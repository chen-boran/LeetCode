package rotateRight_061;

import java.util.List;

/**
 * @author ASUS
 * @ 2021/12/8- 18:28
*/


 class ListNode {int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution{
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null||k== 0 ) return head;
        int count =0 ;
        ListNode tmp =head;
        while (tmp != null){
            count++;
            tmp=tmp.next;
        }
        k %= count;

        if (k== 0 ) return  head;

        ListNode dummy = new ListNode(-1);
        dummy.next =head;
        ListNode p = head ;
        for (int i=0; i< count- k-1; i++) {
            p=p.next;
        }
        ListNode tail = new ListNode();
        tail =p.next;
        while (tail.next != null)
            tail=tail.next;
        tail.next = dummy.next;
        dummy.next = p.next;
        p.next = null;
        return  dummy.next;
    }
}