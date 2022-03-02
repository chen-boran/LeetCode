package removeNthFromEnd_019;

/**
 * @author ASUS
 * @ 2021/11/17- 15:39
 **/

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
//使用遍历函数获取链表的长度，需要遍历多次，不是进阶
public class Solution {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int length = getLength(head);
        ListNode tmp = dummy;
        for (int i = 0; i < length-n; i++) {
            //因为dummy是虚拟头结点因此要多往后移动一次。即：length-n
            tmp = tmp.next;
        }
        tmp.next=tmp.next.next;

        return dummy.next;
    }

    public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return  length;
    }
}