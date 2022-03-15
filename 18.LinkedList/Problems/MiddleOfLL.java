// link : https://leetcode.com/problems/middle-of-the-linked-list/

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
    public ListNode middleNode(ListNode head) {
        
        //method 1
        
//         ListNode f = head;
//         ListNode l = head;
//         int length=0;
        
//         while(l.next != null) {
//             l = l.next;
//             length++;
//         }
        
//         if(length%2 == 0) {
//             length = length/2;
//             while(length > 0) {
//                 f = f.next;
//                 length--;
//             }
//             return f;
//         } else {
//             length = length/2;
//             while(length >= 0) {
//                 f = f.next;
//                 length--;
//             }
//             return f;
//         }
        
        // method 2
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
        
    }
}
