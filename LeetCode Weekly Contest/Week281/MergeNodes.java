package com.dileep.Week281;

public class MergeNodes {
    public static void main(String[] args) {

    }

    public ListNode mergeNodes(ListNode head) {

        int sum = 0;
        ListNode ans;
        ListNode start = head;
        ListNode end  = head;
        while (end != null || end.val != 0) {
            end = end.next;
            if(end.val == 0) {
                while (start != end) {
                    sum += start.val;
                    start = start.next;

                }
            }
        }
return end;





    }

}
