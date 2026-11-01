class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans =0;
        // int ans2=0;
        // int max = nums[n-1];
        // for(int i=0; i<n; i++){
        //     ans += max - nums[i];
        // }
        // for(int i=n-1; i>0; i--){
        //      ans2 += nums[i] - nums[0];
        // }
        //   ans = Math.min(ans, ans2);
        // return ans;
        for(int i =0; i<n; i++){
            ans += nums[i] - nums[0];
        }
        return ans;
    }
}