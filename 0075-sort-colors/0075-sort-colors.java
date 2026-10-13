class Solution {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int r = nums.length - 1;

        while (m <= r) {
            if (nums[m] == 0) {
                swap(nums, l, m);
                l++;
                m++;
            } 
            else if (nums[m] == 2) {
                swap(nums, m, r);
                r--;
            } 
            else {
                m++;
            }
        }
    }
}