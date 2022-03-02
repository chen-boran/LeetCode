package reverseList_206;

import java.awt.*;

/**
 * @author ASUS
 * @ 2022/3/2- 10:07
 */

//方法一：使用两个指针解决链表转换
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre =null;
        //在此不用设置虚拟头结点
        /*
        ListNode dummy = null;
        dummy.next =head;

         */
        ListNode cur=head;
        ListNode tmp;
        while (cur!=null){
            tmp = cur.next;
            cur.next =pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
        //这里返回的是pre，最后cur为空，pre指向最后一个节点
    }
     

}
