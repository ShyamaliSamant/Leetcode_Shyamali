class Solution {
    public int minMoves(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
        int ans =0;
        int max = nums[n-1];
        for(int i=0; i<n; i++){
            ans += max - nums[i];
        }
        return ans;
    }
}