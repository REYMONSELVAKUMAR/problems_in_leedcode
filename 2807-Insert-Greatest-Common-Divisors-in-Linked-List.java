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
    int gcd(int a,int b){
        if(b==0)return a;
       return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)return head;
        ListNode t1=head;
        ListNode t2=head.next;
        while(t1.next!=null){
            ListNode n=new ListNode();
            n.val=gcd(t1.val,t2.val);
            t1.next=n;
            n.next=t2;
            t1=t2;
            t2=t2.next;
        }
        return head;
    }
}