class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        int ans =0;
        int max =0;
        if(n<=1) return 0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
             ans = nums[i]-nums[i-1];
          max = Math.max(ans,max);
        }
        return max;
    }
}