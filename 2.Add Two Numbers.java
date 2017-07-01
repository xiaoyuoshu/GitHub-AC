/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode for_return = new ListNode(0);
        ListNode for_create = for_return;
        int tag=0;
        while(l1 != null || l2!=null){
            if(l1 != null){
                tag += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                tag += l2.val;
                l2 = l2.next;
            }
            for_create.next = new ListNode(tag % 10);
            tag /= 10;
            for_create = for_create.next;
        }
        if(tag != 0) for_create.next = new ListNode(1);
        return for_return.next;
    }
}