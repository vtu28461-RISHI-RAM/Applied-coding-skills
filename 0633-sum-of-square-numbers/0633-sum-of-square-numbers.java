class Solution {
    public boolean judgeSquareSum(int c) {
        if (c == 0) return true;

        long a = 0;
        double n = c;
        while (true) {
            double next = (n + c / n) / 2;
            if (Math.abs(n - next) < 1e-6) break;
            n = next;
        }

        long b = (long) n;

        while (a <= b) {
            long sum = a * a + b * b;

            if (sum == c) {
                return true;
            } else if (sum < c) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }
}
