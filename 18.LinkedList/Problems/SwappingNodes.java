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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode last = head;
        ListNode nxt = head;
        while (k > 1) {
            nxt = nxt.next;
            k--;
        }
        ListNode front = nxt;
        while (nxt.next != null) {
            nxt = nxt.next;
            last = last.next;
        }
        last.val = front.val + last.val - (front.val=last.val); 
        return head;
        
    }
}
