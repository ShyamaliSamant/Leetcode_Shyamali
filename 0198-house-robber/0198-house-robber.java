// class Solution {
//     int dp[] ;
//     public int f(int[] nums, int i ){
//         if(i>= nums.length) return 0;

//         if(dp[i] !=-1) return dp[i];
//         int pick = nums[i] + f(nums , i+2);
//         int skip = f(nums, i+1);

//         return dp[i] = Math.max(pick,skip);
//     }
//     public int rob(int[] nums) {
//         dp = new int[nums.length];
//         Arrays.fill(dp , -1);
//         return f(nums,0);
//     }
// }
class Solution {
    public int rob(int[] nums) {
        int next = 0;      // dp[i+1]
        int nextNext = 0;  // dp[i+2]
        for (int i = nums.length - 1; i >= 0; i--) {

            int pick = nums[i] + nextNext;
            int skip = next;
            int curr = Math.max(pick, skip);
            nextNext = next;
            next = curr;
        }
        return next;
    }
}