// link: https://leetcode.com/problems/reverse-linked-list-ii/

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
        
        // method 1
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
        
        //method 2
//         if(left == right) {
//             return head;
//         }
        
//         ListNode first = head;
//         for(int i=0; i<left-2; i++) {
//             first = first.next;
//         }
        
//         ListNode last = first;
//         for(int j=left; j<=right+1; j++) {
//             last = last.next;
//         }
        
        
//         ListNode curr = first.next.next;
//         ListNode next = curr.next;
//         ListNode prev = first.next;
        
//         ListNode p = first.next;
        
//         for(int k=0; curr != null && k<right-left; k++) {
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//             next = next.next;
//         }
        
//         first.next = prev;
//         p.next = last;
        
//         return head;
        
    }
}
