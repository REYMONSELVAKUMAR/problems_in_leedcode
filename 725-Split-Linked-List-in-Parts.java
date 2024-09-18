/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] a = new ListNode[k];
        int t = 0;
        ListNode h = head;
        while (h != null) {
            t++;
            h = h.next;
        }
        h = head;
        int e = t / k;
        int r = t % k;
        t = 0;
        while (k-- > 0) {
            ListNode te = h;
            ListNode d = te;
            int ce = e;
            if (r-- > 0) {
                ce++;
                while (--ce > 0 && te != null) {
                    te = te.next;
                }
                if (te == null)
                    return a;
                a[t++] = d;
                h = te.next;
                te.next = null;

            } else {
                while (--ce > 0 && te != null) {
                    te = te.next;
                }
                if (te == null)
                    return a;
                a[t++] = d;
                h = te.next;
                te.next = null;

            }

        }
        return a;

    }
}