/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        int countA = 0;
        ListNode b = headB;
        int countB = 0;

        while(a != null){
            countA++;
            a = a.next;
        }
        while(b != null){
            countB++;
            b = b.next;
        }

        int len = Math.abs(countA - countB);
        a = headA;
        b = headB;
        if(countA > countB){
            for(int i=0; i<len; i++){
                a = a.next;
            }
        }
        else{
            for(int i=0; i<len; i++){
                b = b.next;
            }
        }


        while(a != null && b != null){
            if(a == b){
                return a;
            }

            a = a.next;
            b = b.next;
        }

        return null;
    }
}