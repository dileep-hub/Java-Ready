/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        int l = 0;

        
        // find length
        while (fast!=null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                    l = length;
                } while (temp != slow);
                break;
                // l = length;
            }
        }
        
        if(l == 0) {
            return null;
        }
        
        // find cycle start
        ListNode fn = head;
        ListNode sn = head;
        
        while (l>0) {
            sn = sn.next;
            l--;
        }
        
        while (fn != sn) {
            fn = fn.next;
            sn = sn.next;
        }
        
        return fn;
        
    }
}
