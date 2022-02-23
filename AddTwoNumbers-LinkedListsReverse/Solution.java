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

//BETTER ALGORITHM | THE RIGHT CODE
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int list1 = 0;
        int list2 = 0;
        ListNode headL1 = l1;
        ListNode headL2 = l2;
        ListNode resultHead = new ListNode((headL1.val + headL2.val)%10);

        while(l1 != null){
            list1++;
            l1 = l1.next;
        }
        while(l2 != null){
            list2++;
            l2 = l2.next;
        }
        
        int carry = (headL1.val + headL2.val)/10;
        int result = 0;
        headL1 = headL1.next;
        headL2 = headL2.next;
        if(Math.max(list1, list2) == list1){
            while(headL1 != null){
                if(headL2 != null){
                    result = (headL1.val + headL2.val + carry) % 10;
                    carry = (headL1.val + headL2.val + carry) / 10;
                    ListNode newNode = new ListNode(result);
                    ListNode p = resultHead;
                    while(p.next != null){
                        p = p.next;
                    }
                    p.next = newNode; 
                    headL1 = headL1.next;
                    headL2 = headL2.next;
                }
                else if(headL2 == null){
                    result = (headL1.val + 0 + carry) % 10;
                    carry = (headL1.val + 0 + carry) / 10;
                    ListNode newNode = new ListNode(result);
                    ListNode p = resultHead;
                    while(p.next != null){
                        p = p.next;
                    }
                    p.next = newNode; 
                    headL1 = headL1.next;
                }  
            }
            
        }
        else{
            while(headL2 != null){
                if(headL1 != null){
                    result = (headL1.val + headL2.val + carry) % 10;
                    carry = (headL1.val + headL2.val + carry) / 10;
                    ListNode newNode = new ListNode(result);
                    ListNode p = resultHead;
                    while(p.next != null){
                        p = p.next;
                    }
                    p.next = newNode; 
                    headL1 = headL1.next;
                    headL2 = headL2.next;
                }
                else if(headL1 == null){
                    result = (0 + headL2.val + carry) % 10;
                    carry = (0 + headL2.val + carry) / 10;
                    ListNode newNode = new ListNode(result);
                    ListNode p = resultHead;
                    while(p.next != null){
                        p = p.next;
                    }
                    p.next = newNode; 
                    headL2 = headL2.next; 
                }  
            }            
        }
        if(carry == 1){
            ListNode newNode = new ListNode(carry);
            ListNode p = resultHead;
            while(p.next != null){
                p = p.next;
            }
            p.next = newNode;
        }
        return resultHead;
    }
}
