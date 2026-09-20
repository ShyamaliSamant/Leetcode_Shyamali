class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ans =0;
        if(numOnes>=k) return k;
        else{
             ans = numOnes;
          int val = k-ans;
          if(val>=numZeros){
            val = val-numZeros;
            ans = ans -val;
          }
        //   if(val <=numZeros){
        //      ans = 
        //   }
        }
        return ans;
    }
}