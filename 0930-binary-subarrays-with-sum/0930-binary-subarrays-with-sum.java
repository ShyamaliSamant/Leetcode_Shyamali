class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    public int atMost(int[] nums, int goal) {
    int n=nums.length;
      int sum=0;
      int count=0;  
      int l=0;
      if(goal<0)return 0;
       for (int r = 0; r < n; r++) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}