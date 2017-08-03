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
    public boolean hasCycle(ListNode head) {
        ListNode one_step = head;
        ListNode two_step = head;
        while(two_step != null && two_step.next != null){
            one_step = one_step.next;
            two_step = two_step.next.next;
            if(one_step == two_step){
                return true;
            }
        }
        return false;
    }
}