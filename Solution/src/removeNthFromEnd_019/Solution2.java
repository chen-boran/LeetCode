package removeNthFromEnd_019;

import javafx.beans.binding.When;
import jdk.nashorn.internal.ir.WhileNode;

/**
 * @author ASUS
 * @ 2022/3/2- 11:05
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//大致思想是快指针先走n+1步，之后两个指针一起向后滑动，直到快指针为null，这是慢指针指向的下一节点就是要删除的节点。
public class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode slow = dummy;
        ListNode quick = dummy;
        for (int i = 0; i < n; i++) {
            quick=quick.next;

        }
        while (quick.next!=null){
            quick=quick.next;
            slow= slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;


    }
}
