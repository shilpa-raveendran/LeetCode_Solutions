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
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node..

Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node. */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //if head equals null then return null
        if(head == null){
            return null;
        }
        //using fast- slow approach, where slow ptr moves 1 node 
        //and fast moves two nodes in each iteration
        //Iterate untill fast reaches the end of the list or slow and fast meets each other
        ListNode slow= head;
        ListNode fast= head;
        while(fast != null && fast.next != null ){
            slow=slow.next;
            fast=fast.next.next;

            // If slow == fast that means there is a cycle 
            //and reset the slow to head
            //Now both slow and fast moves 1 nodes until they meet again. 
            //The node where they meet is the starting point of the cycle.
            if( slow == fast){
               slow = head;
                while( slow != fast){
                    fast= fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
        
    }
}
