class Solution {
    int dp[] ;
    public int f(int[] nums, int i ){
        if(i>= nums.length) return 0;

        if(dp[i] !=-1) return dp[i];
        int pick = nums[i] + f(nums , i+2);
        int skip = f(nums, i+1);

        return dp[i] = Math.max(pick,skip);
    }
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp , -1);
        return f(nums,0);
    }
}