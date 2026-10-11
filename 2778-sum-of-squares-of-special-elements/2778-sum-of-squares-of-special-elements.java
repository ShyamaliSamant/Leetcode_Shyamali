class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans =0;
        for(int i =0; i<n; i++){
            if(n%(i+1) ==0){
                int val = nums[i] *nums[i];
                ans += val;
            }
        }
        return ans;
    }
}