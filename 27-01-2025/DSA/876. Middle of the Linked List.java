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
       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
        slow = slow.next; // +1 move
        fast = fast.next.next; // +2 move
       }
       return slow;
    }
}