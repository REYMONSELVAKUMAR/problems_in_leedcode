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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        int s=0,c=0;
        ListNode t=new ListNode();
        ListNode h=t;
        while(head!=null){
             if(head.val==0){
                c++;
             }
             s+=head.val;
             if(c==2){
                c=0;
                t.val=s;
                if(head.next==null)return h;
                s=0;
                 ListNode n=new ListNode();
                 t.next=n;
                 t=n;
                 continue;
             }
             head=head.next;
        }
        return h;
    }
}