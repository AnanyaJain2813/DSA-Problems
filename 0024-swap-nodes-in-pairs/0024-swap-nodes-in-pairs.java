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
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode f = head;
        ListNode s = head.next;

        while(f != null && s != null){
            f.next = s.next;
            s.next = f;
            prev.next = s;

            prev = f;
            f = f.next;
            if(f != null) s = f.next;
        }

        
        return dummy.next;
    }
}