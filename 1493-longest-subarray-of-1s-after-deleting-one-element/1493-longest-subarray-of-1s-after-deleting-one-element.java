class Solution {
    public int longestSubarray(int[] nums) {
        int n =nums.length;
        int start=0;
        int max=0;
        int count=0;
        for(int end=0; end<n; end++){
            if(nums[end]==0){
                count++;
            }
            while(count>1){
                if(nums[start]==0) count--;
            start++;
        }
        max= Math.max(max, end-start);
        }
        return max;
    }
}