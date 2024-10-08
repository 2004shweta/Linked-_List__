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


     public ListNode reverseLinkedList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }


       ListNode newnode = reverseLinkedList(head.next);
       ListNode front=head.next;
        front.next = head;
        head.next = null;
        return newnode;
    }
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newnode=reverseLinkedList(slow);

        ListNode first=head;
        ListNode second=newnode;
        while(second!=null){
            if(first.val!=second.val){

                reverseLinkedList(newnode);

                return false;
            }
            first=first.next;
            second=second.next;
        }

        reverseLinkedList(newnode);

        return true;




    }
}
