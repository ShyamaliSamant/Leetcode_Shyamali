class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i= 0;
        while(i<nums.length){
        for(int j=nums.length-1; j>=0; j--){
            if(nums[i] == -nums[j]){
               return nums[j];
            }
        }
        i++;
        }
        return -1;
    }
}