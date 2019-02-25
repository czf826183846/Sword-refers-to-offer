//先反转链表，并遍历反转后的链表将结果存入ArrayList。反转链表的过程中，采用创建新节点。
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode prev = null;
        while(listNode!=null){
            ListNode curr = new ListNode(listNode.val);
            curr.next = prev;
            prev = curr;
            listNode = listNode.next;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(prev!=null){
            res.add(prev.val);
            prev = prev.next;
        }
        return res;
    }
}
