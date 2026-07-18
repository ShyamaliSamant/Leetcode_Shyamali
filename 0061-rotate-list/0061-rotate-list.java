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
        if(head==null || k==0) return head;
         ListNode tail = head , Thead = head;
        int n = 1;
        while(tail.next != null) {
           tail = tail.next;
           n++;
        }
        k = k % n;
        if(k == 0)
            return head;
        k = n - k;
        for(int i = 1; i < k; ++i) {
            head = head.next;
        }
        ListNode T = head;
        head = head.next;
        T.next = null;
        tail.next = Thead;
        return head;
    }
}