// link: https://leetcode.com/problems/rotate-list/

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
    public ListNode rotateRight(ListNode head, int k) {
        
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        
        int count = 1;
        ListNode last = head;
        
        while(last.next != null) {
            last = last.next;
            count++;
        }
        
        k = k % count;
        
        if(k == 0) {
            return head;
        }
        
        ListNode end = head;
        for(int i=0; i<count-k-1; i++) {
            end = end.next;
        }
        
        ListNode ans = end.next;
         end.next = null;
        last.next = head;
        
        return ans;
    }
}
