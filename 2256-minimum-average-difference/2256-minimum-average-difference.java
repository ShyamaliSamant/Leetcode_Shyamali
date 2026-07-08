class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n= nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
           sum+=nums[i];
        }
         long curr_Sum = 0;
        long min =Long.MAX_VALUE;
        int ans =0;
        for(int i=0; i<n; i++){
            curr_Sum +=nums[i];
            long rightSum = sum-curr_Sum;
             long avgleft =curr_Sum/(i+1);
             long avgRight=0;
              if (i != n - 1) {
                avgRight = rightSum / (n - i - 1);
            }
            long diff=  Math.abs(avgleft-avgRight);
            if(diff<min){
                min=diff;
                ans=i;
            }
        }
        return ans;
    }
}