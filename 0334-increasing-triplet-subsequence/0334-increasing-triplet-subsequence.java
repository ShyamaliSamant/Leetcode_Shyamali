class Solution {
    public boolean increasingTriplet(int[] nums) {
        int max=Integer.MAX_VALUE;
        int max2 =Integer.MAX_VALUE;
       for(int i=0; i<nums.length; i++){
        if(nums[i]<=max){
            max=nums[i];
        }
        else if(nums[i]<=max2){
            max2=nums[i];
        }
        else {
         return true;
       }
       }
       return false;
    }
}