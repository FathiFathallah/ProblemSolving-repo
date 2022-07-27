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
        Queue < ListNode > queue = new LinkedList < ListNode > ();

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                queue.offer(list1);
                list1 = list1.next;
            } else {
                queue.offer(list2);
                list2 = list2.next;
            }
        }
        while (list2 != null) {
            queue.offer(list2);
            list2 = list2.next;
        }
        while (list1 != null) {
            queue.offer(list1);
            list1 = list1.next;
        }

        ListNode head = queue.poll();
        ListNode p = head;
        for (ListNode list: queue) {
            p.next = list;
            p = p.next;
        }
        return head;
    }
}
