# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        def to_list(node):
            arr = []
            while node:
                arr.append(node.val)
                node = node.next
            return arr

        a = to_list(l1)
        b = to_list(l2)

        num1 = int("".join(map(str, a[::-1])))
        num2 = int("".join(map(str, b[::-1])))

        total = num1 + num2

        digits = list(map(int, str(total)))[::-1]

        dummy = ListNode(0)
        cur = dummy
        for d in digits:
            cur.next = ListNode(d)
            cur = cur.next

        return dummy.next

        