class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        int l=0,r=0,dup=0;
        long sum=0,max=0;
        while(r<n){
            sum+=nums[r];
            int frq= map.getOrDefault(nums[r],0);
            if(frq==1) dup++;
            map.put(nums[r],frq+1);
            while(l<=r&&(r-l+1>k||dup>0)){
                sum-=nums[l];
                 frq= map.getOrDefault(nums[l],0);
                 frq--;
                 if(frq==1) dup--;
                 map.put(nums[l],frq);
                l++;
            }
            if(r-l+1 == k && dup==0){
                max = Math.max(max,sum);
            }
            r++;
        }
        return max;
    }
}