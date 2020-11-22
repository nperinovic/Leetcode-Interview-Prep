// Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes oExample 2:

// Input: l1 = [], l2 = []
// Output: []
// Example 3:

// Input: l1 = [], l2 = [0]
// Output: [0]

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;
        if(l1 == null && l2 == null) {
            return null;
        }
        else if(l1 == null && l2 != null) {
            return l2;
        }
        else if(l1 != null && l2 == null) {
            return l1;
        }
        
        if(head == null && l1.val < l2.val) {
                head = l1;
                l1 = l1.next;
                temp = head;
        }
        else if(head == null && l2.val <= l1.val) {
            head = l2; 
            l2 = l2.next;
            temp = head;
        }
        
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
            else if(l2.val <= l1.val) {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        
        if(l1 == null) {
            temp.next = l2;
        }
        else if(l2 == null) {
            temp.next = l1;
        }
        
        return head;
    }
}