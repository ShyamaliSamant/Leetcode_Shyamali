 import java.math.BigInteger;
class Solution {
    public long gcdSum(int[] nums) {
        int n =nums.length;
        int prefixGcd[] = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            max = Math.max(nums[i],max);
          int gcd= BigInteger.valueOf(nums[i]).gcd(BigInteger.valueOf(max)).intValue();  
            prefixGcd[i]=gcd;
        }
        Arrays.sort(prefixGcd);
        int r=0;
        int l=prefixGcd.length-1;
        long ans=0;
        while(l>r){
         ans += BigInteger.valueOf(prefixGcd[r]).gcd(BigInteger.valueOf(prefixGcd[l])).intValue();
        r++;
        l--;
        }   
        return ans;
    }
}