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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head, p;
        if (list1 == null && list2 == null) return list1;
        if (list1 == null) return list2;
        if (list2 == null) return list1;



        if (list1.val <= list2.val) {
            head = list1;
            p = head;
            list1 = list1.next;
        } else {
            head = list2;
            p = head;
            list2 = list2.next;
        }



        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                p.next = list1;
                p = p.next;
                list1 = list1.next;
            } else {
                p.next = list2;
                p = p.next;
                list2 = list2.next;
            }
        }

        while (list2 != null) {
            p.next = list2;
            p = p.next;
            list2 = list2.next;
        }
        while (list1 != null) {
            p.next = list1;
            p = p.next;
            list1 = list1.next;
        }
        return head;
    }
}