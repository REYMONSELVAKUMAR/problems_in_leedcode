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
    ArrayList<Integer> l=new ArrayList<>();
    public void in(ListNode a){
        if(a==null)return;
        else{
        l.add(a.val);
        in(a.next);
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        in(list1);
        in(list2);
          Collections.sort(l);
          ListNode head=null;
           ListNode temp=null;
          
          for(int i=0;i<l.size();i++){
             ListNode j=new  ListNode(l.get(i));
            if(head==null){
                 head=j;
                 temp=j;
            }
            else{
                temp.next=j;
                temp=temp.next;
            }
          }
          System.gc();
        return head;
    }
}