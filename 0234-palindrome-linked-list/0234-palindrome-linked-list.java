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
      ListNode curr =head;
      ListNode prev = null;
      ListNode root = null;
      while(curr !=null){
         ListNode newList = new ListNode(curr.val);
        newList.next = root;
        root = newList;
        curr = curr.next;
      }
       ListNode p1 = head;
        ListNode p2 = root;

        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }

            p1 = p1.next;
            p2 = p2.next;
        } 
    return true;
    }
}