class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
     int n= nums.length;
     int maxlen=0;
     int dup=0;
     int l=0,r=0;
     HashMap<Integer,Integer> map = new HashMap<>();
     while(r<n){
        int frq = map.getOrDefault(nums[r],0);
        if(frq==k) dup++;
        map.put(nums[r],frq+1);
        while(l<=r && dup>0){
            frq= map.getOrDefault(nums[l],0);
            frq--;
            if(frq==k) dup--;
            map.put(nums[l],frq);
            l++;
        }
        if(dup==0) maxlen=Math.max(r-l+1,maxlen);
        r++;
     }   
     return maxlen;
    }
}