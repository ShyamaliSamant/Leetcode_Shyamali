class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0;
        int r=n-1;
        int maxi=-1;
        while(l<r){
            int sum  = nums[l]+nums[r];
            maxi=Math.max(maxi,sum);
            l++;
            r--;
        }
        return maxi;
    }
}