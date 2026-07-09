class Solution {
    public int longestOnes(int[] nums, int k) {
        int n =nums.length;
        int start=0;
        int max=0;
        for(int end=0; end<n; end++){
            if(nums[end]==0) k--;
        while(k<0){
            if(nums[start]==0) k++;
            start++;
        }
        max= Math.max(max, end-start+1);
        }
        return max;
    }
}