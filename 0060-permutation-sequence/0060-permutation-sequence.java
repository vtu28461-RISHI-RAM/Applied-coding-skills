
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        k--;
        StringBuilder result = new StringBuilder();
        for (int i = n; i > 0; i--) {
            fact = fact / i;         
            int index = k / fact;     
            result.append(nums.get(index));
            nums.remove(index);
            k = k % fact;
        }
        return result.toString();
    }
}
