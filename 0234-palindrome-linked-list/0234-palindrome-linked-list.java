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
    public boolean isPalindrome(ListNode head) {
        if( head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;// middle;
        }
        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode first = head;
        ListNode sec = prev;
        while(sec != null){
            if(first.val != sec.val) return false;

            first = first.next;
            sec = sec.next;
        }
        return true;
    }
}