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
    static int gcd(ListNode temp, ListNode nex){
        int min = Math.min(temp.val, nex.val);
        while(temp.val % min != 0 || nex.val % min != 0){
            min--;
        }
        return min;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode dum = new ListNode(-1);
        ListNode temp = head;
        dum.next = temp;

        while(temp != null && temp.next != null){
         
           ListNode nex = temp.next;
           int min = gcd(temp, nex);
           ListNode to = new ListNode(min);
           temp.next = to;
           to.next = nex;
           temp = temp.next.next;

        } 
        return dum.next;
    }
}