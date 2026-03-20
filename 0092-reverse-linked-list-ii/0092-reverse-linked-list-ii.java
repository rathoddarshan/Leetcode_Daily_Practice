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

        if(head == null || left == right){
            return head;
        }
        

        ListNode Dummy = new ListNode(0);
        Dummy.next = head;

        ListNode prev = Dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode start = prev.next;
        ListNode end = start;
        for(int i = left; i < right; i++) {
            end = end.next;
        }

        ListNode nextPart = end.next;

        end.next = null;

        ListNode newHead = reverse(start);
        prev.next = newHead;
        start.next = nextPart;

        return Dummy.next;

        
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}