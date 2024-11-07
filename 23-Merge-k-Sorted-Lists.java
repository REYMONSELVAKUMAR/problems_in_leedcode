class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>q=new PriorityQueue<ListNode>((a,b)->(a.val-b.val));
        for(ListNode t:lists){
            if(t!=null)q.offer(t);
        }
        ListNode r=new ListNode();
        ListNode t=r;
        while(!q.isEmpty()){
           ListNode n=q.poll();
           r.next=n;
           r=r.next;
           if(n.next!=null){
            q.offer(n.next);
           } 
        }
        r=null;
        return t.next;
    }
}