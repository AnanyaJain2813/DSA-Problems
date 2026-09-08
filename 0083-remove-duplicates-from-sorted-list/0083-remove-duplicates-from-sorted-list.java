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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode slow = head;
        while(slow != null && slow.next != null){
            ListNode fut = slow.next;
            if(slow.val == fut.val){
                slow.next = slow.next.next;
                fut.next = null;
            }
               else slow = slow.next;
        }
        return head;
    }
}