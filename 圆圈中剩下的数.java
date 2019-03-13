//通过环形链表的数据结构来实现
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if((n==0)&&(m==0)) return -1;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for(int i = 1; i < n; i++){
            ListNode node = new ListNode(i);
            curr.next = node;
            curr = curr.next;
        }
        curr.next = head;
        while(head.next != head){
            for(int i = 0; i < m - 2; i++){
                head = head.next;
            }
            head.next = head.next.next;
            head = head.next;
        }
        return head.val;
    }
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

//数学方法
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0) return -1; 
           
       int s=0; 
       for(int i=2;i<=n;i++){
           s=(s+m)%i; 
       } 
       return s; 
 
    }
}
