class Solution {
    public List<Integer> minSubsequence(int[] nums) {
         Arrays.sort(nums);
        int total =0;
        List<Integer> ans = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            total += nums[i];
        }
       
       int sum =0;
        for(int i =nums.length-1; i>=0; i--){
            ans.add(nums[i]);
            sum += nums[i]; 
            if(sum > total-sum){
            break;
        }
        }
        return ans;
    }
}