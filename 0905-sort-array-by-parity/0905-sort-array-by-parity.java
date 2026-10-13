class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int m = 0;
        int r = nums.length - 1;
    
        while (m <= r) {
            if (nums[m] % 2 == 0) {
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
                l++;
                m++;
            } 
            else {
                int temp = nums[m];
                nums[m] = nums[r];
                nums[r] = temp;
                r--;
            }
        }
        return nums;
    }
}