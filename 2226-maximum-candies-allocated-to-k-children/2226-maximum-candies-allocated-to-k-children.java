class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n=candies.length;
        long sum=0;
        int high=0;
        for(int num:candies){
            sum+=num;
             high = Math.max(high,num);
        }
        if(sum<k) return 0;
        int low=1;
        int ans=0;
         while(low<=high){
        int mid= low+(high-low)/2;
           long number=0;
            for(int pile : candies){
                number += pile/mid;
            }
            if(number>=k){
                ans=mid;
                low = mid + 1;
                
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}