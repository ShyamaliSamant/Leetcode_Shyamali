class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        long score=0;
        for(int i =0; i<n; i++){
            if(nums[i]<0) {
                ans[i] = Math.abs(nums[i]);
            }else{
            ans[i]= nums[i];
            }
        }
        Arrays.sort(ans);
       int mid = ans.length/2;
       
       for(int i=ans.length-1; i>=mid; i--){
        score += ans[i]*ans[i];
       }
       int i=0;
       while(i <=mid-1){
        score -= ans[i]*ans[i];
        i++;
       }
        return  score;
    }
}