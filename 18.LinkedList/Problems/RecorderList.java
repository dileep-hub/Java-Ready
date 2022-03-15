// link : https://leetcode.com/problems/reorder-list/

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
    public void reorderList(ListNode head) {
        
        if (head == null || head.next == null) {
            return;
        }
        
//         ListNode mid = middleNode(head);
//         ListNode hs = reverseList(mid);
//         ListNode hf = head;
        
        
        ListNode head1 = head;
        ListNode mid = middleNode(head);
        ListNode head2 = reverseList(mid);
        
        
        while(head1 != null && head2 != null) {
            ListNode temp = head1.next;
            head1.next = head2;
            head1 = temp;
            
            temp = head2.next;
            head2.next = head1;
            head2 = temp;
        }
        
        if(head1 != null) {
            head1.next = null;
        }
        
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
    
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}
