class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int curr=0;
        int ans=Integer.MAX_VALUE;
        if(k==1) return 0;
        for(int i=0; i<n-k+1; i++){
          curr=nums[i+k-1]-nums[i];
           ans=Math.min(curr,ans);
        }  
        return ans;
    }
}