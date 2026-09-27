class Solution {
    public int maxProfit(int[] nums) {
         int maxPrice =0;
        int minprice =nums[0];
        for(int i =1; i<nums.length; i++){
           int profit = nums[i] -minprice;
            
            maxPrice = Math.max(profit, maxPrice);
            minprice =  Math.min(nums[i],minprice);
        }
        return maxPrice;
    }
}