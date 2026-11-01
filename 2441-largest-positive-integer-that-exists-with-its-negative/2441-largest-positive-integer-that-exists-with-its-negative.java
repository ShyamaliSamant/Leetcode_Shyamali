class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i= 0;
        int ans =-1;
        while(i<nums.length){
        for(int j=nums.length-1; j>=0; j--){
            if(nums[i] == -nums[j]){
                ans = nums[i];
            }
        }
        i++;
        }
        return ans;
    }
}