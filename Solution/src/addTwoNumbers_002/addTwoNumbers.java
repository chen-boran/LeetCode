package addTwoNumbers_002;

/**
 * @author ASUS
 * @ 2021/11/12- 19:15
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

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode dummy = new ListNode();
        ListNode tmp = dummy;
        int t = 0;
        while (l1 != null || l2 != null || t != 0) {
            if (l1 != null) {
                t += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {

                l2 = l2.next;
                t += l2.val;
            }
            tmp=tmp.next=new ListNode(t%10);
            t/=10;
        }

        return dummy.next;
    }


}