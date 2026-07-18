import java.math.BigInteger;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int gcd = BigInteger.valueOf(nums[0]).gcd(BigInteger.valueOf(nums[nums.length-1])).intValue();
        return gcd;
    }
}