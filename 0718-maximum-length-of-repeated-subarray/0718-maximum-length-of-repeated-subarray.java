class Solution {
    public int findLength(int[] nums1, int[] nums2) {
       int ans =0;
       for(int i=0; i<nums1.length; i++){
        for(int j =0; j<nums2.length; j++){
            int count=0;
            while((i+count)<nums1.length && (j+count) <nums2.length && nums1[i+count] == nums2[j+count]) count++;

             ans = Math.max(ans,count);
        }
       }
      
       return ans;
    }
}