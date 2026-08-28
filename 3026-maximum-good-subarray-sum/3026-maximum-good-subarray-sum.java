class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       long prefixsum =0;
       long maxSum = Long.MIN_VALUE;
       HashMap<Integer,Long> map = new HashMap<>();
       for(int i =0; i<nums.length; i++){
        if(map.getOrDefault(nums[i] , Long.MAX_VALUE)>prefixsum){
            map.put(nums[i] , prefixsum);
        }
        prefixsum +=nums[i];
        if(map.containsKey(nums[i]-k)){
            maxSum = Math.max(maxSum,prefixsum-map.get(nums[i]-k));
        }
        if(map.containsKey(nums[i]+k)){
            maxSum = Math.max(maxSum, prefixsum-map.get(nums[i]+k));
        }
       }
       return maxSum==Long.MIN_VALUE ? 0 : maxSum;
    }
}