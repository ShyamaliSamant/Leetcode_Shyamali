class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n= nums.length;
       int[] prefix = new int[n+1];
       for(int[] q:queries){
        int l=q[0];
        int r=q[1];

        prefix[l]++;
        if(r+1<n) prefix[r+1]--;
       }
       int op=0;
       for(int i=0; i<n; i++){
        op+=prefix[i];
        if(op<nums[i]) return false;
       }
       return true;
    }

}