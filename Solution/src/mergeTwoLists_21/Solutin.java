package mergeTwoLists_21;



/**
 * @author ASUS
 * @ 2021/11/17- 11:11
 */


public class Solutin {


    public class ListNode {
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode Dummy = new ListNode();
        ListNode tmp = Dummy;
        //此处不能够使用||，当L1 L2 任何一个为空，while中调用其值都会出现空指针异常，后续可以加两个判断
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                tmp.next = new ListNode(l2.val);
                tmp =tmp.next;
                l2 = l2.next;

            } else {
                tmp.next = new ListNode(l1.val);//注意链表的相关操作
                tmp.next.val = l1.val;
                l1 = l1.next;
            }
        }
        if(l1!=null)tmp.next=l1;
        if(l2!=null)tmp.next=l2;
        return Dummy.next;
    }

}
