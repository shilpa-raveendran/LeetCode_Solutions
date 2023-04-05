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
 
 /* Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list. */ 

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow=head;
        ListNode fast= head;
        while(fast != null && fast.next != null){

            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast){

                slow= head;
                while(slow != fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return true;
            }

        }
        return false;
    }
}
