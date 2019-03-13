//1、定义额外空间逐个储存每个节点，当出现相同节点时返回
//2、定义快慢指针，快指针一次走两步，慢指针一次走一步，快慢指针相遇时，将快指针重新指向头部，然后各自以一次一步的速度前进
//相遇时的节点即为环的入口
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead){
        ListNode fast = pHead;
        ListNode slow = pHead;
        if(pHead.next==null) return null;
        while(fast.next.next!=null && slow.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                fast = pHead;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
