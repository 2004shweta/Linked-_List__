/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
         if (node == null || node.next == null) {
            return;
        }

        // Copy the data from the next node to the current node
        node.val = node.next.val;
        // Point to the node after the next node
        node.next = node.next.next;

    }
}
