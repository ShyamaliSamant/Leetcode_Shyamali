class Solution {
    public int[] runningSum(int[] nums) {
        // int n= nums.length;
        // int prefix[] = new int[n+1];
        // prefix[0]=0;
        // for(int i=1;i<=n;i++){
        // prefix[i]= prefix[i-1]+nums[i-1];
        // }
        // int ans[] = new int[n];
        // for(int i=0;i<n;i++){
        // ans[i] = prefix[i + 1];
        // }
        // return ans;

        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}