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
    public ListNode middleNode(ListNode head) {
       ListNode slow = head;
        ListNode fast = head;
        
        // Fast pointer moves 2x speed. When it reaches the end, slow is at the middle.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow; // 'slow' is now at the (second) middle node
    }

    // Helper method to print the list from the given node to the end
    public static void printList(ListNode node) {
        System.out.print("[");
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(", ");
            }
            node = node.next;
        }
        System.out.println("]");
    }
}