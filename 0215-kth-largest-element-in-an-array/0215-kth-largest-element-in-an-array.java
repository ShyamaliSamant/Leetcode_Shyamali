class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=n-1; i>=1; i--){
            return nums[n-k];
        }
        return 1;
    }
}