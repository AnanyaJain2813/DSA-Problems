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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int cnt = 0;
        // if(head.next == null && n == 1) return null;

        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        int c = cnt - n;
        
        if(c == 0){
            return head.next;
        }

        temp = head;
        for(int i = 1; i < c; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }
}