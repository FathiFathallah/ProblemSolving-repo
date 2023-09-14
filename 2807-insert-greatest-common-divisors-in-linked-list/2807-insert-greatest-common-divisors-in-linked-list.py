# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def gcd(self, a, b):
        if b == 0:
            return a
        else:
            return self.gcd(b, a%b)
    def insertGreatestCommonDivisors(self, head):
        p1 = head
        p2 = head.next
        while p2 != None:
            tmp = ListNode()
            p1.next = tmp
            tmp.next = p2
            tmp.val = self.gcd(p1.val, p2.val)
            p1 = p2
            p2 = p2.next
        return head