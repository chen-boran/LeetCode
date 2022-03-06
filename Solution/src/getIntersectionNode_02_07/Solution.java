package getIntersectionNode_02_07;

/**
 * @author ASUS
 * @ 2022/3/6- 10:53

*/




class ListNode {
int val;
ListNode next;
ListNode(int x) {
val = x;
next = null;
}
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int La =0;
        int Lb = 0;
        ListNode tmp1=headA;
        ListNode tmp2=headB;
        while (tmp1.next!= null){

            La++;
            tmp1=tmp1.next;
        }
        while (tmp2.next!= null){
            Lb++;
            tmp2=tmp2.next;
        }

        if (Lb > La) {
            //1. swap (lenA, lenB);
            int tmpLen = La;
            La = Lb;
            Lb = tmpLen;
            //2. swap (curA, curB);
            ListNode tmpNode = tmp1;
            tmp1 = tmp2;
            tmp2 = tmpNode;
        }
        int gap = La-Lb;
        // 让curA和curB在同一起点上（末尾位置对齐）
        while (gap-- > 0) {
            tmp1 = tmp1.next;
        }

        // 遍历curA 和 curB，遇到相同则直接返回
        while (tmp1 != null) {
            if (tmp1 == tmp2) {
                return tmp1;
            }
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }
        return null;
    }


}
