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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null) return head;
        // ListNode dummy  = new ListNode(0);
        // dummy.next = head;
        // ListNode p = dummy;

        // for(int i = 0; i < left - 1; i++){
        //     p = p.next;
        // }
     
        // ListNode curr = p.next;
        // ListNode st = curr;
        // ListNode prev = null;

        // for(int i = left; i <= right; i++){
        //     ListNode next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // p.next = prev;
        // st.next = curr;

        // return dummy.next;
        if(head == null || head.next == null)return head; 

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        
        for(int i = 0; i < left - 1; i++){
            temp = temp.next;
        }

        ListNode curr = temp.next;
        ListNode A = curr;

        ListNode prev = null;
         for(int i = left; i <= right; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        temp.next = prev;
        A.next = curr;

        return dummy.next;

        
    }
}