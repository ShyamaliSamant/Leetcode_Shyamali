class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=1;
        while(l<nums.length){
            if(nums[l]==nums[r]){
                return nums[l];
            }
            l++;
            r++;
        }
        return -1;
    }
}