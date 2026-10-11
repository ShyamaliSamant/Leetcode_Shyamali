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
    public ListNode partition(ListNode head, int x) {
        ListNode lessD = new ListNode(0);
        ListNode greaterD = new ListNode(0);

        ListNode curr = head;
        ListNode less = lessD;
        ListNode greater = greaterD;
        while(curr != null){
            if(curr.val >= x){
                greater.next = curr;
                greater = greater.next;
            }else{
                less.next = curr;
                less = less.next;
            }
            curr = curr.next;
        }
        greater.next =null;
        less.next = greaterD.next;

        return lessD.next;
    }
}