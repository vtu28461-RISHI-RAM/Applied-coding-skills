class Solution:
    def reverse(self, x: int) -> int:
        rev = 0

        if x < 0:
            x = -x

            while x != 0:
                rem = x % 10
                rev = rev * 10 + rem
                x //= 10

            rev = -rev

        else:
            while x != 0:
                rem = x % 10
                rev = rev * 10 + rem
                x //= 10

        if rev < -(2**31) or rev > (2**31 - 1):
            return 0

        return rev