package mergeKLists_023;

import java.util.PriorityQueue;

/**
 * @author ASUS
 * @ 2021/11/18- 15:13
 */


  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {


        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>((x,y) -> (x.val - y.val));
        //使用了优先队列来存储每个子链表的头指针，存储即可自动进行排序，省去了自行编写判断大小的步骤，降低时间复杂度
        for (int i=0; i <lists.length;i++){
            if(lists[i]!=null){
                queue.add(lists[i]);
            }
        }
        ListNode Dummy =new ListNode();
        ListNode tmp =Dummy;
        while (!(queue.isEmpty())){
            ListNode t=  queue.poll();
            tmp.next =new ListNode(t.val);
            t=t.next;
            tmp=tmp.next;
            if(t != null) queue.add(t);
        }
        return Dummy.next;
    }
}
