class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        while(i<nums.length){
            int count =1;
            while(i+1<nums.length && nums[i+1] ==nums[i]){
                count++;
                i++;
            }
            if(count==1){
                return nums[i];
            }
            i++;
        }
        return -1;
    }
}