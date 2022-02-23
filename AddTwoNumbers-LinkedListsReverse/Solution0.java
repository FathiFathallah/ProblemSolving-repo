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

//VERY BAD CODING | BAD BROUCH
class Solution0 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String list1 = "";
        String list2 = "";
        while(l1 != null){
            list1 += l1.val;
            l1 = l1.next;
        }
        while(l2 != null){
            list2 += l2.val;
            l2 = l2.next;
        }
        
        char[] cList1 = list1.toCharArray();
        char tmp;
        for(int i=0; i<cList1.length/2 ; i++){
            //s[i] <-> s[ s.length - 1 - i]
            tmp = cList1[i];
            cList1[i] = cList1[cList1.length - 1 - i];
            cList1[cList1.length - 1 - i] = tmp;
        }
        list1 = String.valueOf(cList1);
        
        cList1 = list2.toCharArray();
        for(int i=0; i<cList1.length/2 ; i++){
            //s[i] <-> s[ s.length - 1 - i]
            tmp = cList1[i];
            cList1[i] = cList1[cList1.length - 1 - i];
            cList1[cList1.length - 1 - i] = tmp;
        }
        list2 = String.valueOf(cList1);
        
        Long numList1 = Long.parseLong(list1);
        Long numList2 = Long.parseLong(list2);
        String Result = numList1 + numList2 + "";
        
        cList1 = Result.toCharArray();
        for(int i=0; i<cList1.length/2 ; i++){
            //s[i] <-> s[ s.length - 1 - i]
            tmp = cList1[i];
            cList1[i] = cList1[cList1.length - 1 - i];
            cList1[cList1.length - 1 - i] = tmp;
        }
        Result = String.valueOf(cList1);
        ListNode head = new ListNode(Character.getNumericValue(Result.charAt(0)));
        ListNode p = head;
        for(int i=1;i<Result.length() ; i++){
            ListNode p1 = new ListNode(Character.getNumericValue(Result.charAt(i)));
            while(p.next != null){
                p = p.next;
            }
            p.next = p1;
            p = head;
        }
        return head;
    }
}

