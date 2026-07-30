class Solution {
    int dp[];
    public int f(int[] nums, int i, int end){
        if(i> end) return 0;
        if(dp[i] != -1) return dp[i];

        int pick = nums[i]+ f(nums,i+2,end);
        int skip = f(nums,i+1, end);
        return dp[i] = Math.max(pick , skip);
    }
    public int rob(int[] nums) {
        if(nums.length ==1) return nums[0];
       dp = new int[nums.length];
       Arrays.fill(dp, -1);
       int case1 =  f(nums , 0, nums.length-2);

       dp = new int[nums.length];
       Arrays.fill(dp , -1);
       int case2 = f(nums , 1, nums.length-1);

       return Math.max(case1 , case2);
    }
}