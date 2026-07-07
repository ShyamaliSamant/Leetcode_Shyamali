class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n =arr.length;
        int ans=0;
       for(int l=0;l<n; l++){
           int sum =0;
          
        for(int r = l; r<n; r++){
            sum +=arr[r];
            int len = r-l+1;
            if(len%2!=0) ans+=sum;

        }
        }
        return ans;
    }
}