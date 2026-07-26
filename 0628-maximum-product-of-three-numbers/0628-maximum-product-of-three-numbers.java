class Solution {
    public int maximumProduct(int[] nums) {
        int result =0;
        Arrays.sort(nums);
           int result1= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
           int val2= nums[0]*nums[1]*nums[nums.length-1];
           result = Math.max(result1,val2);
    return result;
    }
}