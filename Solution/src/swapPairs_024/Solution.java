package swapPairs_024;

/**
 * @author ASUS
 * @ 2021/11/18- 15:42
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {


        ListNode Dummy = new ListNode();
        Dummy.next = head;
        ListNode cur = Dummy;


        while (cur.next != null && cur.next.next != null) {
            ListNode l = cur.next;
            ListNode r = l.next;
            cur.next = r;
            l.next = r.next;
            r.next = l;
            cur = l;


        }

        return Dummy.next;
    }
}
