/* Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Input: head = [1,2]
Output: [2,1]

Input: head = []
Output: [] */

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
    //iterative solution
	
		//temp node = current head val;
        //temp.next= result node;
        //assign the reverse node wih the temp n change the head to next
		
    public ListNode reverseList(ListNode head) {
		
		ListNode reverse=null;
       
         while( head != null){
                ListNode temp = new ListNode(head.val);
                temp.next=res;
                reverse=temp;
                head=head.next;
            }
        
        return reverse;
    }

    //recursive solution

    public ListNode reverseList(ListNode head) {
       
       if(head == null || head.next == null ){
           return head;
       }
       ListNode nextNode=head.next;
       head.next=null;
       ListNode reverse = reverseList(nextNode);
       nextNode.next=head;
       return reverse;
    }
}