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
    public ListNode modifiedList(int[] nums, ListNode head) {
         HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (head != null && set.contains(head.val)) {
            head = head.next;
        }
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            if (set.contains(current.val)) {
                if (prev != null) {
                    prev.next = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}