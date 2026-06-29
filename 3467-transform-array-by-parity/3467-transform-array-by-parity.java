class Solution {
    public int[] transformArray(int[] nums) {
        int n =nums.length;
        int ans=0;
        for(int i=0; i<n;i++){
            ans=nums[i]%2;
            if(ans==1){
                nums[i]=1;
            }else{
                nums[i]=0;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}