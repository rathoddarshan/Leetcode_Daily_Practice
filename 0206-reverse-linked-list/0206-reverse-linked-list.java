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
    public ListNode reverseList(ListNode head) {

        ArrayList<Integer> res = new ArrayList<>();

        for(ListNode curr = head; curr != null; curr = curr.next) {
            res.add(curr.val);
        }

        for(ListNode curr = head; curr != null; curr = curr.next){
            curr.val = res.remove(res.size() - 1);
        }

        return head;
        
    }
}