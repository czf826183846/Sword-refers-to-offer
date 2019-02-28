/**
 * 考虑边界情况，当k大于链表长度时，如何保证健壮性
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode node = head;
        for(int i = 0; i < k; i++){
            if(node==null) return null;
            node = node.next;
        }
        while(node!=null){
            node = node.next;
            head = head.next;
        }
        return head;
    }
