class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        return call(nums,ans,0);
    }
    public int[] call(int[] nums, int[] ans,int i){
        if(i == nums.length)return ans;
        ans[i] = nums[nums[i]];
        return call(nums,ans,i+1);
    }
}