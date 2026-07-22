class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        
        long window = 0;
        int left =0;
        int ans =1;
        for(int right =0; right<nums.length; right++){
            window+= nums[right];
             while ((long) nums[right] * (right - left + 1) - window > k) {
                window -=nums[left];
                left++;
             }
             ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}