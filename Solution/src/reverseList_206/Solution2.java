package reverseList_206;

/**
 * @author ASUS
 * @ 2022/3/2- 10:19
 */
// 方法2，使用递归的方法。
class Solutio2 {
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode prev, ListNode cur) {

        ListNode temp = null;
        temp = cur.next;// 先保存下一个节点
        cur.next = prev;// 反转
        // 更新prev、cur位置
         prev = cur;
         cur = temp;
        return reverse(prev, cur);
    }
}
